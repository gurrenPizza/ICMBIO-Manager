package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;
    
    public static void Consultar(String a, JTable b, String atributo) {

        try {
            comando = conexao.prepareStatement("Select * from usuario where est=0 and " + atributo + " like ? order by " + atributo);
            comando.setString(1, a + "%");
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_usuario"), resultado.getString("login"),});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }

    }

    public static void Cadastrar(String login, String senha) {
        try {
            comando = conexao.prepareStatement("insert into usuario(login, senha) values(?,?)");
            comando.setString(1, login);
            comando.setString(2, senha);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }

    public static void Alterar(String login, String senha, String codigo) {
        try {
            comando = conexao.prepareStatement("update usuario set login=?, senha=? where codigo_usuario=" + codigo);
            comando.setString(1, login);
            comando.setString(2, senha);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }

    public static void Excluir(String codigo) {
        try {
            comando = conexao.prepareStatement("update usuario set est=1 where codigo_usuario = " + codigo);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }

    public static void PegarDados(String codigo, JTextField txtLogin, JPasswordField txtSenha, JPasswordField txtConfirma) {
        try {
            comando = conexao.prepareStatement("select * from usuario where est=0 and codigo_usuario = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                txtLogin.setText(resultado.getString("Login"));
                txtSenha.setText(resultado.getString("Senha"));
                txtConfirma.setText(resultado.getString("Senha"));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }
}