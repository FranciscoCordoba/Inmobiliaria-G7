package inmobiliaria.vistas.vistasContrato;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.ContratoData;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Contrato;
import inmobiliaria.Modelo.Inquilino;
import inmobiliaria.Modelo.Propietario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarContrato extends javax.swing.JPanel {

    private Conexion conexion;
    private PropietarioData propietarioData;
    private InquilinoData inquilinoData;
    private DefaultTableModel modelo;
    private ContratoData contratoData;
    private PropiedadData propiedadData;
    private ArrayList<Contrato> listacontratos;

    public BuscarContrato() {
	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfInquilino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfDniInq = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnBuscarInq = new javax.swing.JButton();
        jtfDniPro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfPropietario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbtnBuscarPro = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jbtnContrato = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jtfInquilino.setBackground(new java.awt.Color(217, 217, 217));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Inquilino");

        jtfDniInq.setBackground(new java.awt.Color(217, 217, 217));
        jtfDniInq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniInqActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DNI");

        jbtnBuscarInq.setBackground(new java.awt.Color(0, 63, 121));
        jbtnBuscarInq.setText("Buscar");
        jbtnBuscarInq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarInqActionPerformed(evt);
            }
        });

        jtfDniPro.setBackground(new java.awt.Color(217, 217, 217));
        jtfDniPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniProActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DNI");

        jtfPropietario.setBackground(new java.awt.Color(217, 217, 217));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Propietario");

        jbtnBuscarPro.setBackground(new java.awt.Color(0, 63, 121));
        jbtnBuscarPro.setText("Buscar");
        jbtnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarProActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Vigentes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("No vigentes");

        jbtnContrato.setBackground(new java.awt.Color(0, 63, 121));
        jbtnContrato.setText("Ver Contratos");
        jbtnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContratoActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(198, 198, 198))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfDniInq, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnBuscarInq))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jtfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfDniPro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(8, 8, 8)
                                        .addComponent(jbtnBuscarPro))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jbtnContrato)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDniInq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarInq))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDniPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarPro)
                    .addComponent(jtfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnContrato)
                    .addComponent(jbtnLimpiar))
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void jtfDniInqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniInqActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jtfDniInqActionPerformed

    private void jbtnBuscarInqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarInqActionPerformed
	long dni = Long.parseLong(jtfDniInq.getText());
	try {
	    Inquilino inquilino = inquilinoData.obtenerInquilinoPorDni(dni);
	    String completo = inquilino.getApellido() + " " + inquilino.getNombre();
	    jtfInquilino.setText(completo);
	    jtfInquilino.setEnabled(true);
	    jtfInquilino.setEditable(false);
	    jtfPropietario.setEditable(false);
	    jtfDniPro.setEnabled(false);
	    jbtnBuscarPro.setEnabled(false);
	    jbtnLimpiar.setEnabled(true);
	    jbtnContrato.setEnabled(true);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(this, "No hay ningun inquilino con ese DNI");
	}
    }//GEN-LAST:event_jbtnBuscarInqActionPerformed

    private void jtfDniProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniProActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jtfDniProActionPerformed

    private void jbtnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarProActionPerformed
	long dni = Long.parseLong(jtfDniPro.getText());
	try {
	    Propietario propietario = propietarioData.obtenerPropietarioPorDni(dni);
	    String completo = propietario.getApellido() + " " + propietario.getNombre();
	    jtfPropietario.setText(completo);
	    jtfPropietario.setEnabled(true);
	    jtfPropietario.setEditable(false);
	    jtfInquilino.setEditable(false);
	    jtfDniInq.setEnabled(false);
	    jbtnBuscarInq.setEnabled(false);
	    jbtnContrato.setEnabled(true);
	    jbtnLimpiar.setEnabled(true);

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(this, "No hay ningun propietario con ese DNI");
	}
    }//GEN-LAST:event_jbtnBuscarProActionPerformed

    private void jbtnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContratoActionPerformed
	if (jbtnBuscarInq.isEnabled() == true) {
	    long dniInq = Long.parseLong(jtfDniInq.getText());
	    Inquilino inquilin = inquilinoData.obtenerInquilinoPorDni(dniInq);

	    listacontratos = contratoData.contratosXInquilino(inquilin.getIdInquilino());

	    for (Contrato cont : listacontratos) {
		modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin()});
	    }
	} else {
	    long dniInq = Long.parseLong(jtfDniPro.getText());
	    Propietario propie = propietarioData.obtenerPropietarioPorDni(dniInq);
	    listacontratos = contratoData.contratosXPropietario(propie.getId());
	    for (Contrato cont : listacontratos) {
		modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin(), cont.isActivo()});
	    }
	}
    }//GEN-LAST:event_jbtnContratoActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
	limpiarCampos();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void limpiarCampos() {
        jtfDniInq.setText("");
        jtfDniPro.setText("");
        jtfInquilino.setText("");
        jtfPropietario.setText("");

        jbtnContrato.setEnabled(false);
        jbtnBuscarPro.setEnabled(true);
        jbtnBuscarInq.setEnabled(true);
        jtfPropietario.setEnabled(false);
        jtfInquilino.setEnabled(false);
        jtfDniPro.setEnabled(true);
        jtfDniInq.setEnabled(true);
        jbtnLimpiar.setEnabled(false);

        borrarFilasTabla();
    }

    private void borrarFilasTabla() {

	if (modelo != null) {

	    int a = modelo.getRowCount() - 1;
	    for (int i = a; i >= 0; i--) {
		modelo.removeRow(i);
	    }
	}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnBuscarInq;
    private javax.swing.JButton jbtnBuscarPro;
    private javax.swing.JButton jbtnContrato;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JTextField jtfDniInq;
    private javax.swing.JTextField jtfDniPro;
    private javax.swing.JTextField jtfInquilino;
    private javax.swing.JTextField jtfPropietario;
    // End of variables declaration//GEN-END:variables
}
