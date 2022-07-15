
package inmobiliaria.vistas.vistasPropietario;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Propietario;
import javax.swing.JOptionPane;


public class AgregarPropietario extends javax.swing.JPanel {

    private Conexion conexion;
    private PropietarioData propietarioData;
    
    public AgregarPropietario() {
	initComponents();
        
        conexion = new Conexion();
        propietarioData = new PropietarioData(conexion);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jtNombre.setBackground(new java.awt.Color(217, 217, 217));
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });

        jtApellido.setBackground(new java.awt.Color(217, 217, 217));
        jtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtApellidoFocusLost(evt);
            }
        });

        jtDni.setBackground(new java.awt.Color(217, 217, 217));
        jtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniFocusLost(evt);
            }
        });

        jtTelefono.setBackground(new java.awt.Color(217, 217, 217));
        jtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTelefonoFocusLost(evt);
            }
        });

        jtDomicilio.setBackground(new java.awt.Color(217, 217, 217));
        jtDomicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDomicilioFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setText("Domicilio");

        jbLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 63, 121));
        jbGuardar.setText("Guardar");
        jbGuardar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbGuardarFocusGained(evt);
            }
        });
        jbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbGuardarMouseEntered(evt);
            }
        });
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtApellido)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtDomicilio)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(99, 99, 99))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jbLimpiar)
                .addGap(71, 71, 71)
                .addComponent(jbGuardar)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar))
                .addContainerGap(115, Short.MAX_VALUE))
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
        
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        long dni = 0;
        try{
            dni = Long.parseLong(jtDni.getText());
        }catch(Exception e){}
        long telefono = 0;
        try{
            telefono = Long.parseLong(jtTelefono.getText());
        }catch(Exception e){}
        String domicilio = jtDomicilio.getText();
        
        if(nombre.isEmpty() || apellido.isEmpty() || jtDni.getText().isEmpty() || dni == 0 || jtTelefono.getText().isEmpty() || telefono == 0 ||domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "No pueden quedar campos vacíos");
        }else{
            Propietario propietario1 = new Propietario(nombre, apellido, dni, domicilio, telefono, true);
            propietarioData.altaPropietario(propietario1);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost

        String texto = jtNombre.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtNombre.requestFocus();
                jtNombre.setText("");
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusLost
        String texto = jtApellido.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtApellido.requestFocus();
                jtApellido.setText("");
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jtApellidoFocusLost

    private void jtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniFocusLost
        String texto = jtDni.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtDni.requestFocus();
            jtDni.setText("");
        }
    }//GEN-LAST:event_jtDniFocusLost

    private void jtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTelefonoFocusLost
        String texto = jtTelefono.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtTelefono.requestFocus();
            jtTelefono.setText("");
        }
    }//GEN-LAST:event_jtTelefonoFocusLost

    private void jtDomicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDomicilioFocusLost
        String texto = jtDomicilio.getText();
        try{
            if(!texto.isEmpty()){
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtDomicilio.requestFocus();
                jtDomicilio.setText("");
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jtDomicilioFocusLost

    private void jbGuardarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbGuardarFocusGained
        
    }//GEN-LAST:event_jbGuardarFocusGained

    private void jbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGuardarMouseClicked
        System.out.println("asdasdasdada");
    }//GEN-LAST:event_jbGuardarMouseClicked

    private void jbGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGuardarMouseEntered
        //System.out.println("");
    }//GEN-LAST:event_jbGuardarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtApellido.setText("");
        jtNombre.setText("");
        jtTelefono.setText("");
        jtDomicilio.setText("");
        jtDni.setText("");
    }
}
