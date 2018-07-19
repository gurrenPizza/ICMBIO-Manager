package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SolicitacaoDAO {

    static Connection conexao = retornarConexao();

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            PreparedStatement consulta = conexao.prepareStatement("Select * from solicitacao where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a + "%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitacao"), resultado.getString("numero_processo"),
                    resultado.getString("status"), SolicitanteDAO.Buscar("nome", resultado.getString("codigo_solicitante")), EmbarcacaoDAO.Buscar("nome_embarcacao", resultado.getString("codigo_embarcacao")),});
            }
            consulta.close();
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Cadastrar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            PreparedStatement inserir = conexao.prepareStatement("insert into solicitacao(numero_processo, sequencia_anual,status, motivo, codigo_solicitante, codigo_embarcacao) values(?,?,?,?,?,?)");
            inserir.setString(1, numeroprocesso);
            inserir.setString(2, sequenciaanual);
            inserir.setString(3, status);
            inserir.setString(4, motivo);
            inserir.setString(5, codigosolicitante);
            inserir.setString(6, codigoembarcacao);
            inserir.executeUpdate();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Alterar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            PreparedStatement alterar = conexao.prepareStatement("update solicitacao set numero_processo=?, sequencia_anual=?, status=?, motivo=?");
            alterar.setString(1, numeroprocesso);
            alterar.setString(2, sequenciaanual);
            alterar.setString(3, status);
            alterar.setString(4, motivo);
            alterar.setString(5, codigosolicitante);
            alterar.setString(6, codigoembarcacao);
            alterar.executeUpdate();
            alterar.close();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String codigo) {
        try {
            PreparedStatement deletar = conexao.prepareStatement("delete from solicitacao where codigo_solicitacao = " + codigo);
            deletar.executeUpdate();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void PegarDados(String codigo, JTextField txtNumero, JTextField txtSequencia, JTextField txtStatus, JTextArea txtmotivo, JTextField txtNome, JTextField txtNome2) {
        try {
            PreparedStatement pesquisa = conexao.prepareStatement("select * from solicitacao where codigo_solicitacao = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNumero.setText(resultado.getString("numero_processo"));
                txtSequencia.setText(resultado.getString("sequencia_anual"));
                txtStatus.setText(resultado.getString("status"));
                txtmotivo.setText(resultado.getString("motivo"));
                txtNome.setText(SolicitanteDAO.Buscar("nome", resultado.getString("codigo_solicitante")));
                txtNome2.setText(EmbarcacaoDAO.Buscar("nome_embarcacao", resultado.getString("codigo_embarcacao")));
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            PreparedStatement pesquisa = conexao.prepareStatement("select " + atributo + " from solicitacao where codigo_solicitacao = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                String retorno = resultado.getString(atributo);
                pesquisa.close();
                resultado.close();
                return retorno;
            } else {
                pesquisa.close();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            return null;
        }
    }
}
