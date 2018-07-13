package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @version 5.0 - 08/07
 * @author Turma INF161 Grupo Saída - Alberto Figuerêdo, Ariane Sales, Felipe
 * Viana, Laura Fidalgo e Phillipe Loriot de Rouvray
 */
public class SaidaDAO {

    public static void consultaSaidas(String mes, String ano, JTable tabela) {
        //Tem alguma coisa dando errado na hora de pesquisar
        try {
            Connection conexao = BancoDeDados.retornarConexao();

            PreparedStatement consulta = conexao.prepareStatement("Select * from saida where (mes=?) and (ano=?)");
            consulta.setString(1, mes);
            consulta.setString(2, ano);

            ResultSet resultado = consulta.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getInt("codigo_saida"), resultado.getInt("codigo_solicitacao"),
                    resultado.getInt("numero_saidas"), resultado.getInt("numero_visitantes"), resultado.getString("mes"),
                    resultado.getString("ano")});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro não encontrado!");

        }

    }

    public static void insereSaida(Integer numSaida, Integer numVisitantes, String mes, String ano) {

        try {

            PreparedStatement inserir = retornarConexao().prepareStatement("insert into saida(numero_saidas,numero_visitantes,mes,ano,codigo_solicitacao) values(?,?,?,?,?)");
            inserir.setInt(1, numSaida);
            inserir.setInt(2, numVisitantes);
            inserir.setString(3, mes);
            inserir.setString(4, ano);
            inserir.setInt(5, 1);
            inserir.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void alteraSaida(Integer numSaida, Integer numVisitantes, String mes, String ano, Integer cod_saida) {

        try {

            PreparedStatement alterar = BancoDeDados.retornarConexao().prepareStatement("update saida set numero_saidas=?, numero_visitantes=?, mes=?, ano=? where codigo_saida=" + cod_saida);
            alterar.setInt(1, numSaida);
            alterar.setInt(2, numVisitantes);
            alterar.setString(3, mes);
            alterar.setString(4, ano);
            alterar.execute();

        } catch (SQLException ex) {

            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro!");

        }

    }

    public static void excluiSaida(Integer cod_saida) {

        try {

            PreparedStatement excluir = BancoDeDados.retornarConexao().prepareStatement("delete from saida where codigo_saida=" + cod_saida);
            excluir.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }

    }

}
