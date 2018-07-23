package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmbarcacaoDAO {

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void PegarDados(String codigoembarcacao, JTextField txtNomeEmbarcacao, JTextField fmTie, JTextField txtNomeProprietario, JSpinner cgNumeroPassageiros, JFormattedTextField fmTamanhoEmbarcacao, JSpinner cgCapacidadePassageiros, JTextField txtLocal, JTextArea atObs, JComboBox cbModalidade) {
        try {
            comando = conexao.prepareStatement("select * from embarcacao where codigo_embarcacao = " + codigoembarcacao);
            resultado = comando.executeQuery();
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
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Alterar(String codigoembarcacao, String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        try {
            comando = conexao.prepareStatement("update embarcacao set nome_embarcacao=?, tie=?, nome_proprietario=?, numero_passageiros=?, tamanho_embarcacao=?, capacidade_passageiros=?, local=?, obs=?, codigo_modalidade=? where codigo_embarcacao = " + codigoembarcacao);
            comando.setString(1, nome);
            comando.setString(2, tie);
            comando.setString(3, nomeproprietario);
            comando.setString(4, numeropassageiros);
            comando.setString(5, tamanhoembarcacao);
            comando.setString(6, capacidadepassageiros);
            comando.setString(7, local);
            comando.setString(8, obs);
            comando.setInt(9, modalidade);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Cadastrar(String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        try {
            comando = conexao.prepareStatement("insert into embarcacao(nome_embarcacao, tie, nome_proprietario, numero_passageiros, tamanho_embarcacao, capacidade_passageiros, local, obs, codigo_modalidade) values(?,?,?,?,?,?,?,?,?)");
            comando.setString(1, nome);
            comando.setString(2, tie);
            comando.setString(3, nomeproprietario);
            comando.setString(4, numeropassageiros);
            comando.setString(5, tamanhoembarcacao);
            comando.setString(6, capacidadepassageiros);
            comando.setString(7, local);
            comando.setString(8, obs);
            comando.setInt(9, modalidade);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Excluir(String codigoembarcacao) {
        try {
            comando = conexao.prepareStatement("delete from embarcacao where codigo_embarcacao = " + codigoembarcacao);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static void Consultar(String a, JTable b, String atributo) {
        try {
            comando = conexao.prepareStatement("select * from embarcacao where " + atributo + " like ? order by " + atributo);
            comando.setString(1, a + "%");
            resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) b.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new String[]{resultado.getString("codigo_embarcacao"), resultado.getString("nome_embarcacao"), resultado.getString("TIE"), ModalidadesDAO.Buscar("nome_modalidade", resultado.getString("codigo_modalidade"))});
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            comando = conexao.prepareStatement("select " + atributo + " from embarcacao where codigo_embarcacao = " + codigo);
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
