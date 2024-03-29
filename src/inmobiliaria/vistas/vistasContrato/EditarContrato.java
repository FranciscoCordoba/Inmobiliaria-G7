package inmobiliaria.vistas.vistasContrato;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.ContratoData;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Contrato;
import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Inquilino;
import inmobiliaria.Modelo.Propietario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarContrato extends javax.swing.JPanel {

    private Conexion conexion;
    private PropietarioData propietarioData;
    private InquilinoData inquilinoData;
    private DefaultTableModel modelo;
    private ContratoData contratoData;
    private PropiedadData propiedadData;
    private ArrayList<Contrato> listacontratos;

    public EditarContrato() {
        initComponents();
        conexion = new Conexion();
        propietarioData = new PropietarioData(conexion);
        inquilinoData = new InquilinoData(conexion);
        contratoData = new ContratoData(conexion);
        propiedadData = new PropiedadData(conexion);
        jtfInquilino.setEnabled(false);
        jbtnLimpiar.setEnabled(false);
        jbtnRenovar.setEnabled(false);
        jbtnContrato.setEnabled(false);
        jtfPropietario.setEnabled(false);
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnRenovar = new javax.swing.JButton();
        jDateNuevoVencimiento = new com.toedter.calendar.JDateChooser();
        jtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaContrato = new javax.swing.JTable();
        jbtnBuscarPro = new javax.swing.JButton();
        vigentes = new javax.swing.JRadioButton();
        jtfInquilino = new javax.swing.JTextField();
        noVigentes = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jtfDniInq = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnBuscarInq = new javax.swing.JButton();
        jtfDniPro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfPropietario = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnContrato = new javax.swing.JButton();

        jbtnRenovar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnRenovar.setText("Renovar");
        jbtnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRenovarActionPerformed(evt);
            }
        });

        jDateNuevoVencimiento.setEnabled(false);

        jtMonto.setEnabled(false);
        jtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMontoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nuevo Vencimiento");

        jLabel2.setText("Nuevo Monto");

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Propietario");

        jtListaContrato.setModel(new javax.swing.table.DefaultTableModel(
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
        jtListaContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtListaContratoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaContrato);

        jbtnBuscarPro.setBackground(new java.awt.Color(0, 63, 121));
        jbtnBuscarPro.setText("Buscar");
        jbtnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarProActionPerformed(evt);
            }
        });

        vigentes.setText("Vigentes");
        vigentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigentesActionPerformed(evt);
            }
        });

        jtfInquilino.setBackground(new java.awt.Color(217, 217, 217));

        noVigentes.setText("No vigentes");
        noVigentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noVigentesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Inquilino");

        jtfDniInq.setBackground(new java.awt.Color(217, 217, 217));

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

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DNI");

        jtfPropietario.setBackground(new java.awt.Color(217, 217, 217));

        jbtnLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnContrato.setBackground(new java.awt.Color(0, 63, 121));
        jbtnContrato.setText("Ver Contratos");
        jbtnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDniPro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8)
                        .addComponent(jbtnBuscarPro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(vigentes)
                        .addGap(32, 32, 32)
                        .addComponent(noVigentes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateNuevoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnContrato)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnLimpiar)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnRenovar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vigentes)
                    .addComponent(noVigentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateNuevoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRenovar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnContrato))
                .addGap(33, 33, 33))
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

    private void jbtnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRenovarActionPerformed

        int filaSeleccionada = jtListaContrato.getSelectedRow();
        Contrato contrato = null;
        if (filaSeleccionada != -1) {
            int idInmueble = (int) modelo.getValueAt(filaSeleccionada, 0);
            contrato = contratoData.obtenerContratoXInmuebleId(idInmueble);
            
            LocalDate fechaFin;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            String fechaFinFormat = formatoFecha.format(jDateNuevoVencimiento.getDate());
            
            if (jDateNuevoVencimiento.getDate() == null) {
                fechaFin = contrato.getFechaFin();
            } else if (jDateNuevoVencimiento.getDate().before(Date.valueOf(contrato.getFechaInicio()))) {
                fechaFin = contrato.getFechaFin();
                JOptionPane.showMessageDialog(this, "Error, ha ingresado una fecha de finalizacion menor a la fecha de inicio");
            } else {
                fechaFin = LocalDate.parse(fechaFinFormat, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }
            double nuevoMonto = contrato.getMonto();
            if (!jtMonto.getText().isEmpty()) {
                nuevoMonto = Double.parseDouble(jtMonto.getText());
            }

            Inquilino inquilino = contrato.getInquilinoContrato();

            Propietario propietario = contrato.getPropietarioContrato();
            Inmueble propiedad = contrato.getPropiedadContrato();

            Contrato nuevoContrato = new Contrato(contrato.getIdContrato(), contrato.getFechaInicio(), fechaFin, true, nuevoMonto, inquilino, propietario, propiedad);

            contratoData.renovarContrato(nuevoContrato);
            JOptionPane.showMessageDialog(this, "Contrato renovado");
        }
    }//GEN-LAST:event_jbtnRenovarActionPerformed

    private void jbtnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarProActionPerformed
        if (!jtfDniPro.getText().isEmpty()) {
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
                jbtnRenovar.setEnabled(true);
                jbtnLimpiar.setEnabled(true);
                jbtnContrato.setEnabled(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No hay ningun propietario con ese DNI");
            }
        }
    }//GEN-LAST:event_jbtnBuscarProActionPerformed

    private void vigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigentesActionPerformed

        noVigentes.setSelected(false);
        jbtnRenovar.setEnabled(true);
        jbtnLimpiar.setEnabled(true);
        jtfDniInq.setEnabled(false);
        jtfDniInq.setText("");
        jtfInquilino.setText("");
        jbtnBuscarInq.setEnabled(false);
        jtfDniPro.setEnabled(false);
        jtfDniPro.setText("");
        jtfPropietario.setText("");
        jbtnBuscarPro.setEnabled(false);
        jbtnContrato.setEnabled(true);
    }//GEN-LAST:event_vigentesActionPerformed

    private void noVigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVigentesActionPerformed

        vigentes.setSelected(false);
        jbtnRenovar.setEnabled(true);
        jbtnLimpiar.setEnabled(true);
        jtfDniInq.setEnabled(false);
        jtfDniInq.setText("");
        jtfInquilino.setText("");
        jbtnBuscarInq.setEnabled(false);
        jtfDniPro.setEnabled(false);
        jtfDniPro.setText("");
        jtfPropietario.setText("");
        jbtnBuscarPro.setEnabled(false);
        jbtnContrato.setEnabled(true);

    }//GEN-LAST:event_noVigentesActionPerformed

    private void jbtnBuscarInqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarInqActionPerformed
        if (!jtfDniInq.getText().isEmpty()) {
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
        }
    }//GEN-LAST:event_jbtnBuscarInqActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContratoActionPerformed
        limpiarTabla();
        if (jbtnBuscarInq.isEnabled() == true) {
            long dniInq = Long.parseLong(jtfDniInq.getText());
            Inquilino inquilin = inquilinoData.obtenerInquilinoPorDni(dniInq);
            jbtnRenovar.setEnabled(true);

            listacontratos = contratoData.contratosXInquilino(inquilin.getIdInquilino());
            for (Contrato cont : listacontratos) {
                modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin()});
            }
        } else if (jbtnBuscarPro.isEnabled()) {
            long dniInq = Long.parseLong(jtfDniPro.getText());
            jbtnRenovar.setEnabled(true);
            Propietario propie = propietarioData.obtenerPropietarioPorDni(dniInq);
            listacontratos = contratoData.contratosXPropietario(propie.getId());
            for (Contrato cont : listacontratos) {
                modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin(), cont.isActivo()});
            }
        } else if (vigentes.isSelected()) {
            listacontratos = contratoData.mostrarContratosVigentes();
            jbtnRenovar.setEnabled(true);
            for (Contrato cont : listacontratos) {
                modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin(), cont.isActivo()});
            }
        } else {
            listacontratos = contratoData.mostrarVencidos();
            jbtnRenovar.setEnabled(true);
            for (Contrato cont : listacontratos) {
                modelo.addRow(new Object[]{cont.getPropiedadContrato().getIdInmueble(), (cont.getPropietarioContrato().getApellido() + ", " + cont.getPropietarioContrato().getNombre()), (cont.getInquilinoContrato().getApellido() + ", " + cont.getInquilinoContrato().getNombre()), cont.getPropiedadContrato().getDireccion(), cont.getMonto(), cont.getFechaInicio(), cont.getFechaFin(), cont.isActivo()});
            }
        }
    }//GEN-LAST:event_jbtnContratoActionPerformed

    private void jtListaContratoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtListaContratoFocusGained
        jtMonto.setEnabled(true);
        jDateNuevoVencimiento.setEnabled(true);
    }//GEN-LAST:event_jtListaContratoFocusGained

    private void jtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMontoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;

        if (!numeros && !punto) {
            evt.consume();
        }

        if (jtMonto.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtMontoKeyTyped

    private void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void limpiarCampos() {
        jtfDniInq.setText("");
        jtfDniPro.setText("");
        jtfInquilino.setText("");
        jtfPropietario.setText("");
        jtMonto.setText("");
        jtMonto.setEnabled(false);
        jDateNuevoVencimiento.setDate(null);
        jDateNuevoVencimiento.setEnabled(false);
        jbtnRenovar.setEnabled(false);
        jbtnRenovar.setEnabled(false);
        jbtnBuscarPro.setEnabled(true);
        jbtnBuscarInq.setEnabled(true);
        jtfPropietario.setEnabled(false);
        jtfInquilino.setEnabled(false);
        jtfDniPro.setEnabled(true);
        jtfDniInq.setEnabled(true);
        jbtnLimpiar.setEnabled(false);
        jbtnRenovar.setEnabled(false);
        jbtnContrato.setEnabled(false);
        vigentes.setSelected(false);
        noVigentes.setSelected(false);

        borrarFilasTabla();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Id Inmueble ");
        columnas.add("Propietario");
        columnas.add("Inquilino");
        columnas.add("Direccion");
        columnas.add("Monto");
        columnas.add("Fecha Inicio");
        columnas.add("Fecha Final");

        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        jtListaContrato.setModel(modelo);
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
    private com.toedter.calendar.JDateChooser jDateNuevoVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscarInq;
    private javax.swing.JButton jbtnBuscarPro;
    private javax.swing.JButton jbtnContrato;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnRenovar;
    private javax.swing.JTable jtListaContrato;
    private javax.swing.JTextField jtMonto;
    private javax.swing.JTextField jtfDniInq;
    private javax.swing.JTextField jtfDniPro;
    private javax.swing.JTextField jtfInquilino;
    private javax.swing.JTextField jtfPropietario;
    private javax.swing.JRadioButton noVigentes;
    private javax.swing.JRadioButton vigentes;
    // End of variables declaration//GEN-END:variables
}
