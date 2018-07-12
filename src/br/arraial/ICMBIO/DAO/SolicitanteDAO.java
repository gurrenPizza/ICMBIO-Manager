package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SolicitanteDAO {

    public static void SolicitantePegarDados(String codigo, JTextField txtBeneficiario, JTextField txtBairro, JTextField txtCidade, JTextField txtCpfCnpj, JTextField txtEmail, JTextField txtEndereco, JTextField txtNome, JTextField txtNomeFantasia, JTextField txtOperadora, JTextField txtRazaoSocial, JTextField txtResponsavel, JTextField fmCep, JTextField fmTelefone) {
        try {
            PreparedStatement pesquisa = retornarConexao().prepareStatement("select * from solicitante where codigo_solicitante="+ codigo);
            ResultSet resultado = pesquisa.executeQuery();
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
            pesquisa.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void SolicitanteCadastrar(String Nome, String Beneficiario, String CPF_CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String Cep, String Email, String Razao_Social, String Nome_Fantasia, String Responsavel, String Operadora) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement inserir = con.prepareStatement("insert into solicitante(nome,beneficiario,CPF_CNPJ,telefone,endereco,bairro,cidade,cep,email,razao_social,nome_fantasia,responsavel,operadora) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            inserir.setString(1, Nome);
            inserir.setString(2, Beneficiario);
            inserir.setString(3, CPF_CNPJ);
            inserir.setString(4, Telefone);
            inserir.setString(5, Endereco);
            inserir.setString(6, Bairro);
            inserir.setString(7, Cidade);
            inserir.setString(8, Cep);
            inserir.setString(9, Email);
            inserir.setString(10, Razao_Social);
            inserir.setString(11, Nome_Fantasia);
            inserir.setString(12, Responsavel);
            inserir.setString(13, Operadora);
            inserir.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void SolicitanteAlterar(String codigo, String Nome, String Beneficiario, String CPF_CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String Cep, String Email, String Razao_Social, String Nome_Fantasia, String Responsavel, String Operadora) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement inserir = con.prepareStatement("UPDATE solicitante SET nome = ?, beneficiario = ?, CPF_CNPJ = ?, telefone = ?, endereco = ?, bairro = ?, cidade = ?, cep = ?, email = ?, razao_social = ?, nome_fantasia = ?, responsavel = ?, operadora = ? WHERE codigo_solicitante = " + codigo);
            inserir.setString(1, Nome);
            inserir.setString(2, Beneficiario);
            inserir.setString(3, CPF_CNPJ);
            inserir.setString(4, Telefone);
            inserir.setString(5, Endereco);
            inserir.setString(6, Bairro);
            inserir.setString(7, Cidade);
            inserir.setString(8, Cep);
            inserir.setString(9, Email);
            inserir.setString(10, Razao_Social);
            inserir.setString(11, Nome_Fantasia);
            inserir.setString(12, Responsavel);
            inserir.setString(13, Operadora);
            inserir.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void SolicitanteTabelaConsulta(String a, JTable b, String atributo) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement pesquisa = con.prepareStatement("select * from solicitante where " + atributo + " like ? order by " + atributo);
            pesquisa.setString(1, a + "%");
            ResultSet resultado = pesquisa.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitante"), resultado.getString("nome"), resultado.getString("CPF_CNPJ"), resultado.getString("endereco"), resultado.getString("cidade"),});
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void SolicitanteExcluir(String codigo) {
        try {
            PreparedStatement deletar = retornarConexao().prepareStatement("DELETE FROM solicitante WHERE codigo_solicitante=" + codigo);
            deletar.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
