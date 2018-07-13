/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmbarcacaoDAO {

    public static void PegarDados(String codigoembarcacao, JTextField txtNomeEmbarcacao, JTextField fmTie, JTextField txtNomeProprietario, JSpinner cgNumeroPassageiros, JFormattedTextField fmTamanhoEmbarcacao, JSpinner cgCapacidadePassageiros, JTextField txtLocal, JTextArea atObs, JComboBox cbModalidade) {
        try {
            Connection conexao = retornarConexao();
            PreparedStatement consultar = conexao.prepareStatement("select * from embarcacao where codigo_embarcacao = " + codigoembarcacao);
            ResultSet resultado = consultar.executeQuery();
            if (resultado != null && resultado.next()) {
                txtNomeEmbarcacao.setText(resultado.getString("nome_embarcacao"));
                fmTie.setText(resultado.getString("tie"));
                txtNomeProprietario.setText(resultado.getString("nome_proprietario"));
                cgNumeroPassageiros.setValue(Integer.parseInt(resultado.getString("numero_passageiros")));
                fmTamanhoEmbarcacao.setText(resultado.getString("tamanho_embarcacao"));
                cgCapacidadePassageiros.setValue(Integer.parseInt(resultado.getString("capacidade_passageiros")));
                txtLocal.setText(resultado.getString("local"));
                atObs.setText(resultado.getString("obs"));
                cbModalidade.setSelectedIndex(resultado.getInt("codigo_modalidade"));
            }
            resultado.close();
            consultar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Alterar(String codigoembarcacao, String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement alterar = conexao.prepareStatement("update embarcacao set nome_embarcacao=?, tie=?, nome_proprietario=?, numero_passageiros=?, tamanho_embarcacao=?, capacidade_passageiros=?, local=?, obs=?, codigo_modalidade=? where codigo_embarcacao = " + codigoembarcacao);

            alterar.setString(1, nome);
            alterar.setString(2, tie);
            alterar.setString(3, nomeproprietario);
            alterar.setString(4, numeropassageiros);
            alterar.setString(5, tamanhoembarcacao);
            alterar.setString(6, capacidadepassageiros);
            alterar.setString(7, local);
            alterar.setString(8, obs);
            alterar.setInt(9, modalidade);
            alterar.executeUpdate();
            alterar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Cadastrar(String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {

            PreparedStatement inserir = conexao.prepareStatement("insert into embarcacao(nome_embarcacao, tie, nome_proprietario, numero_passageiros, tamanho_embarcacao, capacidade_passageiros, local, obs, codigo_modalidade) values(?,?,?,?,?,?,?,?,?)");
            inserir.setString(1, nome);
            inserir.setString(2, tie);
            inserir.setString(3, nomeproprietario);
            inserir.setString(4, numeropassageiros);
            inserir.setString(5, tamanhoembarcacao);
            inserir.setString(6, capacidadepassageiros);
            inserir.setString(7, local);
            inserir.setString(8, obs);
            inserir.setInt(9, modalidade);
            inserir.executeUpdate();
            inserir.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Excluir(String codigoembarcacao) {
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            PreparedStatement deletar = conexao.prepareStatement("delete from embarcacao where codigo_embarcacao = " + codigoembarcacao);
            deletar.executeUpdate();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Consultar(String a, JTable b, String atributo) {
        Connection conexao = retornarConexao();
        try {
            PreparedStatement consultar = conexao.prepareStatement("select * from embarcacao where " + atributo + " like ? order by " + atributo);
            consultar.setString(1, a + "%");
            ResultSet resultado = consultar.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new String[]{resultado.getString("codigo_embarcacao"), resultado.getString("nome_embarcacao"), resultado.getString("TIE"), resultado.getString("codigo_modalidade")});
            }

            resultado.close();
            consultar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
