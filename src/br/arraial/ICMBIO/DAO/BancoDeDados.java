package br.arraial.ICMBIO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private static final String BANCO = "jdbc:mysql://localhost/icmbio";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection retornarConexao() {
        try {
            return DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
