package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    static Connection conexao;

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            conexao = retornarConexao();
            PreparedStatement consulta = conexao.prepareStatement("Select * from usuario where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a + "%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_usuario"), resultado.getString("login"),});
            }
            consulta.close();
            resultado.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void Cadastrar(String login, String senha) {
        try {
            conexao = retornarConexao();
            PreparedStatement inserir = conexao.prepareStatement("insert into usuario(login, senha) values(?,?)");
            inserir.setString(1, login);
            inserir.setString(2, senha);
            inserir.executeUpdate();
            inserir.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Alterar(String login, String senha, String codigo) {
        try {
            conexao = retornarConexao();
            PreparedStatement alterar = conexao.prepareStatement("update usuario set login=?, senha=? where codigo_usuario=" + codigo);
            alterar.setString(1, login);
            alterar.setString(2, senha);
            alterar.executeUpdate();
            alterar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Excluir(String codigo) {
        try {
            conexao = retornarConexao();
            PreparedStatement deletar = conexao.prepareStatement("delete from usuario where codigo_usuario = " + codigo);
            deletar.executeUpdate();
            deletar.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void PegarDados(String codigo, JTextField txtLogin, JPasswordField txtSenha, JPasswordField txtConfirma) {
        try {
            conexao = retornarConexao();
            PreparedStatement pesquisa = conexao.prepareStatement("select * from usuario where codigo_usuario = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtLogin.setText(resultado.getString("Login"));
                txtSenha.setText(resultado.getString("Senha"));
                txtConfirma.setText(resultado.getString("Senha"));
            }
            pesquisa.close();
            resultado.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
