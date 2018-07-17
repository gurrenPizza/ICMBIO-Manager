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

/**
 * @version 5.0 - 08/07
 * @author Turma INF161 Grupo Saída - Alberto Figuerêdo, Ariane Sales, Felipe
 * Viana, Laura Fidalgo e Phillipe Loriot de Rouvray
 */
public class SaidaDAO {

    static Connection conexao = retornarConexao();

    public static void insereSaida(Integer numSaida, Integer numVisitantes, String mes, String ano, String codigosolicitacao) {
        try {
            PreparedStatement inserir = retornarConexao().prepareStatement("insert into saida(numero_saidas,numero_visitantes,mes,ano,codigo_solicitacao) values(?,?,?,?,?)");
            inserir.setInt(1, numSaida);
            inserir.setInt(2, numVisitantes);
            inserir.setString(3, mes);
            inserir.setString(4, ano);
            inserir.setInt(5, Integer.parseInt(codigosolicitacao));
            inserir.execute();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void alteraSaida(Integer numSaida, Integer numVisitantes, String mes, String ano, Integer cod_saida) {
        try {
            PreparedStatement alterar = BancoDeDados.retornarConexao().prepareStatement("update saida set numero_saidas=?, numero_visitantes=?, mes=?, ano=? where codigo_saida=" + cod_saida);
            alterar.setInt(1, numSaida);
            alterar.setInt(2, numVisitantes);
            alterar.setString(3, mes);
            alterar.setString(4, ano);
            alterar.execute();
            alterar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void excluiSaida(Integer cod_saida) {
        try {
            PreparedStatement excluir = BancoDeDados.retornarConexao().prepareStatement("delete from saida where codigo_saida=" + cod_saida);
            excluir.execute();
            excluir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Consultar(String a, JTable b, String atributo) {
        try {
            PreparedStatement pesquisa = conexao.prepareStatement("select * from saida where " + atributo + " like ? order by " + atributo);
            pesquisa.setString(1, a + "%");
            ResultSet resultado = pesquisa.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getInt("codigo_saida"), SolicitacaoDAO.Buscar("codigo_solicitacao", resultado.getString("codigo_solicitacao")), resultado.getInt("numero_saidas"), resultado.getInt("numero_visitantes"), resultado.getString("mes"), resultado.getString("ano"),});
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void PegarDados(String codigo, JTextField txtNumSaida, JTextField txtNumVisitantes, JTextField txtMes, JTextField txtAno) {
        try {
            PreparedStatement pesquisa = conexao.prepareStatement("select * from saida where codigo_saida = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNumSaida.setText(resultado.getString("numero_saidas"));
                txtNumVisitantes.setText(resultado.getString("sequencia_anual"));
                txtMes.setText(resultado.getString("status"));
                txtAno.setText(resultado.getString("motivo"));
                //txtNome.setText(resultado.getString(""));
                //txtNome2.setText(resultado.getString(""));
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
