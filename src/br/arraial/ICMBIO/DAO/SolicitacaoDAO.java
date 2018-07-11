package br.arraial.ICMBIO.DAO;

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
 *
 * @author Turma INF161
 *
 */
public class SolicitacaoDAO {

    public static void consultaSolicitacoes(String n_proc, JTable tabela) {

        try {
            Connection conexao = BancoDeDados.retornarConexao();

            PreparedStatement consulta = conexao.prepareStatement("Select * from solicitacao where numero_processo=?");
            consulta.setString(1, n_proc);

            ResultSet resultado = consulta.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("numero_processo"), resultado.getString("motivo"),
                    resultado.getString("status"), resultado.getString("sequencia_anual")
                });
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro não encontrado!");
        }

    }
}
