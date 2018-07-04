package br.arraial.ICMBIO.telas;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ICMBio {

    public static void main(String[] args) throws SQLException {
        Inicio janela = new Inicio();
        janela.setVisible(true);
        int i =0;
        
        
            try {
                for (i = 0; i < 101; i++) {
                sleep(30);
                janela.barra.setValue(i);
                janela.porcentagem.setText(Integer.toString(i)+"%");
                
                }
            Login login = new Login();    
            login.setVisible(true);
            janela.setVisible(false);
            
         
            
            
            
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ICMBio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
    }

    
    

