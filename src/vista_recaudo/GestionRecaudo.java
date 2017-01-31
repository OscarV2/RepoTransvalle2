/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_recaudo;

import com.toedter.calendar.JCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Panillarecaudo;


public class GestionRecaudo extends javax.swing.JFrame {
    private EntityManagerFactory emf; 
    private EntityManager em;
    private EntityTransaction tx;
    Panillarecaudo Planilla;   
    DefaultTableModel modelTabla;
    /**
     * Creates new form GestionRecaudo
     */
    public GestionRecaudo() {
        initComponents();
        setLocationRelativeTo(null);
        emf = Persistence.createEntityManagerFactory("Transvalle2PU");  // inicializar entitymanagerfactory
        em = emf.createEntityManager(); // inicializar EntityManager
        tx = em.getTransaction(); // inicializar  EntityTransaction
        Object[] nombresColumnas = {"Vial", "H. Salida", "Ruta", "Recorridos", "Inicio Torniquete", "Final Torniquete", "No. Pasajeros", "Total Bruto", "ACPM", "Sueldo", "Aseo","Otros","Turno","Total gastos", "Producto Neto"};
        modelTabla = new DefaultTableModel(new Object[0][0], nombresColumnas);
        
        tablaRecaudo.setModel(modelTabla);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new com.toedter.calendar.JDateChooser();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecaudo = new javax.swing.JTable();
        btnNuevaPlanilla = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConsultar.setBackground(new java.awt.Color(153, 153, 255));
        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tablaRecaudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRecaudo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaRecaudo.setColumnSelectionAllowed(true);
        tablaRecaudo.setRowHeight(22);
        tablaRecaudo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaRecaudo);
        tablaRecaudo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnNuevaPlanilla.setBackground(new java.awt.Color(153, 153, 255));
        btnNuevaPlanilla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNuevaPlanilla.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaPlanilla.setText("Nuevo");
        btnNuevaPlanilla.setBorder(null);
        btnNuevaPlanilla.setBorderPainted(false);
        btnNuevaPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPlanillaActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 153, 255));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnNuevaPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaPlanilla, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // click en boton consultar planilla
        if (txtFecha.getDate() != null) {    // si el usuario ingreso una fecha valida
            TypedQuery consultarPlanilla = em.createNamedQuery("Panillarecaudo.findByFecha", Panillarecaudo.class);
            consultarPlanilla.setParameter("fecha", txtFecha.getDate());
            
            List<Panillarecaudo> listaPlanilla = consultarPlanilla.getResultList(); 
            for (Panillarecaudo panillarecaudo : listaPlanilla) {
                Object[] o = new Object[15];
                o[0] = panillarecaudo.getVial();
                o[1] = panillarecaudo.getHoraSalida();
                o[2] = panillarecaudo.getRuta();
                o[3] = panillarecaudo.getRecorrido();
                o[4] = panillarecaudo.getInicioTorniquete();
                o[5] = panillarecaudo.getFinalTorniquete();
                o[6] = panillarecaudo.getNumeroPasajeros();
                o[7] = panillarecaudo.getProducidoBruto();
                o[8] = panillarecaudo.getIdgasto().getAcpm();
                o[9] = panillarecaudo.getIdgasto().getSueldoconductor();
                o[10] = panillarecaudo.getIdgasto().getAseo();
                o[11] = panillarecaudo.getIdgasto().getOtros();
                o[12] = panillarecaudo.getIdgasto().getTurno();
                o[13] = panillarecaudo.getIdgasto().getTotalGatos();
                o[14] = panillarecaudo.getIdgasto().getProducidoNeto(); 
                modelTabla.addRow(o);
                
                
            }
            tablaRecaudo.setModel(modelTabla);
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe escoger fecha", "Fecha vacia ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNuevaPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPlanillaActionPerformed
       RegistroPlanilla irAregistro = new RegistroPlanilla(emf,em, tx);
       irAregistro.setVisible(true);
       this.setVisible(false);

    }//GEN-LAST:event_btnNuevaPlanillaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionRecaudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionRecaudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionRecaudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionRecaudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionRecaudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevaPlanilla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRecaudo;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
}
