package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SolicitanteDAO {

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void PegarDados(String codigo, JTextField txtBeneficiario, JTextField txtBairro, JTextField txtCidade, JTextField txtCpfCnpj, JTextField txtEmail, JTextField txtEndereco, JTextField txtNome, JTextField txtNomeFantasia, JTextField txtOperadora, JTextField txtRazaoSocial, JTextField txtResponsavel, JTextField fmCep, JTextField fmTelefone) {
        try {
            comando = conexao.prepareStatement("select * from solicitante where codigo_solicitante=" + codigo);
            resultado = comando.executeQuery();
            if (resultado != null && resultado.next()) {
                txtBeneficiario.setText(resultado.getString("beneficiario"));
                txtBairro.setText(resultado.getString("bairro"));
                txtCidade.setText(resultado.getString("cidade"));
                txtCpfCnpj.setText(resultado.getString("cpf_cnpj"));
                txtEmail.setText(resultado.getString("email"));
                txtEndereco.setText(resultado.getString("endereco"));
                txtNome.setText(resultado.getString("nome"));
                txtNomeFantasia.setText(resultado.getString("nome_fantasia"));
                txtOperadora.setText(resultado.getString("operadora"));
                txtRazaoSocial.setText(resultado.getString("razao_social"));
                txtResponsavel.setText(resultado.getString("responsavel"));
                fmCep.setText(resultado.getString("cep"));
                fmTelefone.setText(resultado.getString("telefone"));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Cadastrar(String Nome, String Beneficiario, String CPF_CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String Cep, String Email, String Razao_Social, String Nome_Fantasia, String Responsavel, String Operadora) {
        try {
            comando = conexao.prepareStatement("insert into solicitante(nome,beneficiario,CPF_CNPJ,telefone,endereco,bairro,cidade,cep,email,razao_social,nome_fantasia,responsavel,operadora) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            comando.setString(1, Nome);
            comando.setString(2, Beneficiario);
            comando.setString(3, CPF_CNPJ);
            comando.setString(4, Telefone);
            comando.setString(5, Endereco);
            comando.setString(6, Bairro);
            comando.setString(7, Cidade);
            comando.setString(8, Cep);
            comando.setString(9, Email);
            comando.setString(10, Razao_Social);
            comando.setString(11, Nome_Fantasia);
            comando.setString(12, Responsavel);
            comando.setString(13, Operadora);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Alterar(String codigo, String Nome, String Beneficiario, String CPF_CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String Cep, String Email, String Razao_Social, String Nome_Fantasia, String Responsavel, String Operadora) {
        try {
            comando = conexao.prepareStatement("UPDATE solicitante SET nome = ?, beneficiario = ?, CPF_CNPJ = ?, telefone = ?, endereco = ?, bairro = ?, cidade = ?, cep = ?, email = ?, razao_social = ?, nome_fantasia = ?, responsavel = ?, operadora = ? WHERE codigo_solicitante = " + codigo);
            comando.setString(1, Nome);
            comando.setString(2, Beneficiario);
            comando.setString(3, CPF_CNPJ);
            comando.setString(4, Telefone);
            comando.setString(5, Endereco);
            comando.setString(6, Bairro);
            comando.setString(7, Cidade);
            comando.setString(8, Cep);
            comando.setString(9, Email);
            comando.setString(10, Razao_Social);
            comando.setString(11, Nome_Fantasia);
            comando.setString(12, Responsavel);
            comando.setString(13, Operadora);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }

    }

    public static void Consultar(String a, JTable b, String atributo) {
        try {
            comando = conexao.prepareStatement("select * from solicitante where " + atributo + " like ? order by " + atributo);
            comando.setString(1, a + "%");
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitante"), resultado.getString("nome"), resultado.getString("CPF_CNPJ"), resultado.getString("endereco"), resultado.getString("cidade"),});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String codigo) {
        try {
            comando = conexao.prepareStatement("DELETE FROM solicitante WHERE codigo_solicitante=" + codigo);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            comando = conexao.prepareStatement("select " + atributo + " from solicitante where codigo_solicitante = " + codigo);
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
}
