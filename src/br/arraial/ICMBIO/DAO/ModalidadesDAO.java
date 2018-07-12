package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.cadastros.TelaCadModalidade;
import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Euller Felipe
 */
public class ModalidadesDAO {

    public static void AlterarModalidade(String codigomodalidade, String modalidade) {
        try {
            Connection conexao = BancoDeDados.retornarConexao();
            PreparedStatement alterar = conexao.prepareStatement("UPDATE modalidade SET nome_modalidade = ? where codigo_modalidade =" + codigomodalidade);
            alterar.setString(1, modalidade);
            alterar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private String modd;

    public void setModalidade(String mod) {
        this.modd = mod;
    }

    public String getModalidade() {
        return modd;
    }

    public static void CadastrarModalidade(String modal) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement inserir = con.prepareStatement("insert into modalidade(nome_modalidade) values (?)");
            inserir.setString(1, modal);
            inserir.execute();
            inserir.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro! Cadastro não realizado!");
        }
    }

}
