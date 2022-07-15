package inmobiliaria.vistas.vistasInquilino;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Modelo.Inquilino;
import javax.swing.JOptionPane;

public class AgregarInquilino extends javax.swing.JPanel {

    private InquilinoData inquilinoData;
    private Conexion con;
    private int contador;

    public AgregarInquilino() {
        initComponents();
        con = new Conexion();
        inquilinoData = new InquilinoData(con);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jtApellido = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jtDNI = new javax.swing.JTextField();
        jtCUIT = new javax.swing.JTextField();
        jtTrabajo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtNombreGarante = new javax.swing.JTextField();
        jtDniGarante = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CUIT");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Lugar de Trabajo");

        jtNombre.setBackground(new java.awt.Color(217, 217, 217));
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(0, 63, 121));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jtApellido.setBackground(new java.awt.Color(217, 217, 217));
        jtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtApellidoFocusLost(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(0, 63, 121));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jtDNI.setBackground(new java.awt.Color(217, 217, 217));
        jtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDNIFocusLost(evt);
            }
        });

        jtCUIT.setBackground(new java.awt.Color(217, 217, 217));
        jtCUIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCUITFocusLost(evt);
            }
        });
        jtCUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCUITActionPerformed(evt);
            }
        });

        jtTrabajo.setBackground(new java.awt.Color(217, 217, 217));
        jtTrabajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTrabajoFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nombre del Garante");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DNI del Garante");

        jtNombreGarante.setBackground(new java.awt.Color(217, 217, 217));
        jtNombreGarante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreGaranteFocusLost(evt);
            }
        });
        jtNombreGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreGaranteActionPerformed(evt);
            }
        });

        jtDniGarante.setBackground(new java.awt.Color(217, 217, 217));
        jtDniGarante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniGaranteFocusLost(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtTrabajo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jtDniGarante))))
                        .addGap(94, 94, 94))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar)
                .addGap(178, 178, 178))
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
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimpiar)
                    .addComponent(Guardar))
                .addGap(32, 32, 32))
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

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        jtNombre.setText("");
        jtApellido.setText("");
        jtDNI.setText("");
        jtCUIT.setText("");
        jtTrabajo.setText("");
        jtNombreGarante.setText("");
        jtDniGarante.setText("");
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
       
        if(contador != 7){
            JOptionPane.showMessageDialog(this, "Complete todos los campos correctamente");
        }else{
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        Long dni = Long.parseLong(jtDNI.getText());
        Long cuit = Long.parseLong(jtCUIT.getText());
        String trabajo = jtTrabajo.getText();
        String nombreGarante = jtNombreGarante.getText();
        Long dniGarante = Long.parseLong(jtDniGarante.getText());

        Inquilino nuevoInquilino = new Inquilino(nombre, apellido, dni, cuit, trabajo, nombreGarante, dniGarante, true);

        inquilinoData.agregarInquilino(nuevoInquilino);
        }
        

    }//GEN-LAST:event_GuardarActionPerformed

    private void jtCUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCUITActionPerformed

    private void jtNombreGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreGaranteActionPerformed

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        String texto = jtNombre.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtNombre.requestFocus();
                contador++;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusLost
        String texto = jtApellido.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtApellido.requestFocus();
                contador++;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtApellidoFocusLost

    private void jtNombreGaranteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreGaranteFocusLost
        String texto = jtNombreGarante.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtNombreGarante.requestFocus();
                contador++;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtNombreGaranteFocusLost

    private void jtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDNIFocusLost
        String texto = jtDNI.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                contador++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtDNI.requestFocus();
        }
    }//GEN-LAST:event_jtDNIFocusLost

    private void jtCUITFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCUITFocusLost
        String texto = jtCUIT.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                contador++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtCUIT.requestFocus();
        }
    }//GEN-LAST:event_jtCUITFocusLost

    private void jtTrabajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTrabajoFocusLost
        String texto = jtTrabajo.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                JOptionPane.showMessageDialog(this, "No puede ingresar un número en este campo");
                jtTrabajo.requestFocus();
                contador++;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtTrabajoFocusLost

    private void jtDniGaranteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniGaranteFocusLost
         String texto = jtDniGarante.getText();
        try {
            if (!texto.isEmpty()) {
                Double.parseDouble(texto);
                contador++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, debe ingresar un número en este campo");
            jtDniGarante.requestFocus();
        }
    }//GEN-LAST:event_jtDniGaranteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCUIT;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDniGarante;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreGarante;
    private javax.swing.JTextField jtTrabajo;
    // End of variables declaration//GEN-END:variables
}
