package br.arraial.ICMBIO.telas.cadastros;

import br.arraial.ICMBIO.DAO.SaidaDAO;
import br.arraial.ICMBIO.DAO.SolicitacaoDAO;
import javax.swing.JInternalFrame;

/**
 * @version 6.0 - 11/07
 * @author Turma INF161 Grupo Saída - Alberto Figuerêdo, Ariane Sales, Felipe
 * Viana, Laura Fidalgo e Phillipe Loriot de Rouvray
 */
public class TelaCadSaida extends JInternalFrame {

    /**
     * Creates new form Saída
     */
    private String codigo = null;
    private String codAtr = "codigo_saida";

    public TelaCadSaida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TelaSaida = new javax.swing.JTabbedPane();
        pnConsulta = new javax.swing.JPanel();
        cbAtributo = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSaidas = new javax.swing.JTable();
        pnCadastro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSolicitacao = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtNumSaida = new javax.swing.JTextField();
        txtNumVisitantes = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        lbMes = new javax.swing.JLabel();
        lbNumVisitantes = new javax.swing.JLabel();
        lbNumSaida = new javax.swing.JLabel();
        lbNumProcesso = new javax.swing.JLabel();
        lblNumProcesso = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Saída");

        pnConsulta.setBackground(java.awt.Color.white);
        pnConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnConsultaFocusGained(evt);
            }
        });

        cbAtributo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cod. Saída", "Cod. Solicitação", "Nº de Saídas", "Nº de Visitantes", "Mês", "Ano" }));
        cbAtributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAtributoItemStateChanged(evt);
            }
        });

        txtPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPesquisaMousePressed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tbSaidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Saída", "Cod. Solicitação", "Nº de Saídas", "Nº de Visitantes", "Mês", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSaidas.getTableHeader().setReorderingAllowed(false);
        tbSaidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSaidasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSaidas);
        if (tbSaidas.getColumnModel().getColumnCount() > 0) {
            tbSaidas.getColumnModel().getColumn(0).setResizable(false);
            tbSaidas.getColumnModel().getColumn(1).setResizable(false);
            tbSaidas.getColumnModel().getColumn(2).setResizable(false);
            tbSaidas.getColumnModel().getColumn(3).setResizable(false);
            tbSaidas.getColumnModel().getColumn(4).setResizable(false);
            tbSaidas.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout pnConsultaLayout = new javax.swing.GroupLayout(pnConsulta);
        pnConsulta.setLayout(pnConsultaLayout);
        pnConsultaLayout.setHorizontalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnConsultaLayout.createSequentialGroup()
                        .addComponent(cbAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnConsultaLayout.setVerticalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        TelaSaida.addTab("Consultar", pnConsulta);

        jPanel1.setBackground(java.awt.Color.white);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btLimpar.setText("Novo");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitação"));

        tbSolicitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero Processo", "Status", "Solicitante", "Embarcacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSolicitacao.getTableHeader().setReorderingAllowed(false);
        tbSolicitacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSolicitacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbSolicitacao);
        if (tbSolicitacao.getColumnModel().getColumnCount() > 0) {
            tbSolicitacao.getColumnModel().getColumn(0).setResizable(false);
            tbSolicitacao.getColumnModel().getColumn(1).setResizable(false);
            tbSolicitacao.getColumnModel().getColumn(2).setResizable(false);
            tbSolicitacao.getColumnModel().getColumn(3).setResizable(false);
            tbSolicitacao.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Digite o numero do processo:");

        txtPesquisa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisa2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa2)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.white);

        lbAno.setText("Ano:");

        lbMes.setText("Mês:");

        lbNumVisitantes.setText("Número de Visitantes:");

        lbNumSaida.setText("Número de Saídas:");

        lbNumProcesso.setText("Número do processo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumVisitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMes)
                    .addComponent(lbAno)
                    .addComponent(lbNumProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMes, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(txtNumVisitantes)
                    .addComponent(txtAno)
                    .addComponent(txtNumSaida, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumProcesso))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumProcesso)
                    .addComponent(lblNumProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumSaida)
                    .addComponent(txtNumSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumVisitantes)
                    .addComponent(txtNumVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TelaSaida.addTab("Cadastrar", pnCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaSaida)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (codigo == null) {
            SaidaDAO.insereSaida(Integer.parseInt(txtNumSaida.getText()), Integer.parseInt(txtNumVisitantes.getText()), txtMes.getText(), txtAno.getText(), tbSolicitacao.getValueAt(tbSolicitacao.getSelectedRow(), 0).toString());
        } else {
            SaidaDAO.alteraSaida(Integer.parseInt(txtNumSaida.getText()), Integer.parseInt(txtNumVisitantes.getText()), txtMes.getText(), txtAno.getText(), Integer.parseInt(codigo));
        }
        TelaSaida.setSelectedIndex(0);
        this.codigo = null;
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtAno.setText("");
        txtMes.setText("");
        txtNumSaida.setText("");
        txtNumVisitantes.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void tbSaidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSaidasMouseClicked
        TelaSaida.setSelectedIndex(1);
        this.codigo = tbSaidas.getValueAt(tbSaidas.getSelectedRow(), 0).toString();
        SaidaDAO.PegarDados(codigo, txtNumSaida, txtNumVisitantes, txtMes, txtAno);
        switch (cbAtributo.getItemAt(cbAtributo.getSelectedIndex()).toString()) {
            case "Cod. Saída":
                txtPesquisa.setText("Digite o código da saída");
                codAtr = "codigo_saida";
                break;
            case "Cod. Solicitação":
                txtPesquisa.setText("Digite o código da solicitação");
                codAtr = "codigo_solicitacao";
                break;
            case "Nº de Saídas":
                txtPesquisa.setText("Digite o número de saídas");
                codAtr = "numero_saidas";
                break;
            case "Nº de Visitantes":
                txtPesquisa.setText("Digite o número de visitantes");
                codAtr = "numero_visitantes";
                break;
            case "Mês":
                txtPesquisa.setText("Digite o número de mês");
                codAtr = "mes";
                break;
            case "Ano":
                txtPesquisa.setText("Digite o número de ano");
                codAtr = "ano";
                break;
        }
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbSaidasMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    }//GEN-LAST:event_btExcluirActionPerformed

    private void pnConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnConsultaFocusGained

    }//GEN-LAST:event_pnConsultaFocusGained

    private void cbAtributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAtributoItemStateChanged
        switch (cbAtributo.getItemAt(cbAtributo.getSelectedIndex()).toString()) {
            case "Cod. Saída":
                txtPesquisa.setText("Digite o código da saída");
                codAtr = "codigo_saida";
                break;
            case /*"Cod. Solicitação"*/ "Número do processo":
                txtPesquisa.setText(/*"Digite o código da solicitação"*/"Digite o número do processo");
                codAtr = "numero_processo";
                break;
            case "Nº de Saídas":
                txtPesquisa.setText("Digite o número de saídas");
                codAtr = "numero_saidas";
                break;
            case "Nº de Visitantes":
                txtPesquisa.setText("Digite o número de visitantes");
                codAtr = "numero_visitantes";
                break;
            case "Mês":
                txtPesquisa.setText("Digite o número de mês");
                codAtr = "mes";
                break;
            case "Ano":
                txtPesquisa.setText("Digite o número de ano");
                codAtr = "ano";
                break;
        }
    }//GEN-LAST:event_cbAtributoItemStateChanged

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        SaidaDAO.Consultar(txtPesquisa.getText(), tbSaidas, codAtr);
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtPesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMousePressed
        txtPesquisa.setText("");
    }//GEN-LAST:event_txtPesquisaMousePressed

    private void txtPesquisa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisa2KeyReleased
        SolicitacaoDAO.Consultar(txtPesquisa2.getText(), tbSolicitacao, "numero_processo");
    }//GEN-LAST:event_txtPesquisa2KeyReleased

    private void tbSolicitacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSolicitacaoMouseClicked

    }//GEN-LAST:event_tbSolicitacaoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TelaSaida;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAtributo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNumProcesso;
    private javax.swing.JLabel lbNumSaida;
    private javax.swing.JLabel lbNumVisitantes;
    private javax.swing.JTextField lblNumProcesso;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnConsulta;
    private javax.swing.JTable tbSaidas;
    private javax.swing.JTable tbSolicitacao;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNumSaida;
    private javax.swing.JTextField txtNumVisitantes;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPesquisa2;
    // End of variables declaration//GEN-END:variables
}
