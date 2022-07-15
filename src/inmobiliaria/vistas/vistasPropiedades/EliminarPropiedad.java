/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.vistas.vistasPropiedades;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Modelo.Inmueble;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nican
 */
public class EliminarPropiedad extends javax.swing.JPanel {
    
    private Conexion conexion;
    private PropiedadData propData;
    private DefaultTableModel modelo;
    private ArrayList<Inmueble> listaTabla;
    
    public EliminarPropiedad() {
	initComponents();
	conexion = new Conexion();
	propData = new PropiedadData(conexion);
	
	modelo = new DefaultTableModel();
	cargarTabla();
    }
    
    private void cargarTabla() {
	ArrayList<Object> columnas = new ArrayList<>();
	
	columnas.add("Direccion");
	columnas.add("Tipo");
	columnas.add("Cant. Ambientes");
	columnas.add("Superficie");
	columnas.add("Precio Base");
	columnas.add("Zona");
	columnas.add("DNI Propietario");
	
	for (Object col : columnas) {
	    modelo.addColumn(col);
	}
	
	jtEliminar.setModel(modelo);
	
    }
    
    private ArrayList<Inmueble> refrescarTablaPorPropietario() {
	
	int dni = Integer.parseInt(jtDni.getText());
	
	ArrayList<Inmueble> inmuebles = propData.buscarInmueblesXPropietarioDni(dni);
	
	for (Inmueble inm : inmuebles) {
	    modelo.addRow(new Object[]{inm.getDireccion() + " " + inm.getAltura(), inm.getTipoDeInmueble(), inm.getCantAmbientes(), inm.getSuperficie(), inm.getPrecioBase(), inm.getZona(), inm.getPropietarioInmueble().getDni()});
	}
	
	return inmuebles;
    }
    
    private ArrayList<Inmueble> refescarTablaTodos() {
	
	ArrayList<Inmueble> inmueblesTodos = propData.listarInmuebles();
	
	for (Inmueble inm : inmueblesTodos) {
	    modelo.addRow(new Object[]{inm.getDireccion() + " " + inm.getAltura(), inm.getTipoDeInmueble(), inm.getCantAmbientes(), inm.getSuperficie(), inm.getPrecioBase(), inm.getZona(), inm.getPropietarioInmueble().getDni()});
	}
	
	return inmueblesTodos;
	
    }
    
    private void limpiarTabla() {
	int a = modelo.getRowCount() - 1;
	for (int i = a; i >= 0; i--) {
	    modelo.removeRow(i);
	}
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEliminar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        buscarTodas = new javax.swing.JRadioButton();
        buscarPorPropietario = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();

        jtDni.setBackground(new java.awt.Color(217, 217, 217));
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DNI del propietario");

        btnEliminar.setBackground(new java.awt.Color(0, 63, 121));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jtEliminar.setModel(new javax.swing.table.DefaultTableModel(
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
        jtEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtEliminarFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtEliminar);

        btnBuscar.setBackground(new java.awt.Color(0, 63, 121));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        buscarTodas.setText("Todas las propiedades");
        buscarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodasActionPerformed(evt);
            }
        });

        buscarPorPropietario.setText("Buscar por propietario");
        buscarPorPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPorPropietarioActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarTodas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarPorPropietario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarTodas)
                    .addComponent(buscarPorPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
	int filaSeleccionada = jtEliminar.getSelectedRow();
	
	if (filaSeleccionada != -1) {
	    int idProp = listaTabla.get(filaSeleccionada).getIdInmueble();
	    propData.borrarInmuebleXId(idProp);
	    JOptionPane.showMessageDialog(this, "Propiedad eliminada");
	}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

	limpiarTabla();
	if (buscarPorPropietario.isSelected() && !jtDni.getText().isEmpty()) {
	    listaTabla = refrescarTablaPorPropietario();
	} else if(buscarTodas.isSelected()){
	    listaTabla = refescarTablaTodos();
	}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buscarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodasActionPerformed
	limpiarTabla();
        btnEliminar.setEnabled(false);
	buscarPorPropietario.setSelected(false);
	jtDni.setEnabled(false);
    }//GEN-LAST:event_buscarTodasActionPerformed

    private void buscarPorPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPorPropietarioActionPerformed
	limpiarTabla();
        btnEliminar.setEnabled(false);
	buscarTodas.setSelected(false);
	jtDni.setEnabled(true);
    }//GEN-LAST:event_buscarPorPropietarioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
	// TODO add your handling code here:
	limpiarTabla();
	jtDni.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtDni.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEliminarFocusGained
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_jtEliminarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton buscarPorPropietario;
    private javax.swing.JRadioButton buscarTodas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtEliminar;
    // End of variables declaration//GEN-END:variables
}
