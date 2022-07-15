package inmobiliaria.vistas.vistasPropiedades;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.ContratoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Modelo.Contrato;
import inmobiliaria.Modelo.Inmueble;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BuscarPropiedad extends javax.swing.JPanel {

    private Conexion conexion;
    private PropiedadData propData;
    private ContratoData contratoData;
    private DefaultTableModel modelo, modeloContratos;
    
    public BuscarPropiedad() {
	initComponents();
        conexion = new Conexion();
        propData = new PropiedadData(conexion);
	contratoData = new ContratoData(conexion);
        modelo = new DefaultTableModel();
	buscarContratos.setEnabled(false);
        cargarTabla();
    }

    private void cargarTabla(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("Direccion");
        columnas.add("Tipo");
        columnas.add("Cant. Ambientes");
        columnas.add("Superficie");
        columnas.add("Precio Base");
        columnas.add("Zona");
        columnas.add("DNI Propietario");
        
        for(Object col: columnas){
            modelo.addColumn(col);
        }
        
        jtPropiedades.setModel(modelo);
    }
    
       private void cargarTablaContratos(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("Fecha Inicio");
        columnas.add("Fecha Fin");
        columnas.add("Activo");
        columnas.add("Monto");
        columnas.add("Inquilino");
        columnas.add("Propietario");
        columnas.add("Inmueble");
        
        for(Object col: columnas){
            modeloContratos.addColumn(col);
        }
        
        jTablaContratosPropiedades.setModel(modeloContratos);
    }
    
    private void refrescarTabla(){
        
        int dni = Integer.parseInt(jtDni.getText());
        
        ArrayList<Inmueble> inmuebles = propData.buscarInmueblesXPropietarioDni(dni);
        
        for(Inmueble inm : inmuebles){
            modelo.addRow(new Object[]{inm.getDireccion() + " " + inm.getAltura(), inm.getTipoDeInmueble(), inm.getCantAmbientes(), inm.getSuperficie(), inm.getPrecioBase(), inm.getZona(), inm.getPropietarioInmueble().getDni()});
        }
	
    }
    
    private void limpiarTabla(){
        int a = modelo.getRowCount()-1;
        for(int i = a; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
        private void limpiarTablaContratos(){
        int a = modelo.getRowCount()-1;
        for(int i = a; i >= 0; i--){
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(buscarContratos)
                            .addGap(196, 196, 196)))))
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
                .addContainerGap(101, Short.MAX_VALUE))
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
        limpiarTabla();
        refrescarTabla();
	buscarContratos.setEnabled(true);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarContratosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
