
package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public static void Cadastrar(String login, String senha, String nome){
        try{
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement inserir = con.prepareStatement("insert into usuario(login,senha,nome) values (?,?,?)");
            inserir.setString(1,login);
            inserir.setString(2,senha);
            inserir.setString(3,nome);
            
            inserir.execute();
            inserir.close();
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
