
package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.DAO.BancoDeDados;
import br.arraial.ICMBIO.DAO.SolicitacaoDAO;
import br.arraial.ICMBIO.DAO.UsuarioDAO;
import br.arraial.ICMBIO.model.*;
import br.arraial.ICMBIO.telas.Login;
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

  
    public CadUsuario() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCadUsuario = new javax.swing.JTabbedPane();
        pnConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario_Consulta = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pnNovoCadastro = new javax.swing.JPanel();
        lbNomeCadastrado = new javax.swing.JLabel();
        lbSobrenomeCadastrado = new javax.swing.JLabel();
        lbNovoLogin = new javax.swing.JLabel();
        lbNovaSenha = new javax.swing.JLabel();
        lbNovaSenhaConfirmar = new javax.swing.JLabel();
        txtNomeCadastrado = new javax.swing.JTextField();
        txtNovoLogin = new javax.swing.JTextField();
        txtNovoSobrenome = new javax.swing.JTextField();
        txtNovaSenha = new javax.swing.JPasswordField();
        txtNovaSenhaConfirmar = new javax.swing.JPasswordField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        tbUsuario_Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuários", "login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbUsuario_Consulta);

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
                .addGroup(pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnConsultarLayout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnConsultarLayout.setVerticalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pnCadUsuario.addTab("Consultar", pnConsultar);

        lbNomeCadastrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeCadastrado.setText("Nome:");

        lbSobrenomeCadastrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSobrenomeCadastrado.setText("Sobrenome:");

        lbNovoLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNovoLogin.setText("Login:");

        lbNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNovaSenha.setText("Senha:");

        lbNovaSenhaConfirmar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNovaSenhaConfirmar.setText("Confirmar senha:");

        txtNomeCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastradoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNovoCadastroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNovaSenhaConfirmar)
                    .addComponent(lbNovaSenha)
                    .addComponent(lbNovoLogin)
                    .addComponent(lbNomeCadastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNovaSenha)
                    .addComponent(txtNovaSenhaConfirmar)
                    .addComponent(txtNovoLogin)
                    .addComponent(txtNomeCadastrado))
                .addGap(10, 10, 10)
                .addComponent(lbSobrenomeCadastrado)
                .addGap(18, 18, 18)
                .addComponent(txtNovoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnNovoCadastroLayout.setVerticalGroup(
            pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNovoCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCadastrado)
                    .addComponent(lbSobrenomeCadastrado)
                    .addComponent(txtNomeCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovoLogin)
                    .addComponent(txtNovoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovaSenha)
                    .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovaSenhaConfirmar)
                    .addComponent(txtNovaSenhaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(pnNovoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
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

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Connection conexao = BancoDeDados.retornarConexao();
        try { 
            PreparedStatement alterar = conexao.prepareStatement("update from usuario set nome=? where login ="+txtNovoLogin.getText());
            alterar.setString(1, txtNomeCadastrado.getText());
            alterar.execute();
          
        } catch (SQLException ex) {
            Logger.getLogger(CadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
 try {
            PreparedStatement deletar = BancoDeDados.retornarConexao().prepareStatement("DELETE FROM usuario WHERE nome= ?");
            deletar.executeUpdate();
            txtNomeCadastrado.setText("");
            txtNovoLogin.setText("");
            txtNovaSenha.setText("");
            txtNovaSenhaConfirmar.setText("");
            txtNovoSobrenome.setText("");
            deletar.execute();
            deletar.close();
        } catch (SQLException ex) {
            System.out.println(ex);
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
                    DefaultTableModel model = (DefaultTableModel) tbUsuario_Consulta.getModel();
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
    
    
    if(Arrays.equals(txtNovaSenha.getPassword(), txtNovaSenhaConfirmar.getPassword())){
        Usuario user = new Usuario(txtNovoLogin.getText(), String.valueOf(txtNovaSenha.getPassword()), txtNomeCadastrado.getText());
        UsuarioDAO.Cadastrar(user.getLogin(),user.getSenha() , user.getNome());
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");

    }
    else{
        JOptionPane.showMessageDialog(null,"As senhas não correspondem!");
    }
    
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtNomeCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadastradoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
         txtNomeCadastrado.setText("");
         txtNovoLogin.setText("");
         txtNovaSenha.setText("");
         txtNovaSenhaConfirmar.setText("");
         txtNovoSobrenome.setText("");
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNomeCadastrado;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbNovaSenhaConfirmar;
    private javax.swing.JLabel lbNovoLogin;
    private javax.swing.JLabel lbSobrenomeCadastrado;
    private javax.swing.JTabbedPane pnCadUsuario;
    private javax.swing.JPanel pnConsultar;
    private javax.swing.JPanel pnNovoCadastro;
    private javax.swing.JTable tbUsuario_Consulta;
    private javax.swing.JTextField txtNomeCadastrado;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtNovaSenhaConfirmar;
    private javax.swing.JTextField txtNovoLogin;
    private javax.swing.JTextField txtNovoSobrenome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private void UpdateJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
