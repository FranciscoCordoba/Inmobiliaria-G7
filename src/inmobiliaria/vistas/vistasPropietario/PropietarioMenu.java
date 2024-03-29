/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.vistas.vistasPropietario;

import java.awt.Color;

/**
 *
 * @author nican
 */
public class PropietarioMenu extends javax.swing.JPanel {

    
    Color lightblue = new Color(54,135,195);
    Color blue = new Color(0,63,121);
    /**
     * Creates new form PropietarioMenu
     */
    public PropietarioMenu() {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelPropietarioMenu = new javax.swing.JPanel();
        jpAgregarPropi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpBuscarPropi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpEditarPropi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpEliminarPropi = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jpAgregarPropi.setBackground(new java.awt.Color(54, 135, 195));
        jpAgregarPropi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAgregarPropi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAgregarPropiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpAgregarPropiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpAgregarPropiMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Propietario");

        javax.swing.GroupLayout jpAgregarPropiLayout = new javax.swing.GroupLayout(jpAgregarPropi);
        jpAgregarPropi.setLayout(jpAgregarPropiLayout);
        jpAgregarPropiLayout.setHorizontalGroup(
            jpAgregarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAgregarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAgregarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jpAgregarPropiLayout.setVerticalGroup(
            jpAgregarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAgregarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jpBuscarPropi.setBackground(new java.awt.Color(54, 135, 195));
        jpBuscarPropi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBuscarPropi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBuscarPropiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBuscarPropiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBuscarPropiMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Propietario");

        javax.swing.GroupLayout jpBuscarPropiLayout = new javax.swing.GroupLayout(jpBuscarPropi);
        jpBuscarPropi.setLayout(jpBuscarPropiLayout);
        jpBuscarPropiLayout.setHorizontalGroup(
            jpBuscarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jpBuscarPropiLayout.setVerticalGroup(
            jpBuscarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jpEditarPropi.setBackground(new java.awt.Color(54, 135, 195));
        jpEditarPropi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpEditarPropi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEditarPropiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEditarPropiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEditarPropiMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Propietario");

        javax.swing.GroupLayout jpEditarPropiLayout = new javax.swing.GroupLayout(jpEditarPropi);
        jpEditarPropi.setLayout(jpEditarPropiLayout);
        jpEditarPropiLayout.setHorizontalGroup(
            jpEditarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEditarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jpEditarPropiLayout.setVerticalGroup(
            jpEditarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jpEliminarPropi.setBackground(new java.awt.Color(54, 135, 195));
        jpEliminarPropi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpEliminarPropi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEliminarPropiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEliminarPropiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEliminarPropiMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Propietario");

        javax.swing.GroupLayout jpEliminarPropiLayout = new javax.swing.GroupLayout(jpEliminarPropi);
        jpEliminarPropi.setLayout(jpEliminarPropiLayout);
        jpEliminarPropiLayout.setHorizontalGroup(
            jpEliminarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEliminarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEliminarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jpEliminarPropiLayout.setVerticalGroup(
            jpEliminarPropiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEliminarPropiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpPanelPropietarioMenuLayout = new javax.swing.GroupLayout(jpPanelPropietarioMenu);
        jpPanelPropietarioMenu.setLayout(jpPanelPropietarioMenuLayout);
        jpPanelPropietarioMenuLayout.setHorizontalGroup(
            jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelPropietarioMenuLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpAgregarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpBuscarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpEditarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEliminarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jpPanelPropietarioMenuLayout.setVerticalGroup(
            jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelPropietarioMenuLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpAgregarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEditarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jpPanelPropietarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBuscarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEliminarPropi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPanelPropietarioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPanelPropietarioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpAgregarPropiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAgregarPropiMouseClicked
        // TODO add your handling code here:
	jpPanelPropietarioMenu.removeAll();
	
	AgregarPropietario nuevoPropiMenu = new AgregarPropietario();
	nuevoPropiMenu.setSize(530, 410);
	nuevoPropiMenu.setLocation(0, 0);	
	
	jpPanelPropietarioMenu.add(nuevoPropiMenu);
	jpPanelPropietarioMenu.revalidate();
	
    }//GEN-LAST:event_jpAgregarPropiMouseClicked

    private void jpEditarPropiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEditarPropiMouseClicked
        // TODO add your handling code here:
	jpPanelPropietarioMenu.removeAll();
	
	EditarPropietario editPropiMenu = new EditarPropietario();
	editPropiMenu.setSize(530, 410);
	editPropiMenu.setLocation(0, 0);
	
	jpPanelPropietarioMenu.add(editPropiMenu);
	jpPanelPropietarioMenu.revalidate();
    }//GEN-LAST:event_jpEditarPropiMouseClicked

    private void jpBuscarPropiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarPropiMouseClicked
        // TODO add your handling code here:
	jpPanelPropietarioMenu.removeAll();
	
	BuscarPropietario buscarPropiMenu = new BuscarPropietario();
	buscarPropiMenu.setSize(530, 410);
	buscarPropiMenu.setLocation(0, 0);
	
	jpPanelPropietarioMenu.add(buscarPropiMenu);
	jpPanelPropietarioMenu.revalidate();
    }//GEN-LAST:event_jpBuscarPropiMouseClicked

    private void jpEliminarPropiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarPropiMouseClicked
        // TODO add your handling code here:
	jpPanelPropietarioMenu.removeAll();
	
	EliminarPropietario eliminarPropiMenu = new EliminarPropietario();
	eliminarPropiMenu.setSize(530, 410);
	eliminarPropiMenu.setLocation(0, 0);
	
	jpPanelPropietarioMenu.add(eliminarPropiMenu);
	jpPanelPropietarioMenu.revalidate();
    }//GEN-LAST:event_jpEliminarPropiMouseClicked

    private void jpAgregarPropiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAgregarPropiMouseEntered
        // TODO add your handling code here:
	jpAgregarPropi.setBackground(blue);
    }//GEN-LAST:event_jpAgregarPropiMouseEntered

    private void jpAgregarPropiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAgregarPropiMouseExited
        // TODO add your handling code here:
	jpAgregarPropi.setBackground(lightblue);
    }//GEN-LAST:event_jpAgregarPropiMouseExited

    private void jpEditarPropiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEditarPropiMouseEntered
        // TODO add your handling code here:
	jpEditarPropi.setBackground(blue);
    }//GEN-LAST:event_jpEditarPropiMouseEntered

    private void jpEditarPropiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEditarPropiMouseExited
        // TODO add your handling code here:
	jpEditarPropi.setBackground(lightblue);
    }//GEN-LAST:event_jpEditarPropiMouseExited

    private void jpBuscarPropiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarPropiMouseEntered
        // TODO add your handling code here:
	jpBuscarPropi.setBackground(blue);
    }//GEN-LAST:event_jpBuscarPropiMouseEntered

    private void jpBuscarPropiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarPropiMouseExited
        // TODO add your handling code here:
	jpBuscarPropi.setBackground(lightblue);
    }//GEN-LAST:event_jpBuscarPropiMouseExited

    private void jpEliminarPropiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarPropiMouseEntered
        // TODO add your handling code here:
	jpEliminarPropi.setBackground(blue);
    }//GEN-LAST:event_jpEliminarPropiMouseEntered

    private void jpEliminarPropiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarPropiMouseExited
        // TODO add your handling code here:
	jpEliminarPropi.setBackground(lightblue);
    }//GEN-LAST:event_jpEliminarPropiMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jpAgregarPropi;
    private javax.swing.JPanel jpBuscarPropi;
    private javax.swing.JPanel jpEditarPropi;
    private javax.swing.JPanel jpEliminarPropi;
    private javax.swing.JPanel jpPanelPropietarioMenu;
    // End of variables declaration//GEN-END:variables
}
