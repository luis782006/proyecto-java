/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class frmContratos extends javax.swing.JFrame {

    /**
     * Creates new form frmContratos
     */
    public frmContratos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cmbTaxiEmpresa.setModel(frmChoferes.modeloChoferes);
        cmbTaxiEmpresa.setSelectedIndex(-1);
        new ValidacionLetras(txtNombreEmpresa);
        new ValidacionNumeros(txtTelefonoEmpresa);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        txtDireccionEmpresa = new javax.swing.JTextField();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkLunes = new javax.swing.JCheckBox();
        chkMartes = new javax.swing.JCheckBox();
        chkMiercoles = new javax.swing.JCheckBox();
        chkJueves = new javax.swing.JCheckBox();
        chkSabado = new javax.swing.JCheckBox();
        chkViernes = new javax.swing.JCheckBox();
        chkDomingo = new javax.swing.JCheckBox();
        PanelTaxiP = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cmbTaxiEmpresa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarEmpresa = new javax.swing.JButton();
        btnSalirEmpresa = new javax.swing.JButton();

        setTitle("Taxis por Contratos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Empresa:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Direccion:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        txtTelefonoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDireccionEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNombreEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empresa.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        chkLunes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkLunes.setText("Lunes");

        chkMartes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkMartes.setText("Martes");

        chkMiercoles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkMiercoles.setText("Miercoles");

        chkJueves.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkJueves.setText("Jueves");

        chkSabado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSabado.setText("Sabado");

        chkViernes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkViernes.setText("Viernes");

        chkDomingo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkDomingo.setText("Domingo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkLunes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMartes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMiercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkJueves))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chkViernes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkDomingo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLunes)
                    .addComponent(chkMartes)
                    .addComponent(chkMiercoles)
                    .addComponent(chkJueves))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSabado)
                        .addComponent(chkDomingo))
                    .addComponent(chkViernes))
                .addContainerGap())
        );

        PanelTaxiP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos chofer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        PanelTaxiP.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        cmbTaxiEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTaxiEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/taxi-chico.png"))); // NOI18N

        javax.swing.GroupLayout PanelTaxiPLayout = new javax.swing.GroupLayout(PanelTaxiP);
        PanelTaxiP.setLayout(PanelTaxiPLayout);
        PanelTaxiPLayout.setHorizontalGroup(
            PanelTaxiPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaxiPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTaxiEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTaxiPLayout.setVerticalGroup(
            PanelTaxiPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaxiPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTaxiPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(cmbTaxiEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14))
        );

        btnGuardarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save (1).png"))); // NOI18N
        btnGuardarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpresaActionPerformed(evt);
            }
        });

        btnSalirEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log_out.png"))); // NOI18N
        btnSalirEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(btnGuardarEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalirEmpresa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PanelTaxiP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTaxiP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalirEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEmpresaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmPrincipalTaxi().setVisible(true);
    }//GEN-LAST:event_btnSalirEmpresaActionPerformed

    private void btnGuardarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpresaActionPerformed
        // TODO add your handling code here:
        if (txtNombreEmpresa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la empresa");
        } else {
            nombreEmpresa = txtNombreEmpresa.getText();
            if (txtDireccionEmpresa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese la direccion de la empresa");
            } else {
                direccionEmpresa = txtDireccionEmpresa.getText();
                if (txtTelefonoEmpresa.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese un telefono de la empresa");
                } else {
                    telefonoEmpresa = txtTelefonoEmpresa.getText();
                    if (!chkLunes.isSelected() == false && !chkMartes.isSelected() == false && !chkMiercoles.isSelected() == false && !chkJueves.isSelected() == false && !chkViernes.isSelected() == false && !chkSabado.isSelected() == false && !chkDomingo.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Escoja al menos un dia de recojida del contrato");
                    } else {
                        telefonoEmpresa = txtTelefonoEmpresa.getText();
                        if (cmbTaxiEmpresa.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(null, "Escoja un nombre del Taxistas");
                        } else {
                            taxistaEmpresa = String.valueOf(cmbTaxiEmpresa.getSelectedItem());
                           
                        }
                    }
                }
            }

        }
        
        direccionEmpresa=txtDireccionEmpresa.getText();
        telefonoEmpresa=txtTelefonoEmpresa.getName();
        ComprobacionDias();
        BorrarTexto();
      
       
    }//GEN-LAST:event_btnGuardarEmpresaActionPerformed

    public void ComprobacionDias(){
    
        if (chkLunes.isSelected()) {
            Lunes = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Lunes = "No";
        }
        if (chkMartes.isSelected()) {
            Martes = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Martes = "No";
        }
        if (chkMiercoles.isSelected()) {
            Miercoles = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Miercoles = "No";
        }
        if (chkJueves.isSelected()) {
            Jueves = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Jueves = "No";
        }
        if (chkViernes.isSelected()) {
            Viernes = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Viernes = "No";
        }
        if (chkSabado.isSelected()) {
            Sabado = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Sabado = "No";
        }
        if (chkDomingo.isSelected()) {
            Domingo = "Si";
            frecuencia = frecuencia + 1;
        } else {
            Domingo = "No";
        }
        String nl = System.getProperty("line.separator");// variable separadora de linea
        JOptionPane.showMessageDialog(null, "Se ingreso un nuevo contrato con la empresa:"  
                +nl+ nombreEmpresa.toUpperCase()
                + nl + "Dias de contratos"
                + nl + "Lunes: " + Lunes
                + nl + "Martes: " + Martes
                + nl + "Miercoles: " + Miercoles
                + nl + "Jueves: " + Jueves
                + nl + "Viernes: " + Viernes
                + nl + "Sabado: " + Sabado
                + nl + "Domingo: " + Domingo
                + nl + "Frecuencia a la semana: " + frecuencia);

         
    }
    
    public void BorrarTexto(){
    
        txtNombreEmpresa.setText("");
        txtDireccionEmpresa.setText("");
        txtTelefonoEmpresa.setText("");
        cmbTaxiEmpresa.setSelectedIndex(-1);
        chkLunes.setSelected(false);
        chkMartes.setSelected(false);
        chkMiercoles.setSelected(false);
        chkJueves.setSelected(false);
        chkViernes.setSelected(false);
        chkSabado.setSelected(false);
        chkDomingo.setSelected(false);
    }
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
            java.util.logging.Logger.getLogger(frmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmContratos().setVisible(true);
            }
        });
    }
    // Declaracion de variables para futuras salva de informacion
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String taxistaEmpresa;
    private String Lunes;
    private String Martes;
    private String Miercoles;
    private String Jueves;
    private String Viernes;
    private String Sabado;
    private String Domingo;
    private int frecuencia;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTaxiP;
    private javax.swing.JButton btnGuardarEmpresa;
    private javax.swing.JButton btnSalirEmpresa;
    private javax.swing.JCheckBox chkDomingo;
    private javax.swing.JCheckBox chkJueves;
    private javax.swing.JCheckBox chkLunes;
    private javax.swing.JCheckBox chkMartes;
    private javax.swing.JCheckBox chkMiercoles;
    private javax.swing.JCheckBox chkSabado;
    private javax.swing.JCheckBox chkViernes;
    public static javax.swing.JComboBox cmbTaxiEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtTelefonoEmpresa;
    // End of variables declaration//GEN-END:variables
}