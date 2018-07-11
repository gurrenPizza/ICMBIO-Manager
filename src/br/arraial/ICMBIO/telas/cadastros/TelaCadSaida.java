
package br.arraial.ICMBIO.telas.cadastros;

import br.arraial.ICMBIO.DAO.*;
import br.arraial.ICMBIO.model.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 * @version 6.0 - 11/07
 * @author Turma INF161
 *         Grupo Saída - Alberto Figuerêdo, Ariane Sales, Felipe Viana,
 *         Laura Fidalgo e Phillipe Loriot de Rouvray
 */
public class TelaCadSaida extends JInternalFrame {

    /**
     * Creates new form Saída
     */
    
    private Integer codigoSaida;
    
    public TelaCadSaida(){
        initComponents();
    }
    
    public JTabbedPane getPnSaida(){
        return pnGuiasSaida;
    }
    
    public JTable getTable(){
        return tbSolicitacoes;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGuiasSaida = new javax.swing.JTabbedPane();
        pnConsultaSolicitacoes = new javax.swing.JPanel();
        pnBonitinho = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSolicitacoes = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        pnCadastro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbNumSaida = new javax.swing.JLabel();
        lbNumVisitantes = new javax.swing.JLabel();
        lbMes = new javax.swing.JLabel();
        lbAno = new javax.swing.JLabel();
        txtNumSaida = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtNumVisitantes = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbNumProcesso = new javax.swing.JLabel();
        lbNumProc = new javax.swing.JLabel();
        pnConsultaSaidas = new javax.swing.JPanel();
        pnBonitinho1 = new javax.swing.JPanel();
        txtPesquisaMes = new javax.swing.JTextField();
        lbPesquisaMes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSaidas = new javax.swing.JTable();
        btConsultaS = new javax.swing.JButton();
        lbPesquisaAno = new javax.swing.JLabel();
        txtPesquisaAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnGuiasSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnGuiasSaidaFocusGained(evt);
            }
        });

        pnConsultaSolicitacoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnConsultaSolicitacoesFocusGained(evt);
            }
        });

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite o número do processo:");

        tbSolicitacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº do Processo", "Status", "Motivo", "Seq. Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSolicitacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSolicitacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSolicitacoes);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBonitinhoLayout = new javax.swing.GroupLayout(pnBonitinho);
        pnBonitinho.setLayout(pnBonitinhoLayout);
        pnBonitinhoLayout.setHorizontalGroup(
            pnBonitinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBonitinhoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisar)
                .addGap(48, 48, 48))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnBonitinhoLayout.setVerticalGroup(
            pnBonitinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBonitinhoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnBonitinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnConsultaSolicitacoesLayout = new javax.swing.GroupLayout(pnConsultaSolicitacoes);
        pnConsultaSolicitacoes.setLayout(pnConsultaSolicitacoesLayout);
        pnConsultaSolicitacoesLayout.setHorizontalGroup(
            pnConsultaSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(pnConsultaSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultaSolicitacoesLayout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(pnBonitinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        pnConsultaSolicitacoesLayout.setVerticalGroup(
            pnConsultaSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(pnConsultaSolicitacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultaSolicitacoesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBonitinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnGuiasSaida.addTab("Consultar Solicitações", pnConsultaSolicitacoes);

        lbNumSaida.setText("Número de Saídas:");

        lbNumVisitantes.setText("Número de Visitantes:");

        lbMes.setText("Mês:");

        lbAno.setText("Ano:");

        txtNumSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSaidaActionPerformed(evt);
            }
        });

        txtNumVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVisitantesActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lbNumProcesso.setText("Número do processo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNumSaida)
                            .addComponent(lbNumVisitantes)
                            .addComponent(lbMes)
                            .addComponent(lbAno)
                            .addComponent(lbNumProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumVisitantes)
                            .addComponent(txtMes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNumSaida)
                            .addComponent(txtAno)
                            .addComponent(lbNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumSaida)
                    .addComponent(txtNumSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumVisitantes)
                    .addComponent(txtNumVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnGuiasSaida.addTab("Cadastrar", pnCadastro);

        pnConsultaSaidas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnConsultaSaidasFocusGained(evt);
            }
        });

        txtPesquisaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaMesActionPerformed(evt);
            }
        });

        lbPesquisaMes.setText("Digite o mês:");

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
        tbSaidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSaidasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSaidas);

        btConsultaS.setText("Pesquisar");
        btConsultaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaSActionPerformed(evt);
            }
        });

        lbPesquisaAno.setText("Digite o ano:");

        txtPesquisaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBonitinho1Layout = new javax.swing.GroupLayout(pnBonitinho1);
        pnBonitinho1.setLayout(pnBonitinho1Layout);
        pnBonitinho1Layout.setHorizontalGroup(
            pnBonitinho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBonitinho1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbPesquisaMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPesquisaAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btConsultaS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBonitinho1Layout.setVerticalGroup(
            pnBonitinho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBonitinho1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnBonitinho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisaMes)
                    .addComponent(txtPesquisaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultaS)
                    .addComponent(lbPesquisaAno))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnConsultaSaidasLayout = new javax.swing.GroupLayout(pnConsultaSaidas);
        pnConsultaSaidas.setLayout(pnConsultaSaidasLayout);
        pnConsultaSaidasLayout.setHorizontalGroup(
            pnConsultaSaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(pnConsultaSaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnConsultaSaidasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnBonitinho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnConsultaSaidasLayout.setVerticalGroup(
            pnConsultaSaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(pnConsultaSaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultaSaidasLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(pnBonitinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        pnGuiasSaida.addTab("Consultar Saídas", pnConsultaSaidas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGuiasSaida)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGuiasSaida, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtNumSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSaidaActionPerformed

    private void txtNumVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVisitantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumVisitantesActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(codigoSaida!=null){
            Saida sai = new Saida(Integer.parseInt(txtNumSaida.getText()), 
                              Integer.parseInt(txtNumVisitantes.getText()),
                              txtMes.getText(),
                              txtAno.getText(),
                              codigoSaida
                              );
        
            SaidaDAO.alteraSaida(sai.getNumsaidas(), 
                                 sai.getNumvisitantes(), 
                                 sai.getMes(), 
                                 sai.getAno(), 
                                 sai.getCodigosaida());
        }
        else{
            Saida sai = new Saida(Integer.valueOf(txtNumSaida.getText()),
                                  Integer.valueOf(txtNumVisitantes.getText()),
                                  txtMes.getText(),
                                  txtAno.getText());

            SaidaDAO.insereSaida(sai.getNumsaidas(),
                                 sai.getNumvisitantes(),
                                 sai.getMes(),
                                 sai.getAno());
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       txtNumSaida.setText("");
       txtNumVisitantes.setText("");
       txtMes.setText("");
       txtAno.setText("");
       lbNumProc.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        //REVISAR CODIGO (PARTE FOI COPIADO DE LOGIN)
        //OK, OBRIGADO! REVISADO COM SUCESSO. - 25/06
        
        Solicitacao sol = new Solicitacao(txtPesquisa.getText());
        SolicitacaoDAO.consultaSolicitacoes(sol.getNumeroprocesso(),tbSolicitacoes);
        
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tbSolicitacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSolicitacoesMouseClicked
        
        lbNumProc.setText(tbSolicitacoes.getValueAt(tbSolicitacoes.getSelectedRow(),0).toString());
        btExcluir.setEnabled(false);
        
        pnGuiasSaida.setSelectedIndex(1);
        
    }//GEN-LAST:event_tbSolicitacoesMouseClicked

    private void txtPesquisaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaMesActionPerformed

    private void tbSaidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSaidasMouseClicked
        //aqui, os resultados do banco de dados foram exibidos,
        //o usuário clica no registro que ele quiser e os valores são jogados
        //nos campos da guia de cadastro/alteração/exclusão
        codigoSaida = Integer.parseInt(tbSaidas.getValueAt(tbSaidas.getSelectedRow(),0).toString());
        txtNumSaida.setText(tbSaidas.getValueAt(tbSaidas.getSelectedRow(),2).toString());
        txtNumVisitantes.setText(tbSaidas.getValueAt(tbSaidas.getSelectedRow(),3).toString());
        txtMes.setText(tbSaidas.getValueAt(tbSaidas.getSelectedRow(),4).toString());
        txtAno.setText(tbSaidas.getValueAt(tbSaidas.getSelectedRow(),5).toString());
        btSalvar.setEnabled(false);
        btExcluir.setEnabled(true);
        
        pnGuiasSaida.setSelectedIndex(1);
    }//GEN-LAST:event_tbSaidasMouseClicked

    private void btConsultaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaSActionPerformed
        
        Saida sai = new Saida(txtMes.getText(),txtAno.getText());
        SaidaDAO.consultaSaidas(sai.getMes(),sai.getAno(),tbSaidas);
        
    }//GEN-LAST:event_btConsultaSActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        SaidaDAO.excluiSaida(codigoSaida);
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtPesquisaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaAnoActionPerformed

    private void pnGuiasSaidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnGuiasSaidaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pnGuiasSaidaFocusGained

    private void pnConsultaSaidasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnConsultaSaidasFocusGained
        while(txtPesquisaMes.getText().equals("") && txtPesquisaAno.getText().equals("")){
            btConsultaS.setEnabled(false);
        }
    }//GEN-LAST:event_pnConsultaSaidasFocusGained

    private void pnConsultaSolicitacoesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnConsultaSolicitacoesFocusGained
        
    }//GEN-LAST:event_pnConsultaSolicitacoesFocusGained

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
            java.util.logging.Logger.getLogger(TelaCadSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaS;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNumProc;
    private javax.swing.JLabel lbNumProcesso;
    private javax.swing.JLabel lbNumSaida;
    private javax.swing.JLabel lbNumVisitantes;
    private javax.swing.JLabel lbPesquisaAno;
    private javax.swing.JLabel lbPesquisaMes;
    private javax.swing.JPanel pnBonitinho;
    private javax.swing.JPanel pnBonitinho1;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnConsultaSaidas;
    private javax.swing.JPanel pnConsultaSolicitacoes;
    private javax.swing.JTabbedPane pnGuiasSaida;
    private javax.swing.JTable tbSaidas;
    private javax.swing.JTable tbSolicitacoes;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNumSaida;
    private javax.swing.JTextField txtNumVisitantes;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPesquisaAno;
    private javax.swing.JTextField txtPesquisaMes;
    // End of variables declaration//GEN-END:variables
}