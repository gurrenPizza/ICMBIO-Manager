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
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            comando = conexao.prepareStatement("Select * from solicitacao where " + atributo + " like ? order by " + atributo);
            comando.setString(1, a + "%");
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitacao"), resultado.getString("numero_processo"),
                    resultado.getString("status"), SolicitanteDAO.Buscar("nome", resultado.getString("codigo_solicitante")), EmbarcacaoDAO.Buscar("nome_embarcacao", resultado.getString("codigo_embarcacao")),});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Cadastrar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            comando = conexao.prepareStatement("insert into solicitacao(numero_processo, sequencia_anual,status, motivo, codigo_solicitante, codigo_embarcacao) values(?,?,?,?,?,?)");
            comando.setString(1, numeroprocesso);
            comando.setString(2, sequenciaanual);
            comando.setString(3, status);
            comando.setString(4, motivo);
            comando.setString(5, codigosolicitante);
            comando.setString(6, codigoembarcacao);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Alterar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            comando = conexao.prepareStatement("update solicitacao set numero_processo=?, sequencia_anual=?, status=?, motivo=?");
            comando.setString(1, numeroprocesso);
            comando.setString(2, sequenciaanual);
            comando.setString(3, status);
            comando.setString(4, motivo);
            comando.setString(5, codigosolicitante);
            comando.setString(6, codigoembarcacao);
            comando.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String codigo) {
        try {
            comando = conexao.prepareStatement("delete from solicitacao where codigo_solicitacao = " + codigo);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void PegarDados(String codigo, JTextField txtNumero, JTextField txtSequencia, JTextField txtStatus, JTextArea txtmotivo, JTextField txtNome, JTextField txtNome2) {
        try {
            comando = conexao.prepareStatement("select * from solicitacao where codigo_solicitacao = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNumero.setText(resultado.getString("numero_processo"));
                txtSequencia.setText(resultado.getString("sequencia_anual"));
                txtStatus.setText(resultado.getString("status"));
                txtmotivo.setText(resultado.getString("motivo"));
                txtNome.setText(SolicitanteDAO.Buscar("nome", resultado.getString("codigo_solicitante")));
                txtNome2.setText(EmbarcacaoDAO.Buscar("nome_embarcacao", resultado.getString("codigo_embarcacao")));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            comando = conexao.prepareStatement("select " + atributo + " from solicitacao where codigo_solicitacao = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                String retorno = resultado.getString(atributo);
                resultado.close();
                return retorno;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            return null;
        }
    }
}
