
package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.Login;
import br.arraial.ICMBIO.telas.TelaSaida;
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
    
    
    public static void consultaSolicitacoes(String n_proc,JTable tabela){
        //PRECISAMOS DESCOBRIR COMO RETORNAR A PESQUISA DO BANCO DE DADOS
        //..
        //COMO ESSE MÉTODO SERÁ USADO EM OUTRAS TELAS, NÃO PODE DEPENDER
        //DE UMA ÚNICA TELA
        try{
            Connection conexao = BancoDeDados.retornarConexao();
            
            PreparedStatement consulta = conexao.prepareStatement("Select * from solicitacao where numero_processo=?");
            consulta.setString(1, n_proc);
            
            ResultSet resultado = consulta.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            while(resultado.next()){
                model.addRow(new Object[] {resultado.getString("numero_processo"),resultado.getString("motivo"),
                                resultado.getString("status"),resultado.getString("sequencia_anual")
                                });
            }
            
            Boolean existe = resultado.next();
            
            if(existe){
                
            }
            else{
               JOptionPane.showMessageDialog(null,"Registro não encontrado!");
            }
            
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}
