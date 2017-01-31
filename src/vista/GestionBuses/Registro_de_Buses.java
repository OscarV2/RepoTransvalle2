package vista.GestionBuses;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import modelo.Bus;

/**
 *
 * @author Estibenson
 */
public class Registro_de_Buses extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    Bus bus;

    public Registro_de_Buses(EntityManagerFactory emf, EntityManager em, EntityTransaction tx) {
        this.emf = emf;
        this.em = em;
        this.tx = tx;
        initComponents();
        btnGuardarCambios.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public Registro_de_Buses(EntityManagerFactory emf, EntityManager em, EntityTransaction tx, Bus bus) { // Constructor para editar bus
        this.emf = emf;
        this.em = em;
        this.tx = tx;
        this.bus = bus;
        initComponents();
        btnGuardarCambios.setLocation(btnRegistrar1.getLocation());
        btnRegistrar1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Editar bus");
        txtGestBusRegBusCapacidad.setText(bus.getCapacidad());
        txtGestBusRegBusChasis.setText(bus.getNumeroChasis());
        txtGestBusRegBusEstado.setText(bus.getEstado());
        txtGestBusRegBusFechaMatricula.setText(String.valueOf(bus.getFechaMatricula()));
        txtGestBusRegBusMarca.setText(bus.getMarca());
        txtGestBusRegBusMotor.setText(bus.getNumeroMotor());
        txtGestBusRegBusPlaca.setText(bus.getPlaca());
        txtObservaciones.setText(bus.getObservaciones());
        txtGestBusRegBusVial.setText(bus.getVial());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGestBusRegBusPlaca = new javax.swing.JTextField();
        txtGestBusRegBusEstado = new javax.swing.JTextField();
        txtGestBusRegBusMarca = new javax.swing.JTextField();
        txtGestBusRegBusChasis = new javax.swing.JTextField();
        txtGestBusRegBusMotor = new javax.swing.JTextField();
        txtGestBusRegBusCapacidad = new javax.swing.JTextField();
        txtGestBusRegBusVial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGestBusRegBusClase = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtGestBusRegBusServicio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnGuardarCambios = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        txtGestBusRegBusFechaMatricula = new javax.swing.JTextField();

        setTitle("Registro de Buses");

        jLabel1.setText("Placa:");

        jLabel2.setText("Vial:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Capacidad:");

        jLabel5.setText("No.Chasis:");

        jLabel7.setText("No.Motor:");

        jLabel8.setText("Estado:");

        jLabel10.setText("Observaciones:");

        txtGestBusRegBusVial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGestBusRegBusVialActionPerformed(evt);
            }
        });

        jLabel11.setText("FechaMatricula:");

        txtGestBusRegBusClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Microbus", "Bus" }));

        jLabel12.setText("Clase:");

        jLabel13.setText("Clase de Servicio:");

        txtGestBusRegBusServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preferencial", "Estandar" }));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        btnGuardarCambios.setBackground(new java.awt.Color(0, 204, 255));
        btnGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.setBorder(null);
        btnGuardarCambios.setBorderPainted(false);
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.setFocusPainted(false);
        btnGuardarCambios.setName("RegistrarBusBtn"); // NOI18N
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnRegistrar1.setBackground(new java.awt.Color(0, 204, 255));
        btnRegistrar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.setBorder(null);
        btnRegistrar1.setBorderPainted(false);
        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar1.setFocusPainted(false);
        btnRegistrar1.setName("RegistrarBusBtn"); // NOI18N
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(99, 99, 99))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(40, 40, 40)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGestBusRegBusPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGestBusRegBusVial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGestBusRegBusClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGestBusRegBusServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGestBusRegBusMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtGestBusRegBusChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGestBusRegBusCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGestBusRegBusMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGestBusRegBusEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(txtGestBusRegBusFechaMatricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(180, 180, 180))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGestBusRegBusPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGestBusRegBusVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGestBusRegBusClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtGestBusRegBusServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtGestBusRegBusCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGestBusRegBusMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtGestBusRegBusMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGestBusRegBusChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtGestBusRegBusFechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGestBusRegBusEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGestBusRegBusVialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGestBusRegBusVialActionPerformed
        // TODO add yourbtnGestBusEditGuardarCmbios
}//GEN-LAST:event_txtGestBusRegBusVialActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        if (txtGestBusRegBusMarca.getText().isEmpty()
                || txtGestBusRegBusVial.getText().isEmpty()
                || txtGestBusRegBusPlaca.getText().isEmpty()
                || txtGestBusRegBusCapacidad.getText().isEmpty()
                || txtGestBusRegBusMotor.getText().isEmpty()) {  //faltan algunos campos por llenar
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para registrar bus.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);           
                    
        } else {     //campos completados
            Bus bus = new Bus();
            bus.setCapacidad(txtGestBusRegBusCapacidad.getText());
            bus.setClase(txtGestBusRegBusClase.getSelectedItem().toString());
            bus.setClaseServicio(txtGestBusRegBusServicio.getSelectedItem().toString());
            bus.setEstado(txtGestBusRegBusEstado.getText());
            bus.setFechaMatricula(Integer.parseInt(txtGestBusRegBusFechaMatricula.getText()));
            bus.setMarca(txtGestBusRegBusMarca.getText());
            try {
                bus.setModelo(txtGestBusRegBusFechaMatricula.getText(0, 4));
                
                System.err.println(bus.getModelo());
            } catch (BadLocationException ex) {
                Logger.getLogger(Registro_de_Buses.class.getName()).log(Level.SEVERE, null, ex);
            }
            bus.setNumeroChasis(txtGestBusRegBusChasis.getText());
            bus.setNumeroMotor(txtGestBusRegBusMotor.getText());
            bus.setObservaciones(txtObservaciones.getText());
            bus.setPlaca(txtGestBusRegBusPlaca.getText());
            bus.setVial(txtGestBusRegBusVial.getText());

            tx.begin();
            em.persist(bus);
            tx.commit();
            JOptionPane.showMessageDialog(this, "Bus creado exitosamente");
            Gestionar_buses gestion = new Gestionar_buses();
            this.setVisible(false);
            gestion.setVisible(true);
        }
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (txtGestBusRegBusFechaMatricula.getText().isEmpty() || txtObservaciones.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para registrar bus.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        } else {
              bus.setCapacidad(txtGestBusRegBusCapacidad.getText());
            bus.setClase(txtGestBusRegBusClase.getSelectedItem().toString());
            bus.setClaseServicio(txtGestBusRegBusServicio.getSelectedItem().toString());
            bus.setEstado(txtGestBusRegBusEstado.getText());
            bus.setFechaMatricula(Integer.parseInt(txtGestBusRegBusFechaMatricula.getText()));
            bus.setMarca(txtGestBusRegBusMarca.getText());
            try {
                bus.setModelo(txtGestBusRegBusFechaMatricula.getText(0, 4));
                
                System.err.println(bus.getModelo());
            } catch (BadLocationException ex) {
                Logger.getLogger(Registro_de_Buses.class.getName()).log(Level.SEVERE, null, ex);
            }
            bus.setNumeroChasis(txtGestBusRegBusChasis.getText());
            bus.setNumeroMotor(txtGestBusRegBusMotor.getText());
            bus.setObservaciones(txtObservaciones.getText());
            bus.setPlaca(txtGestBusRegBusPlaca.getText());
            bus.setVial(txtGestBusRegBusVial.getText());
        
            tx.begin();
            em.merge(bus);
            tx.commit();
            JOptionPane.showMessageDialog(this, "Bus Editado exitosamente");
            this.setVisible(false);
            Gestionar_buses buses = new Gestionar_buses();
            buses.setVisible(true);
        }
    
      
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGestBusRegBusCapacidad;
    private javax.swing.JTextField txtGestBusRegBusChasis;
    private javax.swing.JComboBox<String> txtGestBusRegBusClase;
    private javax.swing.JTextField txtGestBusRegBusEstado;
    private javax.swing.JTextField txtGestBusRegBusFechaMatricula;
    private javax.swing.JTextField txtGestBusRegBusMarca;
    private javax.swing.JTextField txtGestBusRegBusMotor;
    private javax.swing.JTextField txtGestBusRegBusPlaca;
    private javax.swing.JComboBox<String> txtGestBusRegBusServicio;
    private javax.swing.JTextField txtGestBusRegBusVial;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
