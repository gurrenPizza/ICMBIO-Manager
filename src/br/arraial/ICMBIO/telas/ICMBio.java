package br.arraial.ICMBIO.telas;

import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ICMBio {

    public static void main(String[] args) throws SQLException {
        Inicio janela = new Inicio();
        janela.setVisible(true);
        int i;

        try {
            for (i = 0; i < 101; i++) {
                sleep(5);
                janela.barra.setValue(i);
                janela.porcentagem.setText(i+ "%");

            }
            Login login = new Login();
            login.setVisible(true);
            janela.dispose();

        } catch (InterruptedException ex) {
            Logger.getLogger(ICMBio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
