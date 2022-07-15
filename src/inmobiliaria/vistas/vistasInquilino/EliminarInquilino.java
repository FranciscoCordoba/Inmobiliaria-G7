package inmobiliaria.vistas.vistasInquilino;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Modelo.Inquilino;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarInquilino extends javax.swing.JPanel {

    private InquilinoData inquilinoData;
    private Conexion con;
    private DefaultTableModel tablaModelo;
    

    public EliminarInquilino() {
        initComponents();
        con = new Conexion();
        inquilinoData = new InquilinoData(con);
        tablaModelo = new DefaultTableModel();
        armarTabla();
        jbLimpiar.setEnabled(false);
        jbtnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInquilinosTablaEliminar = new javax.swing.JTable();
        jtDniEliminar = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DNI");

        Buscar.setBackground(new java.awt.Color(0, 63, 121));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jtInquilinosTablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtInquilinosTablaEliminar);

        jtDniEliminar.setBackground(new java.awt.Color(217, 217, 217));
        jtDniEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniEliminarActionPerformed(evt);
            }
        });
        jtDniEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniEliminarKeyTyped(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDniEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jbtnEliminar)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDniEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbLimpiar))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        try {
            if (jtDniEliminar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden quedar campos vacíos");
            } else {
                long dni = Long.parseLong(jtDniEliminar.getText());
                Inquilino inquilino = inquilinoData.obtenerInquilinoPorDni(dni);
                tablaModelo.addRow(new Object[]{inquilino.getNombre(), inquilino.getApellido(), inquilino.getDni(), inquilino.getCuit(), inquilino.getLugarTrabajo(), inquilino.getNombreGarante(), inquilino.getDniGarante()});
                jbtnEliminar.setEnabled(true);
                jbLimpiar.setEnabled(true);
                Buscar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún inquilino con ese DNI");
        }

    }//GEN-LAST:event_BuscarActionPerformed

    private void jtDniEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniEliminarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {
            int filaSeleccionada = jtInquilinosTablaEliminar.getSelectedRow();

            if (filaSeleccionada != -1) {
                long idInquilino = (Long) tablaModelo.getValueAt(filaSeleccionada, 2);
                Inquilino inquilino = inquilinoData.obtenerInquilinoPorDni(idInquilino);
                inquilinoData.bajaInquilo(inquilino.getIdInquilino());
                jbLimpiar.setEnabled(true);
                Buscar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No puede eliminar");
        }


    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtDniEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniEliminarKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtDniEliminar.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniEliminarKeyTyped

    private void armarTabla() {

        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("DNI");
        columnas.add("CUIT");
        columnas.add("Trabajo");
        columnas.add("Garante");
        columnas.add("DNI Garante");

        for (Object it : columnas) {
            tablaModelo.addColumn(it);
        }
        jtInquilinosTablaEliminar.setModel(tablaModelo);

    }

    private void limpiarCampos() {
        jtDniEliminar.setText("");

        if (tablaModelo != null) {

            int a = tablaModelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                tablaModelo.removeRow(i);
            }
        }
        jbLimpiar.setEnabled(false);
        Buscar.setEnabled(true);
        jbtnEliminar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JTextField jtDniEliminar;
    private javax.swing.JTable jtInquilinosTablaEliminar;
    // End of variables declaration//GEN-END:variables
}
