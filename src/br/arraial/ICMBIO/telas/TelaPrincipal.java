package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.telas.consultas.*;
import br.arraial.ICMBIO.telas.cadastros.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final TelaCadUsuario telacadusu = new TelaCadUsuario();
    private final TelaCadSaida telacadsai = new TelaCadSaida();
    private final TelaCadModalidade telacadmod = new TelaCadModalidade();
    private final TelaCadEmbarcacao telacademb = new TelaCadEmbarcacao();
    private final TelaCadSolicitacao telacadsola = new TelaCadSolicitacao();
    private final TelaCadSolicitante telacadsole = new TelaCadSolicitante();

    private final TelaConSaida telaconsai = new TelaConSaida();
    private final TelaConEmbarcacao telaconemb = new TelaConEmbarcacao();
    private final TelaConSolicitacao telaconsola = new TelaConSolicitacao();
    private final TelaConSolicitante telaconsole = new TelaConSolicitante();

    private final TelaAjuda telajuda = new TelaAjuda();
    private final TelaSobre telasobre = new TelaSobre();

    public TelaCadEmbarcacao getTelacademb() {
        return telacademb;
    }

    public TelaPrincipal() {
        initComponents();
        SwingUtilities.invokeLater(() -> {
            new Thread(new AtualizadorHora()).start();
        });
    }

    private class AtualizadorHora implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    txtDate.setText(new SimpleDateFormat("HH:mm dd/MM/yyyy").format(new Date()));
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnCentral = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        imCadSolicitante = new javax.swing.JMenuItem();
        imCadEmbarcacao = new javax.swing.JMenuItem();
        imCadModalidade = new javax.swing.JMenuItem();
        imCadUsuario = new javax.swing.JMenuItem();
        mnConsulta = new javax.swing.JMenu();
        imConSolicitante = new javax.swing.JMenuItem();
        imConEmbarcacao = new javax.swing.JMenuItem();
        mnSolicitacao = new javax.swing.JMenu();
        imSoliConsulta = new javax.swing.JMenuItem();
        imSoliCadastro = new javax.swing.JMenuItem();
        mnSaida = new javax.swing.JMenu();
        imSaiConsulta = new javax.swing.JMenuItem();
        imSaiCadastro = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        imAjuda = new javax.swing.JMenuItem();
        imRelatar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        imSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ICMBio - Instituto Chico Mendes de Conservação da Biodiversidade");

        pnCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnCentral.setForeground(new java.awt.Color(255, 255, 255));
        pnCentral.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/arraial/ICMBIO/img/icmbio.jpg"))); // NOI18N

        pnCentral.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnCentralLayout = new javax.swing.GroupLayout(pnCentral);
        pnCentral.setLayout(pnCentralLayout);
        pnCentralLayout.setHorizontalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentralLayout.createSequentialGroup()
                .addContainerGap(659, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pnCentralLayout.setVerticalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentralLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDate.setText("    ");
        txtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDate.setOpaque(true);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        mnCadastro.setText("Cadastro");

        imCadSolicitante.setText("Solicitante");
        imCadSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadSolicitanteActionPerformed(evt);
            }
        });
        mnCadastro.add(imCadSolicitante);

        imCadEmbarcacao.setText("Embarcação");
        imCadEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadEmbarcacaoActionPerformed(evt);
            }
        });
        mnCadastro.add(imCadEmbarcacao);

        imCadModalidade.setText("Modalidade");
        imCadModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadModalidadeActionPerformed(evt);
            }
        });
        mnCadastro.add(imCadModalidade);

        imCadUsuario.setText("Usuário");
        imCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadUsuarioActionPerformed(evt);
            }
        });
        mnCadastro.add(imCadUsuario);

        jMenuBar1.add(mnCadastro);

        mnConsulta.setText("Consulta");

        imConSolicitante.setText("Solicitante");
        imConSolicitante.setEnabled(false);
        imConSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConSolicitanteActionPerformed(evt);
            }
        });
        mnConsulta.add(imConSolicitante);

        imConEmbarcacao.setText("Embarcação");
        imConEmbarcacao.setEnabled(false);
        imConEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConEmbarcacaoActionPerformed(evt);
            }
        });
        mnConsulta.add(imConEmbarcacao);

        jMenuBar1.add(mnConsulta);

        mnSolicitacao.setText("Solicitação");

        imSoliConsulta.setText("Consulta");
        imSoliConsulta.setEnabled(false);
        imSoliConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSoliConsultaActionPerformed(evt);
            }
        });
        mnSolicitacao.add(imSoliConsulta);

        imSoliCadastro.setText("Cadastro");
        imSoliCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSoliCadastroActionPerformed(evt);
            }
        });
        mnSolicitacao.add(imSoliCadastro);

        jMenuBar1.add(mnSolicitacao);

        mnSaida.setText("Saida");

        imSaiConsulta.setText("Consulta");
        imSaiConsulta.setEnabled(false);
        imSaiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSaiConsultaActionPerformed(evt);
            }
        });
        mnSaida.add(imSaiConsulta);

        imSaiCadastro.setText("Cadastro");
        imSaiCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSaiCadastroActionPerformed(evt);
            }
        });
        mnSaida.add(imSaiCadastro);

        jMenuBar1.add(mnSaida);

        mnAjuda.setText("Ajuda");

        imAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        imAjuda.setText("Conteudo da ajuda");
        imAjuda.setEnabled(false);
        imAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAjudaActionPerformed(evt);
            }
        });
        mnAjuda.add(imAjuda);

        imRelatar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        imRelatar.setText("Relatar erro");
        imRelatar.setEnabled(false);
        imRelatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatarActionPerformed(evt);
            }
        });
        mnAjuda.add(imRelatar);
        mnAjuda.add(jSeparator1);

        imSobre.setText("Sobre");
        imSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSobreActionPerformed(evt);
            }
        });
        mnAjuda.add(imSobre);

        jMenuBar1.add(mnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCentral)
            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnCentral)
                .addGap(0, 0, 0)
                .addComponent(txtDate))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imConEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConEmbarcacaoActionPerformed
        pnCentral.add(telaconemb);
        telaconemb.show();
    }//GEN-LAST:event_imConEmbarcacaoActionPerformed

    private void imCadSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadSolicitanteActionPerformed
        pnCentral.add(telacadsole);
        telacadsole.show();
    }//GEN-LAST:event_imCadSolicitanteActionPerformed

    private void imCadModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadModalidadeActionPerformed
        pnCentral.add(telacadmod);
        telacadmod.show();
    }//GEN-LAST:event_imCadModalidadeActionPerformed

    private void imCadEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadEmbarcacaoActionPerformed
        pnCentral.add(telacademb);
        telacademb.show();
    }//GEN-LAST:event_imCadEmbarcacaoActionPerformed

    private void imCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadUsuarioActionPerformed
        pnCentral.add(telacadusu);
        telacadusu.show();
    }//GEN-LAST:event_imCadUsuarioActionPerformed

    private void imSaiCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSaiCadastroActionPerformed
        pnCentral.add(telacadsai);
        telacadsai.show();
    }//GEN-LAST:event_imSaiCadastroActionPerformed

    private void imSoliCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSoliCadastroActionPerformed
        pnCentral.add(telacadsola);
        telacadsola.show();
    }//GEN-LAST:event_imSoliCadastroActionPerformed

    private void imSoliConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSoliConsultaActionPerformed
        pnCentral.add(telaconsole);
        telaconsole.show();
    }//GEN-LAST:event_imSoliConsultaActionPerformed

    private void imAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAjudaActionPerformed
        pnCentral.add(telajuda);
        telajuda.show();
    }//GEN-LAST:event_imAjudaActionPerformed

    private void imSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSobreActionPerformed
        pnCentral.add(telasobre);
        telasobre.show();
    }//GEN-LAST:event_imSobreActionPerformed

    private void imRelatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatarActionPerformed
/*        DialogoRelatarProblema a = new DialogoRelatarProblema(this, rootPaneCheckingEnabled);
        a.setVisible(rootPaneCheckingEnabled);*/
    }//GEN-LAST:event_imRelatarActionPerformed

    private void imConSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConSolicitanteActionPerformed
        pnCentral.add(telaconsole);
        telaconsole.show();
    }//GEN-LAST:event_imConSolicitanteActionPerformed

    private void imSaiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSaiConsultaActionPerformed
        pnCentral.add(telaconsai);
        telaconsai.show();
    }//GEN-LAST:event_imSaiConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imAjuda;
    private javax.swing.JMenuItem imCadEmbarcacao;
    private javax.swing.JMenuItem imCadModalidade;
    private javax.swing.JMenuItem imCadSolicitante;
    private javax.swing.JMenuItem imCadUsuario;
    private javax.swing.JMenuItem imConEmbarcacao;
    private javax.swing.JMenuItem imConSolicitante;
    private javax.swing.JMenuItem imRelatar;
    private javax.swing.JMenuItem imSaiCadastro;
    private javax.swing.JMenuItem imSaiConsulta;
    private javax.swing.JMenuItem imSobre;
    private javax.swing.JMenuItem imSoliCadastro;
    private javax.swing.JMenuItem imSoliConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnConsulta;
    private javax.swing.JMenu mnSaida;
    private javax.swing.JMenu mnSolicitacao;
    private javax.swing.JDesktopPane pnCentral;
    private javax.swing.JLabel txtDate;
    // End of variables declaration//GEN-END:variables
}
