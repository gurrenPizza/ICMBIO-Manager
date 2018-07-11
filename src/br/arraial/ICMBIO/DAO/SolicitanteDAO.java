package br.arraial.ICMBIO.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SolicitanteDAO {

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
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void SolicitantTabelaConsulta(String a, JTable b) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement pesquisa = con.prepareStatement("select * from solicitante where nome like ?");
            pesquisa.setString(1, a + "%");
            ResultSet resultado = pesquisa.executeQuery();
            DefaultTableModel model;
            model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitante"), resultado.getString("nome"), resultado.getString("CPF_CNPJ"), resultado.getString("telefone"), resultado.getString("endereco"), resultado.getString("cidade"), resultado.getString("responsavel"),});
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void SolicitanteTabelaAtualiza(JTable b) {
        try {
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement pesquisa = con.prepareStatement("select * from solicitante");
            ResultSet resultado = pesquisa.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("codigo_solicitante"), resultado.getString("nome"), resultado.getString("CPF_CNPJ"), resultado.getString("telefone"), resultado.getString("endereco"), resultado.getString("cidade"), resultado.getString("responsavel"),});
            }
            resultado.close();
            pesquisa.close();
        } catch (SQLException ex) {
        }
    }

    public static void SolicitanteDadosCadastro() {

    }
}
