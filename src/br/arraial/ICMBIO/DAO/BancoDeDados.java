package br.arraial.ICMBIO.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDeDados {

    private static final String BANCO = "jdbc:mysql://localhost/icmbio";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection retornarConexao() {
        try {
            return DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
