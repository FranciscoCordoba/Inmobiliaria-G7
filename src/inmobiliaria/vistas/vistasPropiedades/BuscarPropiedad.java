package inmobiliaria.vistas.vistasPropiedades;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Modelo.Inmueble;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BuscarPropiedad extends javax.swing.JPanel {

    private Conexion conexion;
    private PropiedadData propData;
    private DefaultTableModel modelo;
    
    public BuscarPropiedad() {
	initComponents();
        conexion = new Conexion();
        propData = new PropiedadData(conexion);
        
        modelo = new DefaultTableModel();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPropiedades = new javax.swing.JTable();
        jtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

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
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtPropiedades;
    // End of variables declaration//GEN-END:variables
}
