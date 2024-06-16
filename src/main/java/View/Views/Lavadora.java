/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import View.Views.Lavadora.*;
import controller.ListaDeLavadoras;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class Lavadora extends javax.swing.JPanel {

    private ListaDeLavadoras lavadoras;
    
    public Lavadora(ListaDeLavadoras lavadora ) {
        this.lavadoras=lavadora;
        initComponents();
    }
    
    
    private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundLavadora.removeAll();
        BackgroundLavadora.add(p,BorderLayout.CENTER);
        BackgroundLavadora.revalidate();
        BackgroundLavadora.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundLavadora = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CrearLavadora = new javax.swing.JButton();
        ModificarLavadora = new javax.swing.JButton();
        CalcularTiempodeLavado = new javax.swing.JButton();
        EliminarLavadora = new javax.swing.JButton();

        BackgroundLavadora.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundLavadora.setPreferredSize(new java.awt.Dimension(1082, 630));

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));

        CrearLavadora.setBackground(new java.awt.Color(21, 101, 192));
        CrearLavadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLavadora.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadora.setText("Crear lavadora");
        CrearLavadora.setBorder(null);
        CrearLavadora.setBorderPainted(false);
        CrearLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearLavadora.setIconTextGap(13);
        CrearLavadora.setInheritsPopupMenu(true);
        CrearLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLavadoraActionPerformed(evt);
            }
        });

        ModificarLavadora.setBackground(new java.awt.Color(21, 101, 192));
        ModificarLavadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificarLavadora.setForeground(new java.awt.Color(255, 255, 255));
        ModificarLavadora.setText("Modificar lavadora");
        ModificarLavadora.setBorder(null);
        ModificarLavadora.setBorderPainted(false);
        ModificarLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ModificarLavadora.setIconTextGap(13);
        ModificarLavadora.setInheritsPopupMenu(true);
        ModificarLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarLavadoraActionPerformed(evt);
            }
        });

        CalcularTiempodeLavado.setBackground(new java.awt.Color(21, 101, 192));
        CalcularTiempodeLavado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CalcularTiempodeLavado.setForeground(new java.awt.Color(255, 255, 255));
        CalcularTiempodeLavado.setText("Calcular tiempo de lavado");
        CalcularTiempodeLavado.setBorder(null);
        CalcularTiempodeLavado.setBorderPainted(false);
        CalcularTiempodeLavado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CalcularTiempodeLavado.setIconTextGap(13);
        CalcularTiempodeLavado.setInheritsPopupMenu(true);
        CalcularTiempodeLavado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularTiempodeLavadoActionPerformed(evt);
            }
        });

        EliminarLavadora.setBackground(new java.awt.Color(21, 101, 192));
        EliminarLavadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EliminarLavadora.setForeground(new java.awt.Color(255, 255, 255));
        EliminarLavadora.setText("Eliminar lavadora");
        EliminarLavadora.setBorder(null);
        EliminarLavadora.setBorderPainted(false);
        EliminarLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EliminarLavadora.setIconTextGap(13);
        EliminarLavadora.setInheritsPopupMenu(true);
        EliminarLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLavadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(ModificarLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(CalcularTiempodeLavado, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(EliminarLavadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CrearLavadora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModificarLavadora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CalcularTiempodeLavado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarLavadora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLavadoraLayout = new javax.swing.GroupLayout(BackgroundLavadora);
        BackgroundLavadora.setLayout(BackgroundLavadoraLayout);
        BackgroundLavadoraLayout.setHorizontalGroup(
            BackgroundLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLavadoraLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        BackgroundLavadoraLayout.setVerticalGroup(
            BackgroundLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLavadoraLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLavadoraActionPerformed
        MostrarJpanel (new CrearLavadora(lavadoras));
    }//GEN-LAST:event_CrearLavadoraActionPerformed

    private void ModificarLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarLavadoraActionPerformed
        MostrarJpanel (new ModificarLavadorasLista(lavadoras));
    }//GEN-LAST:event_ModificarLavadoraActionPerformed

    private void CalcularTiempodeLavadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularTiempodeLavadoActionPerformed
        MostrarJpanel (new TiempodeLavado(lavadoras));
    }//GEN-LAST:event_CalcularTiempodeLavadoActionPerformed

    private void EliminarLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLavadoraActionPerformed
        MostrarJpanel (new EliminarLavadorasLista(lavadoras));
    }//GEN-LAST:event_EliminarLavadoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLavadora;
    private javax.swing.JButton CalcularTiempodeLavado;
    private javax.swing.JButton CrearLavadora;
    private javax.swing.JButton EliminarLavadora;
    private javax.swing.JButton ModificarLavadora;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
