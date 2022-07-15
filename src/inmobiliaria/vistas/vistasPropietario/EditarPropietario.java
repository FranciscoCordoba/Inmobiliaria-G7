
package inmobiliaria.vistas.vistasPropietario;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Propietario;
import javax.swing.JOptionPane;


public class EditarPropietario extends javax.swing.JPanel {

    private Conexion conexion;
    private PropietarioData propietarioData;
    
    public EditarPropietario() {
	initComponents();
        conexion = new Conexion();
        propietarioData = new PropietarioData(conexion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jtfApellido = new javax.swing.JTextField();
        jbtnGuarda = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Domicilio");

        jtfNombre.setBackground(new java.awt.Color(217, 217, 217));
        jtfNombre.setEnabled(false);
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setEnabled(false);
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jtfApellido.setBackground(new java.awt.Color(217, 217, 217));
        jtfApellido.setEnabled(false);
        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyTyped(evt);
            }
        });

        jbtnGuarda.setBackground(new java.awt.Color(0, 63, 121));
        jbtnGuarda.setText("Guardar");
        jbtnGuarda.setEnabled(false);
        jbtnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardaActionPerformed(evt);
            }
        });

        jtfDni.setBackground(new java.awt.Color(217, 217, 217));
        jtfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDniFocusLost(evt);
            }
        });
        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });

        jtfTelefono.setBackground(new java.awt.Color(217, 217, 217));
        jtfTelefono.setEnabled(false);
        jtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyTyped(evt);
            }
        });

        jtfDomicilio.setBackground(new java.awt.Color(217, 217, 217));
        jtfDomicilio.setEnabled(false);
        jtfDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDomicilioKeyTyped(evt);
            }
        });

        jcbActivo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jcbActivo.setForeground(new java.awt.Color(51, 51, 51));
        jcbActivo.setText("Activo");
        jcbActivo.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");

        jbBuscar.setBackground(new java.awt.Color(0, 63, 121));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbBuscar)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnLimpiar)
                        .addGap(34, 34, 34)
                        .addComponent(jbtnGuarda)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jtfApellido)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbActivo)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfDomicilio)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3))
                                            .addGap(54, 54, 54)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(94, 94, 94)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnGuarda)
                    .addComponent(jbBuscar))
                .addContainerGap(79, Short.MAX_VALUE))
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

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardaActionPerformed
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        long dni = 0;
        try{
            dni = Long.parseLong(jtfDni.getText());
        }catch(Exception e){}
        long telefono = 0;
        try{
            telefono = Long.parseLong(jtfTelefono.getText());
        }catch(Exception e){}
        String domicilio = jtfDomicilio.getText();
        boolean activo = jcbActivo.isSelected();
        
        if(nombre.isEmpty() || apellido.isEmpty() || jtfDni.getText().isEmpty() || dni == 0 || jtfTelefono.getText().isEmpty() || telefono == 0 ||domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "No pueden quedar campos vacíos");
        }else{
            Propietario propietario = new Propietario(nombre, apellido, dni, domicilio, telefono, activo);
            propietarioData.actualizarPropietario(propietario);
        }
    }//GEN-LAST:event_jbtnGuardaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Propietario p = null;
        try{
            if(!jtfDni.getText().isEmpty()){
                p = propietarioData.obtenerPropietarioPorDni(Long.parseLong(jtfDni.getText()));
            }else{
                JOptionPane.showMessageDialog(this, "Campo DNI vacío");
                jtfDni.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            p = null;
        }
        if(p != null){
            jtfNombre.setEnabled(true);
            jtfNombre.setText(p.getNombre());
            jtfApellido.setEnabled(true);
            jtfApellido.setText(p.getApellido());
            jtfTelefono.setEnabled(true);
            jtfTelefono.setText(p.getTelefono() + "");
            jtfDomicilio.setEnabled(true);
            jtfDomicilio.setText(p.getDomicilio());
            jbtnLimpiar.setEnabled(true);
            jbtnGuarda.setEnabled(true);
            jcbActivo.setEnabled(true);
            jcbActivo.setSelected(true);
            jtfDni.setEditable(false);
            jbBuscar.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDniFocusLost
        String texto = jtfDni.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jtfDniFocusLost

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
       int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidoKeyTyped

    private void jtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtfDni.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfDniKeyTyped

    private void jtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtfTelefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelefonoKeyTyped

    private void jtfDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDomicilioKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas || mayusculas || espacio || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfDomicilioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbtnGuarda;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtfApellido.setText("");
        jtfNombre.setText("");
        jtfTelefono.setText("");
        jtfDomicilio.setText("");
        jtfDni.setText("");
        jcbActivo.setSelected(false);
        jtfNombre.setEnabled(false);
        jtfApellido.setEnabled(false);
        jtfTelefono.setEnabled(false);
        jtfDomicilio.setEnabled(false);
        jbtnLimpiar.setEnabled(false);
        jbtnGuarda.setEnabled(false);
        jcbActivo.setEnabled(false);
        jbBuscar.setEnabled(true);
    }
}
