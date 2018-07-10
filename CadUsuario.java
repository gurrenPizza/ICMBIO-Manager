
package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.DAO.BancoDeDados;
import br.arraial.ICMBIO.DAO.UsuarioDAO;
import br.arraial.ICMBIO.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadUsuario extends javax.swing.JInternalFrame {

  private String codigousuario=null;
    public CadUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        pnCadUsuario = new javax.swing.JTabbedPane();
        pnConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarioConsulta = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pnNovoCadastro = new javax.swing.JPanel();
        lbNomeCadastrado = new javax.swing.JLabel();
        lbNovoLogin = new javax.swing.JLabel();
        lbNovaSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        tbUsuarioConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarioConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarioConsulta);
        if (tbUsuarioConsulta.getColumnModel().getColumnCount() > 0) {
            tbUsuarioConsulta.getColumnModel().getColumn(1).setResizable(false);
        }

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnConsultarLayout = new javax.swing.GroupLayout(pnConsultar);
        pnConsultar.setLayout(pnConsultarLayout);
        pnConsultarLayout.setHorizontalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnConsultarLayout.setVerticalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnCadUsuario.addTab("Consultar", pnConsultar);

        lbNomeCadastrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeCadastrado.setText("Login:");

        lbNovoLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNovoLogin.setText("Senha:");

        lbNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNovaSenha.setText("Confirmar:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnNovoCadastroLayout = new javax.swing.GroupLayout(pnNovoCadastro);
        pnNovoCadastro.setLayout(pnNovoCadastroLayout);
        pnNovoCadastroLayout.setHorizontalGroup(
            pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNovaSenha)
                            .addComponent(lbNovoLogin)
                            .addComponent(lbNomeCadastrado))
                        .addGap(57, 57, 57)
                        .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLogin)
                            .addComponent(txtConfirmarSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                    .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnNovoCadastroLayout.setVerticalGroup(
            pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCadastrado)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovoLogin)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovaSenha)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addGap(45, 45, 45))
        );

        pnCadUsuario.addTab("Cadastrar", pnNovoCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
         try{
            PreparedStatement deletar = BancoDeDados.retornarConexao().prepareStatement("DELETE FROM usuario WHERE codigo_USUARIO="+codigousuario);
            deletar.executeUpdate();
            txtLogin.setText("");           
            txtSenha.setText("");
            txtConfirmarSenha.setText("");       
        }catch (SQLException ex) {
           
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        //usuario sol = new Solicitacao(txtPesquisar.getText());
        //usuarioDAO.consultaSolicitacoes(sol.getNum_processo(),tbUsuario_Consulta);
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    try {
                    
                    Connection con = BancoDeDados.retornarConexao();
                    PreparedStatement pesquisa = con.prepareStatement("select * from usuario where login like ?");
                    pesquisa.setString(1, "%" + txtPesquisar.getText() + "%");
                    ResultSet resultado = pesquisa.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tbUsuarioConsulta.getModel();
                    model.setNumRows(0);
                    while (resultado.next()) {
                        model.addRow(new Object[]{resultado.getString("codigo_usuario"), resultado.getString("login"),});
                    }
                    resultado.close();
                    pesquisa.close();
                } catch (SQLException ex) {
           Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
                }        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       try {
            if (codigousuario == null) {
                UsuarioDAO.CadastrarUsuario(txtLogin.getText(),txtSenha.getText());
            } else {
                UsuarioDAO.AlterarUsuario(codigousuario,txtLogin.getText(),txtSenha.getText());
            }
        } catch (Exception e) {
        }
         txtLogin.setText("");
         txtSenha.setText("");
         txtConfirmarSenha.setText("");       
         pnCadUsuario.setSelectedIndex(0);
         this.codigousuario=null;
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
         this.codigousuario=null;
         txtLogin.setText("");
         txtSenha.setText("");
         txtConfirmarSenha.setText("");
         
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void tbUsuarioConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioConsultaMouseClicked
       this.codigousuario = tbUsuarioConsulta.getValueAt(tbUsuarioConsulta.getSelectedRow(), 0).toString();
       pnCadUsuario.setSelectedIndex(1);
       try {
            PreparedStatement pesquisa = BancoDeDados.retornarConexao().prepareStatement("select * from usuario where codigo_usuario="+codigousuario);
            ResultSet resultado = pesquisa.executeQuery();
            if (resultado != null && resultado.next()) {
                txtLogin.setText(resultado.getString("login"));
                txtSenha.setText(resultado.getString("senha"));
               
            }
            pesquisa.close();

        } catch (SQLException ex) {
        }
       txtPesquisar.setText("");
    }//GEN-LAST:event_tbUsuarioConsultaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNomeCadastrado;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbNovoLogin;
    private javax.swing.JTabbedPane pnCadUsuario;
    private javax.swing.JPanel pnConsultar;
    private javax.swing.JPanel pnNovoCadastro;
    private javax.swing.JTable tbUsuarioConsulta;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void UpdateJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
