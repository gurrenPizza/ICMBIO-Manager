/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Euller Felipe
 */
public class ModalidadesDAO {

    private String modd;
    
    public void setModalidade(String mod) {
        this.modd = mod;
    }
    
    public String getModalidade() {
        return modd;
    }

    public static void CadastrarModalidade(String modal){
        try{
            Connection con = BancoDeDados.retornarConexao();
            PreparedStatement inserir = con.prepareStatement("insert into modalidade(nome_modalidade) values (?)");
            inserir.setString(1,modal);
            inserir.execute();
            inserir.close();
            
            
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro! Cadastro não realizado!");
        }
    }
    
}