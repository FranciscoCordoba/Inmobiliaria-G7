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
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class AgregarContrato extends javax.swing.JPanel {

    private InquilinoData inquilinoData;
    private ContratoData contratoData;
    private PropiedadData propiedadData;
    private PropietarioData propietarioData;
    private Conexion con;
    private DefaultTableModel modelo;
    private ArrayList<Inmueble> inmuebles;

    public AgregarContrato() {
	initComponents();
	con = new Conexion();
	inquilinoData = new InquilinoData(con);
	propiedadData = new PropiedadData(con);
	contratoData = new ContratoData(con);
	propietarioData = new PropietarioData(con);
	modelo = new DefaultTableModel();
	inmuebles = propiedadData.listarInmuebles();
	armarCabeceraTabla();
	cargarTodasLasPropiedades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombreInquilino = new javax.swing.JTextField();
        jtDniInquilino = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jDateFin = new com.toedter.calendar.JDateChooser();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaPropiedades = new javax.swing.JTable();
        Firmar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtMonto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbZona = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jcbAmbientes = new javax.swing.JComboBox<>();
        Filtrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Inquilino");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Fecha Inicio");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha Fin");

        jtNombreInquilino.setBackground(new java.awt.Color(217, 217, 217));
        jtNombreInquilino.setEnabled(false);

        jtDniInquilino.setBackground(new java.awt.Color(217, 217, 217));

        Buscar.setBackground(new java.awt.Color(0, 63, 121));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jDateFin.setBackground(new java.awt.Color(217, 217, 217));

        jDateInicio.setBackground(new java.awt.Color(217, 217, 217));

        jListaPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jListaPropiedades);

        Firmar.setBackground(new java.awt.Color(0, 63, 121));
        Firmar.setText("Firmar");
        Firmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirmarActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(0, 63, 121));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("Zona");

        jLabel6.setText("Tipo");

        jLabel7.setText("N. Ambientes");

        jLabel8.setText("Monto");

        jcbZona.setBackground(new java.awt.Color(204, 204, 204));
        jcbZona.setEditable(true);
        jcbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Norte", "Este", "Sur", "Oeste", "Centro" }));
        jcbZona.setFocusable(false);

        jcbTipo.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipo.setEditable(true);
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casa", "Departamento", "Oficina", "Local", "Depósito" }));
        jcbTipo.setFocusable(false);

        jcbAmbientes.setBackground(new java.awt.Color(204, 204, 204));
        jcbAmbientes.setEditable(true);
        jcbAmbientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        jcbAmbientes.setFocusable(false);

        Filtrar.setBackground(new java.awt.Color(0, 63, 121));
        Filtrar.setText("Filtrar");
        Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(Limpiar)
                .addGap(18, 18, 18)
                .addComponent(Firmar)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtNombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Filtrar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtDniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrar))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Firmar)
                    .addComponent(Limpiar))
                .addContainerGap(197, Short.MAX_VALUE))
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
	
	long dniInquilino = Long.parseLong(jtDniInquilino.getText());

	inquilinoData.obtenerInquilinoPorDni(dniInquilino);

	Inquilino inquilino = inquilinoData.obtenerInquilinoPorDni(dniInquilino);

	jtNombreInquilino.setText(inquilino.getNombre() + " " + inquilino.getApellido());

    }//GEN-LAST:event_BuscarActionPerformed

    private void cargarTodasLasPropiedades() {

	for (Inmueble inmueble : inmuebles) {
	    modelo.addRow(new Object[]{inmueble.getDireccion(), inmueble.getAltura(), inmueble.getTipoDeInmueble(), inmueble.getCantAmbientes(), inmueble.getZona(), inmueble.getSuperficie(), inmueble.getPrecioBase(), inmueble.getPropietarioInmueble().getNombre() + " " + inmueble.getPropietarioInmueble().getApellido()});
	}

    }

    private void armarCabeceraTabla() {

	ArrayList<Object> columnas = new ArrayList<Object>();
	columnas.add("Direccion ");
	columnas.add("Altura");
	columnas.add("Tipo de Inmueble");
	columnas.add("Ambientes");
	columnas.add("Zona");
	columnas.add("Superficie");
	columnas.add("Precio");
	columnas.add("Propietario");

	for (Object it : columnas) {
	    modelo.addColumn(it);
	}
	jListaPropiedades.setModel(modelo);
    }

    private void FirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirmarActionPerformed

	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
	String fechaInicioFormat = formatoFecha.format(jDateInicio.getDate());
	String fechaFinFormat = formatoFecha.format(jDateFin.getDate());
	
	LocalDate fechaInicio = LocalDate.parse(fechaInicioFormat, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	
	LocalDate fechaFin =  LocalDate.parse(fechaFinFormat, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	
	
	double monto = Double.parseDouble(jtMonto.getText());
	Inquilino inquilinoContrato = inquilinoData.obtenerInquilinoPorDni(Integer.parseInt(jtDniInquilino.getText()));
	int indexPropiedad = jListaPropiedades.getSelectedRow();
	Inmueble propiedadContrato;
	
	propiedadContrato = propiedadData.buscarInmuebleXId(inmuebles.get(indexPropiedad).getIdInmueble());
	System.out.println(propiedadContrato);
	
	Propietario propietarioContrato = propietarioData.obtenerPropietarioPorId(propiedadContrato.getPropietarioInmueble().getId()) ;
	System.out.println(propietarioContrato);
	
	Contrato contrato = new Contrato(fechaInicio, fechaFin, true, monto, inquilinoContrato, propietarioContrato ,propiedadContrato);
	
	contratoData.guardarContrato(contrato);
	
	propiedadData.borrarInmuebleXId(propiedadContrato.getIdInmueble());
	
	if (indexPropiedad == -1) {
	    Firmar.setEnabled(false);
	}
	
    }//GEN-LAST:event_FirmarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

	limpiarTabla();

    }//GEN-LAST:event_LimpiarActionPerformed

    private void FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarActionPerformed

	limpiarTabla();

	inmuebles = propiedadData.listarInmuebles();

	if (!jcbZona.getSelectedItem().toString().isEmpty()) {
	    Iterator<Inmueble> iterador = inmuebles.iterator();
	    while (iterador.hasNext()) {
		if (!iterador.next().getZona().equals(jcbZona.getSelectedItem().toString())) {
		    iterador.remove();
		}
	    }
	}
	if (!jcbTipo.getSelectedItem().toString().isEmpty()) {
	    Iterator<Inmueble> iterador = inmuebles.iterator();
	    while (iterador.hasNext()) {
		if (!iterador.next().getTipoDeInmueble().equals(jcbTipo.getSelectedItem().toString())) {
		    iterador.remove();
		}
	    }
	}
	if (!jcbAmbientes.getSelectedItem().toString().isEmpty()) {
	    Iterator<Inmueble> iterador = inmuebles.iterator();
	    while (iterador.hasNext()) {
		if (iterador.next().getCantAmbientes() != Integer.parseInt(jcbAmbientes.getSelectedItem().toString())) {
		    iterador.remove();
		}
	    }
	}

	cargarTodasLasPropiedades();

    }//GEN-LAST:event_FiltrarActionPerformed

    private void limpiarTabla() {
	int a = modelo.getRowCount() - 1;
	for (int i = a; i >= 0; i--) {
	    modelo.removeRow(i);
	}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Filtrar;
    private javax.swing.JButton Firmar;
    private javax.swing.JButton Limpiar;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTable jListaPropiedades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAmbientes;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JComboBox<String> jcbZona;
    private javax.swing.JTextField jtDniInquilino;
    private javax.swing.JTextField jtMonto;
    private javax.swing.JTextField jtNombreInquilino;
    // End of variables declaration//GEN-END:variables
}
