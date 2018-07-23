package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModalidadesDAO {

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            comando = conexao.prepareStatement("Select * from modalidade where " + atributo + " like ? order by " + atributo);
            comando.setString(1, a + "%");
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_modalidade"), resultado.getString("nome_modalidade"),});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Cadastrar(String nome) {
        try {
            comando = conexao.prepareStatement("insert into modalidade values(?,null)");
            comando.setString(1, nome);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Alterar(String nome, String codigo) {
        try {
            comando = conexao.prepareStatement("update modalidade set nome_modalidade=? where codigo_modalidade=" + codigo);
            comando.setString(1, nome);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String codigo) {
        try {
            comando = conexao.prepareStatement("delete from modalidade where codigo_modalidade = " + codigo);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void PegarDados1(String codigo, JTextField txtNome) {
        try {
            comando = conexao.prepareStatement("select * from modalidade where codigo_modalidade = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNome.setText(resultado.getString("nome_modalidade"));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            comando = conexao.prepareStatement("select " + atributo + " from modalidade where codigo_modalidade = " + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                String retorno = resultado.getString(atributo);
                resultado.close();
                return retorno;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            return null;
        }
    }

    public static void PegarDados2(JComboBox cbModalidade) {
        int cont = 0;
        try {
            comando = conexao.prepareStatement("Select * from modalidade");
            resultado = comando.executeQuery();
            while (resultado.next()) {
                cont++;
            }
            List<String> lista = new ArrayList<>();
            comando = retornarConexao().prepareStatement("Select * from modalidade");
            resultado = comando.executeQuery();
            while (resultado.next()) {
                lista.add(resultado.getString("nome_modalidade"));
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(lista.toArray());
            cbModalidade.setMaximumRowCount(cont);
            cbModalidade.setModel(model);
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }
}
