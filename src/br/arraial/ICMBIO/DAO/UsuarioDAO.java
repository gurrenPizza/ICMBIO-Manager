package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            PreparedStatement consulta = retornarConexao().prepareStatement("Select * from usuario where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a + "%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_usuario"), resultado.getString("login"),});
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void Cadastrar(String login, String senha) {
        try {
            PreparedStatement inserir = retornarConexao().prepareStatement("insert into usuario(login, senha) values(?,?)");
            inserir.setString(1, login);
            inserir.setString(2, senha);
            inserir.executeUpdate();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Alterar(String login, String senha,String codigo) {
        try {
            PreparedStatement alterar = retornarConexao().prepareStatement("update usuario set login=?, senha=? where codigo_usuario="+codigo);
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
            PreparedStatement deletar = retornarConexao().prepareStatement("delete from usuario where codigo_usuario = " + codigo);
            deletar.executeUpdate();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void PegarDados(String codigo, JTextField txtLogin, JPasswordField txtSenha, JPasswordField txtConfirma) {
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
