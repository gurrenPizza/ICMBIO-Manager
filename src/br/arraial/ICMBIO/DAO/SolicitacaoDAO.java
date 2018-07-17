package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SolicitacaoDAO {

    static Connection conexao;

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            conexao = retornarConexao();
            PreparedStatement consulta = conexao.prepareStatement("Select * from solicitacao where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a + "%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitacao"), resultado.getString("numero_processo"),
                    resultado.getString("status")//, resultado.getString("")
                });
            }
            consulta.close();
            resultado.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void Cadastrar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            conexao = retornarConexao();
            PreparedStatement inserir = conexao.prepareStatement("insert into solicitacao(numero_processo, sequencia_anual,status, motivo, codigo_solicitante, codigo_embarcacao) values(?,?,?,?,?,?)");
            inserir.setString(1, numeroprocesso);
            inserir.setString(2, sequenciaanual);
            inserir.setString(3, status);
            inserir.setString(4, motivo);
            inserir.setString(5, codigosolicitante);
            inserir.setString(6, codigoembarcacao);
            inserir.executeUpdate();
            inserir.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Alterar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        try {
            conexao = retornarConexao();
            PreparedStatement alterar = conexao.prepareStatement("update solicitacao set numero_processo=?, sequencia_anual=?, status=?, motivo=?");
            alterar.setString(1, numeroprocesso);
            alterar.setString(2, sequenciaanual);
            alterar.setString(3, status);
            alterar.setString(4, motivo);
            alterar.setString(5, codigosolicitante);
            alterar.setString(6, codigoembarcacao);
            alterar.executeUpdate();
            alterar.close();
            conexao.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void Excluir(String codigo) {
        try {
            conexao = retornarConexao();
            PreparedStatement deletar = conexao.prepareStatement("delete from solicitacao where codigo_solicitacao = " + codigo);
            deletar.executeUpdate();
            deletar.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void PegarDados(String codigo, JTextField txtNumero, JTextField txtSequencia, JTextField txtStatus, JTextArea txtmotivo/*, String nomesol, JTextField txtNome, String nomeemb, JTextField txtNome2*/) {
        try {
            conexao = retornarConexao();
            PreparedStatement pesquisa = conexao.prepareStatement("select * from solicitacao where codigo_solicitacao = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNumero.setText(resultado.getString("numero_processo"));
                txtSequencia.setText(resultado.getString("sequencia_anual"));
                txtStatus.setText(resultado.getString("status"));
                txtmotivo.setText(resultado.getString("motivo"));
                //txtNome.setText(resultado.getString(""));
                //txtNome2.setText(resultado.getString(""));
            }
            resultado.close();
            pesquisa.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
