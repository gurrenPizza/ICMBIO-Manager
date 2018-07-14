package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModalidadesDAO {

    public static void Consultar(String a, JTable b, String atributo) {

        try {
            PreparedStatement consulta = retornarConexao().prepareStatement("Select * from modalidade where " + atributo + " like ? order by " + atributo);
            consulta.setString(1, a + "%");
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_modalidade"), resultado.getString("nome_modalidade"),});
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void Cadastrar(String nome) {
        try {
            PreparedStatement inserir = retornarConexao().prepareStatement("insert into modalidade values(?,null)");
            inserir.setString(1, nome);
            inserir.executeUpdate();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Alterar(String nome, String codigo) {
        try {
            PreparedStatement alterar = retornarConexao().prepareStatement("update modalidade set nome_modalidade=? where codigo_modalidade=" + codigo);
            alterar.setString(1, nome);
            alterar.executeUpdate();
            alterar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Excluir(String codigo) {
        try {
            PreparedStatement deletar = retornarConexao().prepareStatement("delete from modalidade where codigo_modalidade = " + codigo);
            deletar.executeUpdate();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void PegarDados1(String codigo, JTextField txtNome) {
        try {
            PreparedStatement pesquisa = BancoDeDados.retornarConexao().prepareStatement("select * from modalidade where codigo_modalidade = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNome.setText(resultado.getString("nome_modalidade"));
            }
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            PreparedStatement pesquisa = BancoDeDados.retornarConexao().prepareStatement("select " + atributo + " from modalidade where codigo_modalidade = " + codigo);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                String retorno = resultado.getString(atributo);
                pesquisa.close();
                return retorno;
            } else {
                pesquisa.close();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public static void PegarDados2(JComboBox cbModalidade) {
        int cont = 0;
        try {
            PreparedStatement consulta = retornarConexao().prepareStatement("Select * from modalidade");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                cont++;
            }
            List<String> lista = new ArrayList<>();
            consulta = retornarConexao().prepareStatement("Select * from modalidade");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                lista.add(resultado.getString("nome_modalidade"));
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(lista.toArray());
            cbModalidade.setMaximumRowCount(cont);
            cbModalidade.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}