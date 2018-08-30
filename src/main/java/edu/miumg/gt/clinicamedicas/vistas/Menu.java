/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.vistas;

import edu.miumg.gt.clinicamedicas.ws.inte.SessionInt;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author BYRON TOLEDO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu_
     */
    
    @Autowired()
     Persona persona;
    
    @Autowired()
    SessionInt sessionInt;
    
    public Menu() {
     initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        JCrearPersona = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        JcerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JCrearPersona.setIcon(new javax.swing.ImageIcon("C:\\Users\\BYRON TOLEDO\\Documents\\NetBeansProjects\\ClinicaMedicas\\src\\main\\java\\IMAGENES\\user.png")); // NOI18N
        JCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCrearPersonaActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\BYRON TOLEDO\\Documents\\NetBeansProjects\\ClinicaMedicas\\src\\main\\java\\IMAGENES\\resume.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BYRON TOLEDO\\Documents\\NetBeansProjects\\ClinicaMedicas\\src\\main\\java\\IMAGENES\\medical-history.png")); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BYRON TOLEDO\\Documents\\NetBeansProjects\\ClinicaMedicas\\src\\main\\java\\IMAGENES\\stethoscope.png")); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\BYRON TOLEDO\\Documents\\NetBeansProjects\\ClinicaMedicas\\src\\main\\java\\IMAGENES\\calendar.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(JCrearPersona, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(JCrearPersona)
                        .addGap(106, 106, 106)
                        .addComponent(jButton2)))
                .addGap(99, 99, 99)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(JCrearPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jMenu1.setText("Proceso");

        jMenuItem1.setText("Registrar Ficha");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Registrar Consulta");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Registrar Cita");
        jMenu1.add(jMenuItem3);

        MenuBar.add(jMenu1);

        jMenu2.setText("Modificar");

        jMenuItem4.setText("Paciente");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cita");
        jMenu2.add(jMenuItem5);

        MenuBar.add(jMenu2);

        jMenu4.setText("Consultar");

        jMenuItem6.setText("Fichas");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Paciente");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Cita");
        jMenu4.add(jMenuItem8);

        MenuBar.add(jMenu4);

        JcerrarSesion.setText("Cerrar Session");
        JcerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JcerrarSesionMouseClicked(evt);
            }
        });
        JcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcerrarSesionActionPerformed(evt);
            }
        });
        MenuBar.add(JcerrarSesion);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCrearPersonaActionPerformed
        persona.setLocationRelativeTo(null);
        persona.setExtendedState(JFrame.MAXIMIZED_BOTH);
        persona.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JCrearPersonaActionPerformed

    private void JcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcerrarSesionActionPerformed
    
    }//GEN-LAST:event_JcerrarSesionActionPerformed

    private void JcerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcerrarSesionMouseClicked
         sessionInt.delete();
         System.exit(0);
    }//GEN-LAST:event_JcerrarSesionMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JCrearPersona;
    private javax.swing.JMenu JcerrarSesion;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
