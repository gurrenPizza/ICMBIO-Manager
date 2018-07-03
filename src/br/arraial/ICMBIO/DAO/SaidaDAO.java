
package br.arraial.ICMBIO.DAO;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
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


public class SaidaDAO {
    
    public static void consultaSaidas(JTable tabela){
        //FALTA TERMINAR ESTE MÉTODO CONSERTANDO O BANCO DE DADOS
        try{
            Connection conexao = BancoDeDados.retornarConexao();
            
            PreparedStatement consulta = conexao.prepareStatement("Select * from saidas");
            
            ResultSet resultado = consulta.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            while(resultado.next()){
                model.addRow(new Object[] {resultado.getString("codigo_saida"),resultado.getString("codigo_solicitacao"),
                                resultado.getString("numero_saidas"),resultado.getString("numero_visitantes"),resultado.getString("mes"),
                                resultado.getString("ano")
                                });
            }
            
            Boolean existe = resultado.next();
            
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null,"Registro não encontrado!");
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public static void insereSaida(Integer numSaida, Integer numVisitantes, String mes, String ano){
        
        try {
            PreparedStatement inserir = retornarConexao().prepareStatement("insert into saida(numero_saidas,numero_visitantes,mes,ano,codigo_solicitacao) values(?,?,?,?,?)");
            inserir.setInt(1,numSaida);
            inserir.setInt(2,numVisitantes);
            inserir.setString(3,mes);
            inserir.setString(4,ano);
            inserir.setInt(5,1);
            inserir.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaSaida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
