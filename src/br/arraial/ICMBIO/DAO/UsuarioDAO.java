package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.cadastros.TelaCadUsuario;
import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Euller Felipe
 */
public class UsuarioDAO {

    public static void AlterarUsuario(String codigousuario, String login, String senha) {
        try {
            Connection conexao = BancoDeDados.retornarConexao();
            PreparedStatement alterar = conexao.prepareStatement("UPDATE usuario SET login = ?, senha= ? where codigo_usuario =" + codigousuario);
            alterar.setString(1, login);
            alterar.setString(2, senha);
            alterar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void CadastrarUsuario(String login, String senha) {
        Connection con = BancoDeDados.retornarConexao();
        try {

            PreparedStatement inserir = con.prepareStatement("insert into usuario(login,senha) values (?,?)");
            inserir.setString(1, login);
            inserir.setString(2, senha);

            inserir.execute();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void UsuarioConsultar() {

    }

    public static void UsuarioPegarDados(String codigousuario, String login, JTextField txtLogin, String senha, JTextField txtSenha) {
        try {
            PreparedStatement pesquisa = BancoDeDados.retornarConexao().prepareStatement("select * from usuario where codigo_usuario=" + codigousuario);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtLogin.setText(resultado.getString("login"));
                txtSenha.setText(resultado.getString("senha"));

            }
            pesquisa.close();

        } catch (SQLException ex) {
        }
    }

    public static void UsuarioDeletar(String codigousuario) {
        try {
            PreparedStatement deletar = BancoDeDados.retornarConexao().prepareStatement("DELETE FROM usuario WHERE codigo_USUARIO=" + codigousuario);
            deletar.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
