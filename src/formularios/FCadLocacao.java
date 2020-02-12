package formularios;

import classes.Carro;
import classes.Locacao;
import static java.lang.Double.parseDouble;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FCadLocacao extends javax.swing.JDialog {
    private Locacao locacaoTemp = null;
    
    public FCadLocacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public Locacao execute(){
        this.setVisible(true);
                
        return this.locacaoTemp;
    }
    public Locacao execute(Locacao l){
        this.locacaoTemp = l;
        
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        
        txtCodigo.setText(l.getCodigo());
        txtDtLocacao.setText(f.format(l.getDataLocacao()));
        txtDiasLocado.setText(Integer.toString(l.getQtdeDiasLocado()));
        
        this.setVisible(true);
        return this.locacaoTemp;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cancelarCarro = new javax.swing.JButton();
        gravarCarro = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel8 = new javax.swing.JLabel();
        gravarLocacao = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblDiasLocado2 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<String>();
        cmbCarro = new javax.swing.JComboBox<String>();
        txtDtLocacao = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        cancelarLocacao = new javax.swing.JButton();
        lblDtLocacao = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiasLocado = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelarCarro.setText("Cancelar");
        cancelarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCarroActionPerformed(evt);
            }
        });

        gravarCarro.setText("Gravar");
        gravarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarCarroActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("Carro");

        gravarLocacao.setText("Gravar");
        gravarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarLocacaoActionPerformed(evt);
            }
        });

        jLabel9.setText("Cliente");

        lblDiasLocado2.setText("Dias Locado");

        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        cmbCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarroActionPerformed(evt);
            }
        });

        try {
            txtDtLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtLocacaoActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        cancelarLocacao.setText("Cancelar");
        cancelarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLocacaoActionPerformed(evt);
            }
        });

        lblDtLocacao.setText("Data de Locação");

        jLabel7.setText("Código");

        txtDiasLocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasLocadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarLocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravarLocacao))
                    .addComponent(txtDiasLocado)
                    .addComponent(txtDtLocacao)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblDtLocacao)
                    .addComponent(lblDiasLocado2)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDtLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiasLocado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiasLocado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarLocacao)
                    .addComponent(cancelarLocacao))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCarroActionPerformed
        
    }//GEN-LAST:event_cancelarCarroActionPerformed

    private void gravarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarCarroActionPerformed

    }//GEN-LAST:event_gravarCarroActionPerformed

    private void gravarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarLocacaoActionPerformed

        try{
            SimpleDateFormat f = new SimpleDateFormat("yyyy");

            Locacao locacao;
            locacao = new Locacao();

            locacao.setCodigo(txtCodigo.getText());
            locacao.setQtdeDiasLocado(Integer.parseInt(txtDiasLocado.getText()));
            locacao.setDataLocacao(f.parse(txtDtLocacao.getText()));
            
            this.locacaoTemp = locacao;
            this.setVisible(false);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                "Não foi possível gravar locacao. \n\n" + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_gravarLocacaoActionPerformed

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        /* if(cmbCliente.getSelectedIndex() > -1){
            Pessoa p = PessoaDados.lstPessoas.get(cmbCliente.getSelectedIndex());
            if(p != null){
                this.carregarTelefones(p.getTelefones());
            }
        }*/
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void cmbCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCarroActionPerformed

    private void txtDtLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtLocacaoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void cancelarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLocacaoActionPerformed
        this.locacaoTemp = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelarLocacaoActionPerformed

    private void txtDiasLocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasLocadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasLocadoActionPerformed

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
            java.util.logging.Logger.getLogger(FCadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FCadLocacao dialog = new FCadLocacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarCarro;
    private javax.swing.JButton cancelarLocacao;
    private javax.swing.JComboBox<String> cmbCarro;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JButton gravarCarro;
    private javax.swing.JButton gravarLocacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDiasLocado2;
    private javax.swing.JLabel lblDtLocacao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDiasLocado;
    private javax.swing.JFormattedTextField txtDtLocacao;
    // End of variables declaration//GEN-END:variables
}
