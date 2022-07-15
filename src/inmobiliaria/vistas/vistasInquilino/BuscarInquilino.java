package inmobiliaria.vistas.vistasInquilino;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Modelo.Inquilino;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarInquilino extends javax.swing.JPanel {

    private InquilinoData inquilinoData;
    private Conexion con;
    private DefaultTableModel tablaModelo;
    private int contador;

    public BuscarInquilino() {
        initComponents();
        con = new Conexion();
        inquilinoData = new InquilinoData(con);
        tablaModelo = new DefaultTableModel();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInquilinosTabla = new javax.swing.JTable();
        jtDniBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        jtInquilinosTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtInquilinosTabla);

        jtDniBuscar.setBackground(new java.awt.Color(217, 217, 217));
        jtDniBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniBuscarFocusLost(evt);
            }
        });
        jtDniBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniBuscarActionPerformed(evt);
            }
        });

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
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
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

    private void jtDniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniBuscarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (contador != 1) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos correctamente");
        } else {
            long dni = Long.parseLong(jtDniBuscar.getText());

            try {

                Inquilino inquilino = inquilinoData.obtenerInquilinoPorDni(dni);
                tablaModelo.addRow(new Object[]{inquilino.getNombre(), inquilino.getApellido(), inquilino.getDni(), inquilino.getCuit(), inquilino.getLugarTrabajo(), inquilino.getNombreGarante(), inquilino.getDniGarante()});

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún inquilino con ese DNI");
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jtDniBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniBuscarFocusLost
        String texto = jtDniBuscar.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                contador++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtDniBuscar.requestFocus();
        }
    }//GEN-LAST:event_jtDniBuscarFocusLost

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
        jtInquilinosTabla.setModel(tablaModelo);

    }

    private void limpiarCampos() {
        jtDniBuscar.setText("");

        if (tablaModelo != null) {

            int a = tablaModelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                tablaModelo.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDniBuscar;
    private javax.swing.JTable jtInquilinosTabla;
    // End of variables declaration//GEN-END:variables
}
