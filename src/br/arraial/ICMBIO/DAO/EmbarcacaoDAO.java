package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.telas.ICMBio.banco;
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
    static PreparedStatement comando;
    static ResultSet resultado;

    public static void PegarDados(String codigoembarcacao, JTextField txtNomeEmbarcacao, JTextField fmTie, JTextField txtNomeProprietario, JSpinner cgNumeroPassageiros, JFormattedTextField fmTamanhoEmbarcacao, JSpinner cgCapacidadePassageiros, JTextField txtLocal, JTextArea atObs, JComboBox cbModalidade) {
        try {
            comando = banco.conexao.prepareStatement("select * from embarcacao, modalidade where est=0 and modalidade.codigo_modalidade = embarcacao.codigo_modalidade and embarcacao.codigo_embarcacao = " + codigoembarcacao);
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
                //cbModalidade.setSelectedIndex(resultado.getInt("codigo_modalidade"));
                //System.out.println("");
                cbModalidade.setSelectedItem(resultado.getString("nome_modalidade"));
            }
            resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }

    public static Integer PegarCodigoModalidade(String modalidade) {
        try {
            comando = banco.conexao.prepareStatement("select * from modalidade where est=0 and nome_modalidade = '" + modalidade+"'");
            resultado = comando.executeQuery();
            resultado.next();
            //if (resultado != null && resultado.next()) {
                //cbModalidade.setSelectedIndex(resultado.getInt("codigo_modalidade"));
                //cbModalidade.setSelectedItem(resultado.getString("nome_modalidade"));
                return resultado.getInt("codigo_modalidade");
            //}
           // resultado.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
            return null;
        }
    }

    
    public static void Alterar(String codigoembarcacao, String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        try {
            comando = banco.conexao.prepareStatement("update embarcacao set nome_embarcacao=?, tie=?, nome_proprietario=?, numero_passageiros=?, tamanho_embarcacao=?, capacidade_passageiros=?, local=?, obs=?, codigo_modalidade=? where codigo_embarcacao = " + codigoembarcacao);
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
            System.exit(0);
        }
    }

    public static void Cadastrar(String nome, String tie, String nomeproprietario, String numeropassageiros, String tamanhoembarcacao, String capacidadepassageiros, String local, String obs, Integer modalidade) {
        try {
            comando = banco.conexao.prepareStatement("insert into embarcacao(nome_embarcacao, tie, nome_proprietario, numero_passageiros, tamanho_embarcacao, capacidade_passageiros, local, obs, codigo_modalidade) values(?,?,?,?,?,?,?,?,?)");
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
            System.exit(0);
        }
    }

    public static void Excluir(String codigoembarcacao) {
        try {
            comando = banco.conexao.prepareStatement("update embarcacao set est=1 where codigo_embarcacao = " + codigoembarcacao);
            comando.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Verifique a conexão com o banco de dados.", "Erro!!!", 2);
            System.exit(0);
        }
    }

    public static void Consultar(String a, JTable b, String atributo) {
        try {
            comando = banco.conexao.prepareStatement("select * from embarcacao, modalidade where est=0 and embarcacao.codigo_modalidade=modalidade.codigo_modalidade and " + atributo + " like ? order by " + atributo);
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
            System.exit(0);
        }
    }

    public static String Buscar(String atributo, String codigo) {
        try {
            comando = banco.conexao.prepareStatement("select " + atributo + " from embarcacao where est=0 and codigo_embarcacao = " + codigo);
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
            System.exit(0);
            return null;
        }
    }
}