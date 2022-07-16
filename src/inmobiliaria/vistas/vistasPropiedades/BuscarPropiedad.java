package inmobiliaria.vistas.vistasPropiedades;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.ContratoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Contrato;
import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Propietario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarPropiedad extends javax.swing.JPanel {

    private Conexion conexion;
    private PropiedadData propData;
    private PropietarioData propietarioData;
    private ContratoData contratoData;
    private DefaultTableModel modelo, modeloContratos;
    ArrayList<Contrato> contratos;

    public BuscarPropiedad() {
	initComponents();
	conexion = new Conexion();
	propData = new PropiedadData(conexion);
	contratoData = new ContratoData(conexion);
	modelo = new DefaultTableModel();
	modeloContratos = new DefaultTableModel();
	buscarContratos.setEnabled(false);
	cargarTabla();
	cargarTablaContratos();
	Limpiar.setEnabled(false);
    }

    private void cargarTabla() {
	ArrayList<Object> columnas = new ArrayList<>();

	columnas.add("Código");
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

	jtPropiedades.setModel(modelo);
    }

    private void cargarTablaContratos() {
	ArrayList<Object> columnas = new ArrayList<>();

	columnas.add("Fecha Inicio");
	columnas.add("Fecha Fin");
	columnas.add("Activo");
	columnas.add("Monto");
	columnas.add("Inquilino");
	columnas.add("Propietario");
	columnas.add("Inmueble");

	for (Object col : columnas) {
	    modeloContratos.addColumn(col);
	}

	jTablaContratosPropiedades.setModel(modeloContratos);

    }

    private void refrescarTabla() {

	int dni = Integer.parseInt(jtDni.getText());

	ArrayList<Inmueble> inmuebles = propData.buscarTodosInmueblesXPropietarioDni(dni);

	for (Inmueble inm : inmuebles) {
	    modelo.addRow(new Object[]{inm.getIdInmueble(), inm.getDireccion() + " " + inm.getAltura(), inm.getTipoDeInmueble(), inm.getCantAmbientes(), inm.getSuperficie(), inm.getPrecioBase(), inm.getZona(), inm.getPropietarioInmueble().getDni()});
	}

    }

    private void refrescarTablaContratos() {

	try {
	    int indexInmueble = jtPropiedades.getSelectedRow();
	    int idInmueble = (int) jtPropiedades.getValueAt(indexInmueble, 0);

	    ArrayList<Contrato> listaContratos = contratoData.contratosXInmueble(idInmueble);

	    for (Contrato cont : listaContratos) {
		modeloContratos.addRow(new Object[]{cont.getFechaInicio(), cont.getFechaFin(), cont.isActivo(), cont.getMonto(), cont.getInquilinoContrato().getApellido() + " " + cont.getInquilinoContrato().getNombre(), cont.getPropietarioContrato().getApellido() + " " + cont.getPropietarioContrato().getNombre(), cont.getPropiedadContrato().getDireccion() + " " + cont.getPropiedadContrato().getAltura()});
	    }
	} catch (Exception e) {
	    if (e instanceof java.lang.ArrayIndexOutOfBoundsException) {
		JOptionPane.showMessageDialog(this, "No se encontró ninguna propiedad con ese DNI");
	    } else {
		JOptionPane.showMessageDialog(this, "Error" + e);
	    }
	}

    }

    private void limpiarTabla() {
	int a = modelo.getRowCount() - 1;
	for (int i = a; i >= 0; i--) {
	    modelo.removeRow(i);
	}

	int b = modeloContratos.getRowCount() - 1;
	for (int i = a; i >= 0; i--) {
	    modeloContratos.removeRow(i);
	}

	buscarContratos.setEnabled(false);
	jtDni.setText("");

    }

    private void limpiarTablaContratos() {
	int a = modelo.getRowCount() - 1;
	for (int i = a; i >= 0; i--) {
	    modeloContratos.removeRow(i);
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPropiedades = new javax.swing.JTable();
        jtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        buscarContratos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaContratosPropiedades = new javax.swing.JTable();
        Limpiar = new javax.swing.JButton();

        jtPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPropiedades);

        jtDni.setBackground(new java.awt.Color(217, 217, 217));
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DNI del propietario");

        btnBuscar.setBackground(new java.awt.Color(0, 63, 121));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        buscarContratos.setBackground(new java.awt.Color(0, 63, 121));
        buscarContratos.setText("Buscar Contratos");
        buscarContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarContratosActionPerformed(evt);
            }
        });

        jTablaContratosPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaContratosPropiedades);

        Limpiar.setBackground(new java.awt.Color(0, 63, 121));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarContratos)
                                .addGap(196, 196, 196))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Limpiar)
                        .addGap(224, 224, 224))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarContratos)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Limpiar)
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

	try {
	    refrescarTabla();
	    buscarContratos.setEnabled(true);
	    Limpiar.setEnabled(true);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI");
	}

    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void buscarContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarContratosActionPerformed

	refrescarTablaContratos();

    }//GEN-LAST:event_buscarContratosActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

	limpiarTabla();
	Limpiar.setEnabled(false);
    }//GEN-LAST:event_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton buscarContratos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaContratosPropiedades;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtPropiedades;
    // End of variables declaration//GEN-END:variables
}
