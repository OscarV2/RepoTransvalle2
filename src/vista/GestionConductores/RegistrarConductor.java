package vista.GestionConductores;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author oscar
 */
public class RegistrarConductor extends javax.swing.JFrame {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    private Persona conductor;
    
    public RegistrarConductor(EntityManagerFactory emf, EntityManager em, EntityTransaction tx, Persona conductor) { // Constructor para editar conductor
        this.emf = emf;
        this.em = em;
        this.tx = tx;
        this.conductor = conductor;
        this.setTitle("Editar Conductor");
        initComponents();
        
        btnCondEditGuardarCambios.setLocation(jButton1.getLocation());
        jButton1.setVisible(false);
        this.setLocationRelativeTo(null);
        txtCondRegisNuevoApellido.setText(conductor.getApellido());
        txtCondRegistrarNuevoNoDocumento.setText(String.valueOf(conductor.getCedula()));
        txtCondRegisNuevoNombre.setText(conductor.getNombre());
        txtCondRegisNuevoDireccion.setText(conductor.getDirección());
        txtCondRegisNuevoFecha.setDate(conductor.getFechaNacimiento());
        lblTitulo.setText("Editar Conductor");
    }
    
    public RegistrarConductor(EntityManagerFactory emf, EntityManager em, EntityTransaction tx) {
        this.emf = emf;
        this.em = em;
        this.tx = tx;        
        initComponents();
        btnCondEditGuardarCambios.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtCondRegistrarNuevoNoDocumento = new javax.swing.JTextField();
        txtCondRegisNuevoNombre = new javax.swing.JTextField();
        txtCondRegisNuevoApellido = new javax.swing.JTextField();
        txtCondRegisNuevoDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtCondRegisNuevoFecha = new com.toedter.calendar.JDateChooser();
        btnCondEditGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Conductor");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("No de Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Apellido");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        lblTitulo.setText("Nuevo Conductor");

        btnCondEditGuardarCambios.setBackground(new java.awt.Color(0, 204, 255));
        btnCondEditGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnCondEditGuardarCambios.setText("Guardar Cambios");
        btnCondEditGuardarCambios.setBorder(null);
        btnCondEditGuardarCambios.setBorderPainted(false);
        btnCondEditGuardarCambios.setFocusPainted(false);
        btnCondEditGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondEditGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCondRegisNuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtCondRegisNuevoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtCondRegisNuevoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtCondRegistrarNuevoNoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtCondRegisNuevoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblTitulo)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCondEditGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCondRegistrarNuevoNoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondRegisNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondRegisNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondRegisNuevoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCondRegisNuevoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCondEditGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtCondRegisNuevoApellido.getText().isEmpty() 
                || txtCondRegistrarNuevoNoDocumento.getText().isEmpty() 
                || txtCondRegisNuevoNombre.getText().isEmpty() 
                || txtCondRegisNuevoDireccion.getText().isEmpty()
                || txtCondRegisNuevoFecha.getDate().equals(null)) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para registrar Conductor.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
            
        } else {
        Persona nuevoConductor = new Persona();
        nuevoConductor.setApellido(txtCondRegisNuevoApellido.getText());
        nuevoConductor.setCedula(txtCondRegistrarNuevoNoDocumento.getText());
        nuevoConductor.setNombre(txtCondRegisNuevoNombre.getText());
        nuevoConductor.setDirección(txtCondRegisNuevoDireccion.getText());
        nuevoConductor.setFechaNacimiento(txtCondRegisNuevoFecha.getDate());
        tx.begin();                 //  comenzar nueva transaccion de recursos
        em.persist(nuevoConductor); //almacena nuevas entidad en base de datos.
        tx.commit();                // "commit changes" realizar cambios en la base de datos  
        JOptionPane.showMessageDialog(this, "Conductor creado exitosamente");
        GestionConductores gestion = new GestionConductores();
        this.setVisible(false);
        gestion.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCondEditGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondEditGuardarCambiosActionPerformed
        conductor.setApellido(txtCondRegisNuevoApellido.getText());
        conductor.setCedula(txtCondRegistrarNuevoNoDocumento.getText());
        conductor.setDirección(txtCondRegisNuevoDireccion.getText());
        conductor.setFechaNacimiento(txtCondRegisNuevoFecha.getDate());
        conductor.setNombre(txtCondRegisNuevoNombre.getText());
        tx.begin();
        em.merge(conductor);
        tx.commit();
        JOptionPane.showMessageDialog(this, "Conductor Actualizado exitosamente");
        GestionConductores gestion = new GestionConductores();
        this.setVisible(false);
        gestion.setVisible(true);
        
    }//GEN-LAST:event_btnCondEditGuardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //          new RegistrarConductor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCondEditGuardarCambios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCondRegisNuevoApellido;
    private javax.swing.JTextField txtCondRegisNuevoDireccion;
    private com.toedter.calendar.JDateChooser txtCondRegisNuevoFecha;
    private javax.swing.JTextField txtCondRegisNuevoNombre;
    private javax.swing.JTextField txtCondRegistrarNuevoNoDocumento;
    // End of variables declaration//GEN-END:variables
}
