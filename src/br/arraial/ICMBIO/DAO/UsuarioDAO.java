package br.arraial.ICMBIO.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Euller Felipe
 */
public class UsuarioDAO {

    public static void consultaUsuario(String a, JTable b, String atributo) {

        try {
            Connection conexao = BancoDeDados.retornarConexao();

            PreparedStatement consulta = conexao.prepareStatement("Select * from usuario where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a+"%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_usuario"), resultado.getString("login"),
                });
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void UsuarioCadastrar(String login, String senha) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement inserir = conexao.prepareStatement("insert into usuario(login, senha) values(?,?)");
            inserir.setString(1, login);
            inserir.setString(2, senha);
            inserir.execute();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void UsuarioAlterar(String login, String senha) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement alterar = conexao.prepareStatement("update usuario set login=?, senha=?");
            alterar.setString(1, login);
            alterar.setString(2, senha);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void UsuarioExcluir(String codigo) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement deletar = conexao.prepareStatement("delete from usuario where codigo_usuario = " + codigo);
            deletar.executeUpdate();
            deletar.execute();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void UsuarioPegarDados(String codigo, JTextField txtLogin, JPasswordField txtSenha, JPasswordField txtConfirma) {
        try {
            PreparedStatement pesquisa = BancoDeDados.retornarConexao().prepareStatement("select * from usuario where codigo_usuario = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtLogin.setText(resultado.getString("Login"));
                txtSenha.setText(resultado.getString("Senha"));
                txtConfirma.setText(resultado.getString("Senha"));
            }
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
