package inmobiliaria.vistas.vistasPropiedades;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Propietario;
import javax.swing.JOptionPane;

public class AgregarPropiedad extends javax.swing.JPanel {

    private PropiedadData propData;
    private PropietarioData propietarioData;
    private Conexion conexion;
    
    public AgregarPropiedad() {
	initComponents();
        conexion = new Conexion();
        propData = new PropiedadData(conexion);
        propietarioData = new PropietarioData(conexion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtDireccion = new javax.swing.JTextField();
        jtAltura = new javax.swing.JTextField();
        jtCantidad = new javax.swing.JTextField();
        jtSuperficie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtDniPropietario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbZona = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();

        jtDireccion.setBackground(new java.awt.Color(217, 217, 217));
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDireccionKeyTyped(evt);
            }
        });

        jtAltura.setBackground(new java.awt.Color(217, 217, 217));
        jtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAlturaKeyTyped(evt);
            }
        });

        jtCantidad.setBackground(new java.awt.Color(217, 217, 217));
        jtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadKeyTyped(evt);
            }
        });

        jtSuperficie.setBackground(new java.awt.Color(217, 217, 217));
        jtSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSuperficieKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Direccion");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Altura");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tipo de inmueble");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cantidad de ambientes");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Superficie");

        jbLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 63, 121));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jtPrecio.setBackground(new java.awt.Color(217, 217, 217));
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Precio Base");

        jtDniPropietario.setBackground(new java.awt.Color(217, 217, 217));
        jtDniPropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniPropietarioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DNI propietario");

        jcbZona.setBackground(new java.awt.Color(204, 204, 204));
        jcbZona.setEditable(true);
        jcbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Norte", "Este", "Sur", "Oeste", "Centro" }));
        jcbZona.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Zona");

        jcbTipo.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipo.setEditable(true);
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casa", "Departamento", "Oficina", "Local", "Depósito" }));
        jcbTipo.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtSuperficie)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jcbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jtPrecio)
                            .addComponent(jtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jtDniPropietario))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDniPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(btnGuardar))
                .addGap(21, 21, 21))
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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtDireccion.setText("");
        jtAltura.setText("");
        jtCantidad.setText("");
        jtPrecio.setText("");
        jtDniPropietario.setText("");
        jtSuperficie.setText("");
        jcbTipo.setSelectedIndex(0);
        jcbZona.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String direccion = jtDireccion.getText();
        int altura = (Integer.parseInt(jtAltura.getText()));
        int cantAmbientes = (Integer.parseInt(jtCantidad.getText()));
        double precioBase = (Double.parseDouble(jtPrecio.getText()));
        Propietario propietarioInmueble = (propietarioData.obtenerPropietarioPorDni(Integer.parseInt(jtDniPropietario.getText())));
        double superficie = (Double.parseDouble(jtSuperficie.getText()));
        String tipoDeInmueble = (jcbTipo.getSelectedItem().toString());
        String zona = (jcbZona.getSelectedItem().toString());
        
        if(jtDniPropietario.getText().isEmpty() || zona.isEmpty() || direccion.isEmpty() || tipoDeInmueble.isEmpty() || jtCantidad.getText().isEmpty() || jtAltura.getText().isEmpty() || jtPrecio.getText().isEmpty() || jtSuperficie.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No pueden quedar campos vacíos");
        }else{
            Inmueble inmueble = new Inmueble(direccion, altura, true, tipoDeInmueble, cantAmbientes, zona, superficie, precioBase, propietarioInmueble);
            propData.guardarInmueble(inmueble);
            JOptionPane.showMessageDialog(this, "Propiedad cargada con éxito");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDireccionKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jtDireccionKeyTyped

    private void jtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlturaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtAltura.getText().trim().length() == 6) {
            evt.consume();
        }
    }//GEN-LAST:event_jtAlturaKeyTyped

    private void jtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtCantidad.getText().trim().length() == 6) {
            evt.consume();
        }
    }//GEN-LAST:event_jtCantidadKeyTyped

    private void jtSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSuperficieKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;

        if (!numeros && !punto) {
            evt.consume();
        }

        if (jtSuperficie.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtSuperficieKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;

        if (!numeros && !punto) {
            evt.consume();
        }

        if (jtPrecio.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtDniPropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniPropietarioKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtDniPropietario.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniPropietarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JComboBox<String> jcbZona;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDniPropietario;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtSuperficie;
    // End of variables declaration//GEN-END:variables
}
