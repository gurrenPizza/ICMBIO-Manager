
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


public class SaidaDAO {
    
    public static void consultaSaidas(){
        
        //Isso aqui realmente tá só consultando o Banco de Dados, ainda não está pronto
        
        try{
            Connection conexao = BancoDeDados.retornarConexao();
            
            PreparedStatement consulta = conexao.prepareStatement("Select * from saida");
            
            
            ResultSet resultado = consulta.executeQuery();
            Boolean existe = resultado.next();
            
            if(existe){
                //retornar o resultado ou preencher uma tabela
                //é melhor descobrir como retornar o resultado do select
                //de modo que a gente use esse método na classe da tela
            }
            
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Registro não encontrado!");
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
