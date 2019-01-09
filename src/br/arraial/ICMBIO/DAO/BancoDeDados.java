package br.arraial.ICMBIO.DAO;

import br.arraial.ICMBIO.telas.TelaConfiguracao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BancoDeDados {
    //private static final String BANCO = "jdbc:mysql://10.21.144.180:3306/icmbio";
    private static final TelaConfiguracao telaconfig = new TelaConfiguracao();
    
    public TelaConfiguracao getTelaConfiguracao() {
        return telaconfig;
    }
    
    private static String retornaHost(){
        try {
            return new BufferedReader(new FileReader("log.txt")).readLine();
        } catch (IOException ex) {
            telaconfig.setVisible(true);
            try {
                return new BufferedReader(new FileReader("log.txt")).readLine();
            } catch (IOException ex1) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex1);
                return null;
            }
        }
    }
    
    private static final String host = "127.0.0.1"/*retornaHost()*/;
    private static final String BANCO = "jdbc:mysql://"+host+"/icmbio";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    static Connection conexao = retornarConexao();
    static PreparedStatement comando;
    static ResultSet resultado;
    
    public static Connection retornarConexao() {
        try {
            return DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "O Sistema não conseguiu conectar ao banco de dados.", "Alerta!", 2);
            System.exit(0);
            return null;
        }
    }
    
    public static void criarBackup(){
        try{
            
        }
        catch(Exception a){
            System.out.println(a);
            System.exit(0);
        }
    }
}
