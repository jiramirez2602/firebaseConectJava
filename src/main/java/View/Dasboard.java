/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import View.Views.Contenido;
import View.Views.Lavadora;
import View.Views.MostrarElectrodomesticos;
import View.Views.MostrarEstadistica;
import View.Views.Televisor;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import firebase.Conexion;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class Dasboard extends javax.swing.JFrame {

    private ListaDeLavadoras lavadoras;
    private ListaDeTelevisores televisores;
    int xMouse;
    int yMouse;

    public Dasboard() {
        Conexion.conectarFirebase();
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/logo_repara.png")).getImage());
        InitContent();
        SetDate();
        this.setLocationRelativeTo(null);
        lavadoras = new ListaDeLavadoras();
        televisores = new ListaDeTelevisores();
    }

    private void InitContent() {
        MostrarJpanel(new Contenido());
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        LabelFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void MostrarJpanel(JPanel p) {
        p.setSize(1082, 630);
        p.setLocation(0, 0);
        ContenidoDash.removeAll();
        ContenidoDash.add(p, BorderLayout.CENTER);
        ContenidoDash.revalidate();
        ContenidoDash.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelIzquierdo = new javax.swing.JPanel();
        BackgroundLabels = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JButton();
        BotonLavadora = new javax.swing.JButton();
        BotonTelevisor = new javax.swing.JButton();
        BotonMostrarElectrodomesticos = new javax.swing.JButton();
        MostrarEstadistica = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PanelHorizontal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelFecha = new javax.swing.JLabel();
        ContenidoDash = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1368, 768));
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMinimumSize(new java.awt.Dimension(1370, 768));

        PanelIzquierdo.setBackground(new java.awt.Color(21, 101, 192));
        PanelIzquierdo.setPreferredSize(new java.awt.Dimension(270, 768));

        BackgroundLabels.setBackground(new java.awt.Color(21, 101, 192));

        BotonInicio.setBackground(new java.awt.Color(21, 101, 192));
        BotonInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        BotonInicio.setText("Principal");
        BotonInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonInicio.setBorderPainted(false);
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonInicio.setIconTextGap(13);
        BotonInicio.setInheritsPopupMenu(true);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        BotonLavadora.setBackground(new java.awt.Color(21, 101, 192));
        BotonLavadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonLavadora.setForeground(new java.awt.Color(255, 255, 255));
        BotonLavadora.setText("Lavadora");
        BotonLavadora.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonLavadora.setBorderPainted(false);
        BotonLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonLavadora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonLavadora.setIconTextGap(13);
        BotonLavadora.setInheritsPopupMenu(true);
        BotonLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLavadoraActionPerformed(evt);
            }
        });

        BotonTelevisor.setBackground(new java.awt.Color(21, 101, 192));
        BotonTelevisor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonTelevisor.setForeground(new java.awt.Color(255, 255, 255));
        BotonTelevisor.setText("Televisor");
        BotonTelevisor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonTelevisor.setBorderPainted(false);
        BotonTelevisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonTelevisor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTelevisor.setIconTextGap(13);
        BotonTelevisor.setInheritsPopupMenu(true);
        BotonTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTelevisorActionPerformed(evt);
            }
        });

        BotonMostrarElectrodomesticos.setBackground(new java.awt.Color(21, 101, 192));
        BotonMostrarElectrodomesticos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMostrarElectrodomesticos.setForeground(new java.awt.Color(255, 255, 255));
        BotonMostrarElectrodomesticos.setText("Mostrar Electrodomésticos");
        BotonMostrarElectrodomesticos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMostrarElectrodomesticos.setBorderPainted(false);
        BotonMostrarElectrodomesticos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonMostrarElectrodomesticos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMostrarElectrodomesticos.setIconTextGap(13);
        BotonMostrarElectrodomesticos.setInheritsPopupMenu(true);
        BotonMostrarElectrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarElectrodomesticosActionPerformed(evt);
            }
        });

        MostrarEstadistica.setBackground(new java.awt.Color(21, 101, 192));
        MostrarEstadistica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MostrarEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEstadistica.setText("Mostrar Estadistica");
        MostrarEstadistica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        MostrarEstadistica.setBorderPainted(false);
        MostrarEstadistica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MostrarEstadistica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarEstadistica.setIconTextGap(13);
        MostrarEstadistica.setInheritsPopupMenu(true);
        MostrarEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEstadisticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLabelsLayout = new javax.swing.GroupLayout(BackgroundLabels);
        BackgroundLabels.setLayout(BackgroundLabelsLayout);
        BackgroundLabelsLayout.setHorizontalGroup(
            BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(BotonLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(BotonTelevisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(BotonMostrarElectrodomesticos, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(MostrarEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLabelsLayout.setVerticalGroup(
            BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(BotonLavadora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(BotonTelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(BotonMostrarElectrodomesticos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(MostrarEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MultiAparatos");

        javax.swing.GroupLayout PanelIzquierdoLayout = new javax.swing.GroupLayout(PanelIzquierdo);
        PanelIzquierdo.setLayout(PanelIzquierdoLayout);
        PanelIzquierdoLayout.setHorizontalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        PanelIzquierdoLayout.setVerticalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BackgroundLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelHorizontal.setBackground(new java.awt.Color(21, 101, 192));

        jPanel1.setBackground(new java.awt.Color(21, 101, 192));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        LabelFecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout PanelHorizontalLayout = new javax.swing.GroupLayout(PanelHorizontal);
        PanelHorizontal.setLayout(PanelHorizontalLayout);
        PanelHorizontalLayout.setHorizontalGroup(
            PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHorizontalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHorizontalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );
        PanelHorizontalLayout.setVerticalGroup(
            PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorizontalLayout.createSequentialGroup()
                .addGroup(PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 96, Short.MAX_VALUE))
            .addGroup(PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHorizontalLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        ContenidoDash.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenidoDashLayout = new javax.swing.GroupLayout(ContenidoDash);
        ContenidoDash.setLayout(ContenidoDashLayout);
        ContenidoDashLayout.setHorizontalGroup(
            ContenidoDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenidoDashLayout.setVerticalGroup(
            ContenidoDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenidoDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PanelHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ContenidoDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelIzquierdo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        MostrarJpanel (new Contenido());
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLavadoraActionPerformed
        ListaDeLavadoras Lista = new ListaDeLavadoras();
        MostrarJpanel (new Lavadora(lavadoras));
    }//GEN-LAST:event_BotonLavadoraActionPerformed

    private void BotonTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTelevisorActionPerformed
        MostrarJpanel (new Televisor(televisores));
    }//GEN-LAST:event_BotonTelevisorActionPerformed

    private void BotonMostrarElectrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarElectrodomesticosActionPerformed
        MostrarJpanel (new MostrarElectrodomesticos(lavadoras,televisores));
    }//GEN-LAST:event_BotonMostrarElectrodomesticosActionPerformed

    private void MostrarEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEstadisticaActionPerformed
        MostrarJpanel (new MostrarEstadistica(lavadoras,televisores));
    }//GEN-LAST:event_MostrarEstadisticaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BackgroundLabels;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonLavadora;
    private javax.swing.JButton BotonMostrarElectrodomesticos;
    private javax.swing.JButton BotonTelevisor;
    private javax.swing.JPanel ContenidoDash;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JButton MostrarEstadistica;
    private javax.swing.JPanel PanelHorizontal;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
