package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.cadastros.TelaCadUsuario;
import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Euller Felipe
 */
public class UsuarioDAO {

    private String login;
    private String senha;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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

}
