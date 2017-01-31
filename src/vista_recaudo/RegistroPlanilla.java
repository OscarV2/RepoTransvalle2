/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_recaudo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Bus;
import modelo.Gasto;
import modelo.Panillarecaudo;
import modelo.Ruta;

/**
 *
 * @author oscar
 */
public class RegistroPlanilla extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    List<Ruta> rutas;
    Object[] nombresRutas;
    List<Bus> listaBuses;
    Object[] viales;
    Panillarecaudo planilla;
    Gasto gastos;
    public RegistroPlanilla() {                       
    }

    public RegistroPlanilla(EntityManagerFactory emf ,EntityManager em, EntityTransaction tx) {
        initComponents();
        setLocationRelativeTo(null);
        this.emf = emf;
        this.em = em;
        this.tx = tx;
        btnGuardarCambios.setVisible(false);
        //////////////////////////// llenar comobobox con rutas/////////////////////////////77
        rutas = this.em.createNamedQuery("Ruta.findAll").getResultList();
        listaBuses = this.em.createNamedQuery("Bus.findAll").getResultList();
        nombresRutas = new Object[rutas.size()];   // el vector que contiene los nombres de las rutas debe ser del mismo tamaño que la lista que 
                                           // contiene todas las rutas
        for (int i = 0; i < rutas.size(); i++) {
            nombresRutas[i] = rutas.get(i).getNombre();
            System.out.println(nombresRutas[i]);
        }
        comboRutas.setModel(new DefaultComboBoxModel(nombresRutas));
        
        // llenar comobobox con viales
        llenarCombo(listaBuses);
        txtACPM.setText("0");
        txtAseo.setText("0");
        txtOtros.setText("0");
        txtPasaje.setText("1500");
        txtTurno.setText("0");
        txtRecorrido.setText("0");
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboRutas = new javax.swing.JComboBox<>();
        comboViales = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtFinalTorq = new javax.swing.JTextField();
        txtRecorrido = new javax.swing.JTextField();
        txtOtros = new javax.swing.JTextField();
        txtACPM = new javax.swing.JTextField();
        txtAseo = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        btnCrearPlanilla = new javax.swing.JButton();
        txtPasaje = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Ruta:");

        comboRutas.setBackground(new java.awt.Color(255, 255, 102));
        comboRutas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboRutas.setForeground(new java.awt.Color(0, 0, 255));
        comboRutas.setBorder(null);
        comboRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboViales.setBackground(new java.awt.Color(255, 255, 102));
        comboViales.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboViales.setForeground(new java.awt.Color(0, 0, 255));
        comboViales.setBorder(null);
        comboViales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("FinalTorniquete:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Vial:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Recorrido:");

        txtFinalTorq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFinalTorq.setBorder(null);

        txtRecorrido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRecorrido.setBorder(null);

        txtOtros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtOtros.setBorder(null);

        txtACPM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtACPM.setBorder(null);

        txtAseo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAseo.setBorder(null);

        txtSueldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSueldo.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Sueldo Conductor:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Otros:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("ACPM:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Valor Pasaje ($):");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Turno:");

        txtTurno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTurno.setBorder(null);

        btnCrearPlanilla.setBackground(new java.awt.Color(153, 153, 255));
        btnCrearPlanilla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCrearPlanilla.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPlanilla.setText("Crear Planilla");
        btnCrearPlanilla.setBorder(null);
        btnCrearPlanilla.setBorderPainted(false);
        btnCrearPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanillaActionPerformed(evt);
            }
        });

        txtPasaje.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPasaje.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Aseo:");

        btnGuardarCambios.setBackground(new java.awt.Color(153, 153, 255));
        btnGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.setBorder(null);
        btnGuardarCambios.setBorderPainted(false);
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(68, 68, 68)
                        .addComponent(txtPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 87, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboViales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboRutas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(txtRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFinalTorq, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrearPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAseo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtACPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOtros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(522, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(222, 222, 222)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtACPM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboViales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAseo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinalTorq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(374, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanillaActionPerformed
        // Click en boton crear planilla 
        // revisar si existen campos vacios
        if (nohaycamposvacios()) {
            // primero creamos un nuevo registro de gastos
            int bruto = calcularGastos();
            // datos planilla
        planilla = new Panillarecaudo();
        planilla.setFecha(txtFecha.getDate());
        planilla.setIdgasto(gastos);
        planilla.setInicioTorniquete(0);
        planilla.setRuta(comboRutas.getSelectedItem().toString());
        planilla.setRecorrido(txtRecorrido.getText());
        planilla.setFinalTorniquete(Integer.parseInt(txtFinalTorq.getText()));
        planilla.setHoraSalida(txtFecha.getDate());
        planilla.setNumeroPasajeros(Integer.parseInt(txtFinalTorq.getText()));
        planilla.setProducidoBruto(bruto);
        planilla.setVial(comboViales.getSelectedItem().toString());
        
        tx.begin();
        em.persist(planilla);
        tx.commit();
        
        GestionRecaudo volverArecaudo = new GestionRecaudo();
        volverArecaudo.setVisible(true);
        this.setVisible(false);
        } else{
            JOptionPane.showMessageDialog(this, "Llene todos los campos para continuar", "Cmpos vacíos", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnCrearPlanillaActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPlanilla().setVisible(true);
            }
        });
    }
    private int calcularGastos() {
        gastos = new Gasto();
        // Obtenemos los datos de las cajas de texto
        int acpm   = Integer.parseInt(txtACPM.getText());    
        int aseo   = Integer.parseInt(txtAseo.getText());
        int pasaje   = Integer.parseInt(txtPasaje.getText());
        int numPasajeros   = Integer.parseInt(txtFinalTorq.getText());
        int sueldo   = Integer.parseInt(txtSueldo.getText());
        int otros   = Integer.parseInt(txtOtros.getText());
        int turno   = Integer.parseInt(txtTurno.getText());
        
        int pBruto = pasaje*numPasajeros;
        
        int totalGastos = acpm + aseo + sueldo + otros + turno;
        // llenar objeto gastos
        gastos.setAcpm(acpm);
        gastos.setAseo(aseo);
        gastos.setOtros(otros);
        gastos.setTurno(turno);
        gastos.setProducidoNeto(pBruto - totalGastos);
        gastos.setSueldoconductor(sueldo);
        gastos.setTotalGatos(totalGastos);
        tx.begin();
        em.persist(gastos);
        tx.commit();
        return pBruto;
        
    }
    private void llenarCombo(List<Bus> listaBuses) {
        viales = new Object[listaBuses.size()];  // el vector que contiene los nombres de las rutas debe ser del mismo tamaño que la lista que 
                                           // contiene todas las rutas
        for (int i = 0; i < viales.length; i++) {
            viales[i] = listaBuses.get(i).getVial();
   
        }
        comboViales.setModel(new DefaultComboBoxModel(viales));                                  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPlanilla;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> comboRutas;
    private javax.swing.JComboBox<String> comboViales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtACPM;
    private javax.swing.JTextField txtAseo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFinalTorq;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtPasaje;
    private javax.swing.JTextField txtRecorrido;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables

    private boolean nohaycamposvacios() {
        boolean si= false;
        if (txtACPM.getText().isEmpty() 
                || txtAseo.getText().isEmpty() 
                || txtFinalTorq.getText().isEmpty() 
                || txtOtros.getText().isEmpty() 
                || txtPasaje.getText().isEmpty()
                || txtRecorrido.getText().isEmpty() 
                || txtFecha.getDate() == null
                || txtSueldo.getText().isEmpty()
                || txtTurno.getText().isEmpty()) {
            si = false;
            
        } else{
            si = true;
        }
        return si;
    }


    
}
