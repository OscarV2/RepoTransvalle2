package vista_login;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.GestionBuses.Gestionar_buses;
import vista_recaudo.GestionRecaudo;

public class Login extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    List<Usuario> todosLosUsuarios; // lista vacia tipo usuarios 
    String rolSelected;

    public Login() { // Constructor de Login generado automatocamente
        initComponents(); // inicializar todos los componentes del jframe
        setLocationRelativeTo(null);
        emf = Persistence.createEntityManagerFactory("Transvalle2PU");  // inicializar entitymanagerfactory
        em = emf.createEntityManager(); // inicializar EntityManager
        tx = em.getTransaction(); // inicializar  EntityTransaction
        rolSelected = null;
        todosLosUsuarios = em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList(); // consultar todos los usuarios

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roles = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        radioJefe = new javax.swing.JRadioButton();
        radioAuxiliar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtusuario.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Rol:");

        txtPass.setBorder(null);

        btnIniciarSesion.setBackground(new java.awt.Color(0, 204, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Contraseña:");

        roles.add(radioJefe);
        radioJefe.setForeground(new java.awt.Color(0, 102, 204));
        radioJefe.setText("Jefe de ruta");
        radioJefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioJefeMouseClicked(evt);
            }
        });
        radioJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioJefeActionPerformed(evt);
            }
        });

        roles.add(radioAuxiliar);
        radioAuxiliar.setForeground(new java.awt.Color(0, 102, 255));
        radioAuxiliar.setText("Auxiliar contable");
        radioAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAuxiliarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Iniciar sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario)
                            .addComponent(txtPass)
                            .addComponent(radioJefe)
                            .addComponent(radioAuxiliar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel4)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radioJefe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAuxiliar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        // nuevo usuario y contraseña
        String usuarioDigitado = txtusuario.getText();         // variable con el usuario digitado en el campo Usuario      
        System.err.println(usuarioDigitado);
        if (!usuarioDigitado.isEmpty()) {
            String pass = new String(txtPass.getPassword());

        TypedQuery consultarUsuario = em.createNamedQuery("Usuario.findByUsuario", Usuario.class);
        consultarUsuario.setParameter("usuario", usuarioDigitado);

        todosLosUsuarios = consultarUsuario.getResultList();
        Usuario user = todosLosUsuarios.get(0);

        if (usuarioDigitado.equals(user.getUsuario())) {  // si el nombre de usuario digitado es igual al usuario de la lista 
            // iniciar sesion
            System.err.println("usuario correcto");
            if (pass.equals(user.getContraseña())) { // si la contraseña coincide
                //  JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso", "Felicidades ", JOptionPane.INFORMATION_MESSAGE);
                String rol = user.getRol(); // guardar en la variavle rol el rol del usuario
                System.err.println(rol);

                if (rol.equals(rolSelected)) { // 

                    switch (rol) {
                        case ("Jefe de ruta"):
                            this.setVisible(false);  // ocultar login
                            Gestionar_buses buses = new Gestionar_buses();
                            buses.setVisible(true);
                            break;
                        case ("Auxiliar contable"):
                            // ir a gestion
                            this.setVisible(false);  // ocultar login
                            GestionRecaudo recaudo = new GestionRecaudo();
                            recaudo.setVisible(true);
                            break;
                    }

                    // ir a planilla de control
                } else {
                    JOptionPane.showMessageDialog(this, "Cambie su rol", "Rol no valido", JOptionPane.INFORMATION_MESSAGE);

                }

            } else { // no coincide la contraseña
                JOptionPane.showMessageDialog(this, "No coincide la contraseña", "pass invalidap", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Este usuario no existe", "digite otro", JOptionPane.ERROR_MESSAGE);
        }
        
        } else {
            JOptionPane.showMessageDialog(this, "Por favor digite usuario", "Campo usuario vacío", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void radioJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioJefeActionPerformed
        rolSelected = "Jefe de ruta";
    }//GEN-LAST:event_radioJefeActionPerformed

    private void radioJefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioJefeMouseClicked

    }//GEN-LAST:event_radioJefeMouseClicked

    private void radioAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAuxiliarActionPerformed
        rolSelected = "Auxiliar contable";
    }//GEN-LAST:event_radioAuxiliarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioAuxiliar;
    private javax.swing.JRadioButton radioJefe;
    private javax.swing.ButtonGroup roles;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
