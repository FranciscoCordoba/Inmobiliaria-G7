package inmobiliaria.vistas;
import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.ContratoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.vistas.vistasContrato.ContratoMenu;
import inmobiliaria.vistas.vistasInquilino.InquilinoMenu;
import inmobiliaria.vistas.vistasPropiedades.PropiedadesMenu;
import inmobiliaria.vistas.vistasPropietario.PropietarioMenu;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame { //comentario

    private ImageIcon logo = new ImageIcon("Assets/logoG7Mini.png");
    private ImageIcon background = new ImageIcon("Assets/fotoMainMenu.png");
    private int xMouse, yMouse;
    
    private Color darkBlue = new Color(13,20,26);
    private Color normalBlue = new Color(24,32,38);
    
    private ContratoData conData;
    private PropiedadData propData;
    private Conexion con;

    public Menu() {
        initComponents();
	jlbLogo.setIcon(logo);	
	Inicio principal = new Inicio();
	principal.setSize(530, 410);
	
	principal.setLocation(0, 0);	
	
	jTitulo.setText("Inicio");
	
	mainPanel.add(principal);
	mainPanel.revalidate();
        con = new Conexion();
        propData = new PropiedadData(con);
        conData = new ContratoData(con);
        conData.actualizarContratos();
        propData.altaDisponibilidad();
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIzquierda = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpSideInicio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpSidePropietarios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpSideInquilinos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpSidePropiedades = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpSideContratos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jpSuperior = new javax.swing.JPanel();
        jpExitBtn = new javax.swing.JPanel();
        jlbExit = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 242, 242));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIzquierda.setBackground(new java.awt.Color(24, 32, 38));
        jpIzquierda.setAlignmentX(0.0F);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo 7");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Propiedades");

        jpSideInicio.setBackground(new java.awt.Color(24, 32, 38));
        jpSideInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpSideInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSideInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSideInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSideInicioMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inicio");

        javax.swing.GroupLayout jpSideInicioLayout = new javax.swing.GroupLayout(jpSideInicio);
        jpSideInicio.setLayout(jpSideInicioLayout);
        jpSideInicioLayout.setHorizontalGroup(
            jpSideInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideInicioLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel6)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jpSideInicioLayout.setVerticalGroup(
            jpSideInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSideInicioLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        jpSidePropietarios.setBackground(new java.awt.Color(24, 32, 38));
        jpSidePropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpSidePropietarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSidePropietariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSidePropietariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSidePropietariosMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Propietarios");

        javax.swing.GroupLayout jpSidePropietariosLayout = new javax.swing.GroupLayout(jpSidePropietarios);
        jpSidePropietarios.setLayout(jpSidePropietariosLayout);
        jpSidePropietariosLayout.setHorizontalGroup(
            jpSidePropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidePropietariosLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jpSidePropietariosLayout.setVerticalGroup(
            jpSidePropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidePropietariosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpSideInquilinos.setBackground(new java.awt.Color(24, 32, 38));
        jpSideInquilinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpSideInquilinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSideInquilinosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSideInquilinosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSideInquilinosMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inquilinos");

        javax.swing.GroupLayout jpSideInquilinosLayout = new javax.swing.GroupLayout(jpSideInquilinos);
        jpSideInquilinos.setLayout(jpSideInquilinosLayout);
        jpSideInquilinosLayout.setHorizontalGroup(
            jpSideInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSideInquilinosLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(70, 70, 70))
        );
        jpSideInquilinosLayout.setVerticalGroup(
            jpSideInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideInquilinosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpSidePropiedades.setBackground(new java.awt.Color(24, 32, 38));
        jpSidePropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpSidePropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSidePropiedadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSidePropiedadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSidePropiedadesMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Propiedades");

        javax.swing.GroupLayout jpSidePropiedadesLayout = new javax.swing.GroupLayout(jpSidePropiedades);
        jpSidePropiedades.setLayout(jpSidePropiedadesLayout);
        jpSidePropiedadesLayout.setHorizontalGroup(
            jpSidePropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidePropiedadesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jpSidePropiedadesLayout.setVerticalGroup(
            jpSidePropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSidePropiedadesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpSideContratos.setBackground(new java.awt.Color(24, 32, 38));
        jpSideContratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpSideContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSideContratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSideContratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSideContratosMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contratos");

        javax.swing.GroupLayout jpSideContratosLayout = new javax.swing.GroupLayout(jpSideContratos);
        jpSideContratos.setLayout(jpSideContratosLayout);
        jpSideContratosLayout.setHorizontalGroup(
            jpSideContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideContratosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel9)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jpSideContratosLayout.setVerticalGroup(
            jpSideContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideContratosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpIzquierdaLayout = new javax.swing.GroupLayout(jpIzquierda);
        jpIzquierda.setLayout(jpIzquierdaLayout);
        jpIzquierdaLayout.setHorizontalGroup(
            jpIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSidePropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpSideInquilinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpSidePropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpSideContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpIzquierdaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jpSideInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpIzquierdaLayout.setVerticalGroup(
            jpIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIzquierdaLayout.createSequentialGroup()
                .addGroup(jpIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIzquierdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIzquierdaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(66, 66, 66)
                .addComponent(jpSideInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpSidePropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSideInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSidePropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSideContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        getContentPane().add(jpIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 480));

        jpSuperior.setBackground(new java.awt.Color(96, 118, 138));
        jpSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpSuperiorMouseDragged(evt);
            }
        });
        jpSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpSuperiorMousePressed(evt);
            }
        });

        jpExitBtn.setBackground(new java.awt.Color(96, 118, 138));

        jlbExit.setBackground(new java.awt.Color(96, 118, 138));
        jlbExit.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jlbExit.setForeground(new java.awt.Color(255, 255, 255));
        jlbExit.setText("X");
        jlbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpExitBtnLayout = new javax.swing.GroupLayout(jpExitBtn);
        jpExitBtn.setLayout(jpExitBtnLayout);
        jpExitBtnLayout.setHorizontalGroup(
            jpExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExitBtnLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpExitBtnLayout.setVerticalGroup(
            jpExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jTitulo.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(jpExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addGroup(jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpSuperiorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTitulo)))
                .addGap(54, 54, 54))
        );

        getContentPane().add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSuperiorMousePressed
        // TODO add your handling code here:
	xMouse = evt.getX();
	yMouse = evt.getY();	
	
    }//GEN-LAST:event_jpSuperiorMousePressed

    private void jpSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSuperiorMouseDragged
        // TODO add your handling code here:
	int x = evt.getXOnScreen();
	int y = evt.getYOnScreen();
	this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpSuperiorMouseDragged

    private void jlbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseClicked
        // TODO add your handling code here:
	dispose();
    }//GEN-LAST:event_jlbExitMouseClicked

    private void jlbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseEntered
        // TODO add your handling code here:
	jlbExit.setForeground(Color.darkGray);
    }//GEN-LAST:event_jlbExitMouseEntered

    private void jlbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseExited
        // TODO add your handling code here:
	jlbExit.setForeground(Color.white);
    }//GEN-LAST:event_jlbExitMouseExited

    private void jpSidePropietariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropietariosMouseEntered
        // TODO add your handling code here:	
	jpSidePropietarios.setBackground(darkBlue);
	
    }//GEN-LAST:event_jpSidePropietariosMouseEntered

    private void jpSidePropietariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropietariosMouseExited
        // TODO add your handling code here:
	jpSidePropietarios.setBackground(normalBlue);
    }//GEN-LAST:event_jpSidePropietariosMouseExited

    private void jpSideInquilinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInquilinosMouseEntered
        // TODO add your handling code here:
	jpSideInquilinos.setBackground(darkBlue);
    }//GEN-LAST:event_jpSideInquilinosMouseEntered

    private void jpSideInquilinosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInquilinosMouseExited
        // TODO add your handling code here:
	jpSideInquilinos.setBackground(normalBlue);
    }//GEN-LAST:event_jpSideInquilinosMouseExited

    private void jpSidePropiedadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropiedadesMouseEntered
        // TODO add your handling code here:
	jpSidePropiedades.setBackground(darkBlue);
    }//GEN-LAST:event_jpSidePropiedadesMouseEntered

    private void jpSidePropiedadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropiedadesMouseExited
        // TODO add your handling code here:
	jpSidePropiedades.setBackground(normalBlue);
    }//GEN-LAST:event_jpSidePropiedadesMouseExited

    private void jpSideContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideContratosMouseEntered
        // TODO add your handling code here:
	jpSideContratos.setBackground(darkBlue);
    }//GEN-LAST:event_jpSideContratosMouseEntered

    private void jpSideContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideContratosMouseExited
        // TODO add your handling code here:
	jpSideContratos.setBackground(normalBlue);
    }//GEN-LAST:event_jpSideContratosMouseExited

    private void jpSidePropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropietariosMouseClicked
        // TODO add your handling code here:
	mainPanel.removeAll();
	
	PropietarioMenu nuevoPropiMenu = new PropietarioMenu();
	nuevoPropiMenu.setSize(530, 410);
	nuevoPropiMenu.setLocation(0, 0);
	
	jTitulo.setText("Propietarios");
	
	mainPanel.add(nuevoPropiMenu);
	mainPanel.revalidate();
	
    }//GEN-LAST:event_jpSidePropietariosMouseClicked

    private void jpSideInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInicioMouseEntered
        // TODO add your handling code here:
	jpSideInicio.setBackground(darkBlue);
    }//GEN-LAST:event_jpSideInicioMouseEntered

    private void jpSideInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInicioMouseExited
        // TODO add your handling code here:
	jpSideInicio.setBackground(normalBlue);
    }//GEN-LAST:event_jpSideInicioMouseExited

    private void jpSideInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInicioMouseClicked
        // TODO add your handling code here:
	
	mainPanel.removeAll();
	
	Inicio nuevoIni = new Inicio();
	nuevoIni.setSize(530, 410);
	
	nuevoIni.setLocation(0, 0);
	
	jTitulo.setText("Inicio");
	
	mainPanel.add(nuevoIni);
	mainPanel.revalidate();
	
    }//GEN-LAST:event_jpSideInicioMouseClicked

    private void jpSideInquilinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideInquilinosMouseClicked
        // TODO add your handling code here:
	mainPanel.removeAll();
	
	InquilinoMenu nuevoInquiMenu = new InquilinoMenu();
	nuevoInquiMenu.setSize(530, 410);
	nuevoInquiMenu.setLocation(0, 0);
	
	jTitulo.setText("Inquilinos");
	
	mainPanel.add(nuevoInquiMenu);
	mainPanel.revalidate();
    }//GEN-LAST:event_jpSideInquilinosMouseClicked

    private void jpSidePropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSidePropiedadesMouseClicked
        // TODO add your handling code here:
	mainPanel.removeAll();
	
	PropiedadesMenu nuevaPropiedadMenu = new PropiedadesMenu();
	nuevaPropiedadMenu.setSize(530, 410);
	nuevaPropiedadMenu.setLocation(0, 0);
	
	jTitulo.setText("Propiedades");
	
	mainPanel.add(nuevaPropiedadMenu);
	mainPanel.revalidate();	
    }//GEN-LAST:event_jpSidePropiedadesMouseClicked

    private void jpSideContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSideContratosMouseClicked
        // TODO add your handling code here:
	mainPanel.removeAll();
	
	ContratoMenu nuevoContratoMenu = new ContratoMenu();
	nuevoContratoMenu.setSize(530, 410);
	nuevoContratoMenu.setLocation(0, 0);
	
	jTitulo.setText("Contratos");
	
	mainPanel.add(nuevoContratoMenu);
	mainPanel.revalidate();	
    }//GEN-LAST:event_jpSideContratosMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jlbExit;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JPanel jpExitBtn;
    private javax.swing.JPanel jpIzquierda;
    private javax.swing.JPanel jpSideContratos;
    private javax.swing.JPanel jpSideInicio;
    private javax.swing.JPanel jpSideInquilinos;
    private javax.swing.JPanel jpSidePropiedades;
    private javax.swing.JPanel jpSidePropietarios;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
