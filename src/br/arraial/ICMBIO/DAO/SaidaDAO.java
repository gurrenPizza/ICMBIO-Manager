package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SaidaDAO {

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void Inserir(Integer numSaida, Integer numVisitantes, String mes, String ano, String codigosolicitacao) {
        try {
            comando = retornarConexao().prepareStatement("insert into saida(numero_saidas,numero_visitantes,mes,ano,codigo_solicitacao) values(?,?,?,?,?)");
            comando.setInt(1, numSaida);
            comando.setInt(2, numVisitantes);
            comando.setString(3, mes);
            comando.setString(4, ano);
            comando.setInt(5, Integer.parseInt(codigosolicitacao));
            comando.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Alterar(Integer numSaida, Integer numVisitantes, String mes, String ano, Integer cod_saida) {
        try {
            comando = BancoDeDados.retornarConexao().prepareStatement("update saida set numero_saidas=?, numero_visitantes=?, mes=?, ano=? where codigo_saida=" + cod_saida);
            comando.setInt(1, numSaida);
            comando.setInt(2, numVisitantes);
            comando.setString(3, mes);
            comando.setString(4, ano);
            comando.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String cod_saida) {
        try {
            comando = BancoDeDados.retornarConexao().prepareStatement("delete from saida where codigo_saida=" + cod_saida);
            comando.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Consultar(String a, JTable b, String atributo) {
        try {
            Integer r;
            String plshelp="";
            
            if(atributo.equals("numero_processo")){
                comando = conexao.prepareStatement("select codigo_solicitacao from solicitacao where " + atributo + " = ?");
                comando.setString(1, a);
                resultado = comando.executeQuery();
                if(resultado.next()){
                    r = resultado.getInt("codigo_solicitacao");
                    plshelp = r.toString();
                }
                atributo = "codigo_solicitacao";
            }
            
            if(!atributo.equals("codigo_solicitacao")){
                comando = conexao.prepareStatement("select * from saida where " + atributo + " like ? order by " + atributo);
                comando.setString(1, a + "%");
            }
            else{
                comando = conexao.prepareStatement("select * from saida where " + atributo + " like ? order by " + atributo);
                comando.setString(1, plshelp + "%");
            }
            
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getInt("codigo_saida"), SolicitacaoDAO.Buscar("codigo_solicitacao", resultado.getString("codigo_solicitacao")), resultado.getInt("numero_saidas"), resultado.getInt("numero_visitantes"), resultado.getString("mes"), resultado.getString("ano"),});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void PegarDados(String codigo, JTextField txtNumSaida, JTextField txtNumVisitantes, JTextField txtMes, JTextField txtAno, JTextField txtNumProc) {
        try {
            comando = conexao.prepareStatement("select * from saida where codigo_saida = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNumProc.setText(SolicitacaoDAO.Buscar("numero_processo", resultado.getString("codigo_solicitacao")));
                txtNumSaida.setText(resultado.getString("numero_saidas"));
                txtNumVisitantes.setText(resultado.getString("numero_visitantes"));
                txtMes.setText(resultado.getString("mes"));
                txtAno.setText(resultado.getString("ano"));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }
}
