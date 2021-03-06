package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.DAO.BancoDeDados;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ICMBio {
    private static final TelaLogin telalogin = new TelaLogin();

    public TelaLogin getTelalogin() {
        return telalogin;
    }

    public static BancoDeDados banco;
    
    public static void main(String[] args){
        Inicio janela = new Inicio();
        janela.setVisible(true);
        try {
            for (int i = 0; i < 101; i++) {
                sleep(5);
                janela.barra.setValue(i);
                janela.porcentagem.setText(i+ "%");
            }
            
            janela.dispose();
            if (new SimpleDateFormat("dd").format(new Date()).equals("01")) {
                banco.criarBackup();
            }
            
            telalogin.setVisible(true);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}