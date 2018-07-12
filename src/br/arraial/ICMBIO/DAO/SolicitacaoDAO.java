package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Turma INF161
 *
 */
public class SolicitacaoDAO {

    public static void consultaSolicitacoes(String a, JTable b, String atributo) {

        try {
            Connection conexao = BancoDeDados.retornarConexao();

            PreparedStatement consulta = conexao.prepareStatement("Select * from solicitacao where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a);
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("numero_processo"), resultado.getString("motivo"),
                    resultado.getString("status"), resultado.getString("sequencia_anual")
                });
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro não encontrado!");
        }

    }

    public static void SolicitacaoCadastrar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement inserir = conexao.prepareStatement("insert into embarcacao(nome_embarcacao, tie, nome_proprietario, numero_passageiros, tamanho_embarcacao, capacidade_passageiros, local, obs, codigo_modalidade) values(?,?,?,?,?,?,?,?,?)");
            inserir.setString(1, numeroprocesso);
            inserir.setString(2, sequenciaanual);
            inserir.setString(3, status);
            inserir.setString(4, motivo);
            inserir.setString(5, codigosolicitante);
            inserir.setString(6, codigoembarcacao);
            inserir.execute();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void SolicitacaoAlterar(String numeroprocesso, String sequenciaanual, String status, String motivo, String codigosolicitante, String codigoembarcacao) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement alterar = conexao.prepareStatement("update solicitacao set numero_processo=?, sequencia_anual=?, status=?, motivo=?");
            alterar.setString(1, numeroprocesso);
            alterar.setString(2, sequenciaanual);
            alterar.setString(3, status);
            alterar.setString(4, motivo);
            alterar.setString(5, codigosolicitante);
            alterar.setString(6, codigoembarcacao);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
     public static void SolicitacaoExcluir(String codigo){
         Connection conexao = BancoDeDados.retornarConexao();
        try{         
          PreparedStatement deletar = conexao.prepareStatement("delete from solicitacao where codigo_solicitacao = "+codigo);
          deletar.executeUpdate();
          deletar.execute();
          deletar.close();
            } catch (SQLException ex) {
                System.out.println(ex);           
        }
     }
}
