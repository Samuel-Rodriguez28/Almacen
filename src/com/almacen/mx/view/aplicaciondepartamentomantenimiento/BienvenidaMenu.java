/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.almacen.mx.view.aplicaciondepartamentomantenimiento;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author acost
 */
public class BienvenidaMenu extends javax.swing.JPanel {

    /**
     * Creates new form BienvenidaMenu
     */
    public BienvenidaMenu() {
        initComponents();
        manualInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuPrincipal = new javax.swing.JPanel();
        texto = new javax.swing.JPanel();
        textoInstitucion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        logoITS = new javax.swing.JLabel();

        setBorder(null);
        setLayout(new java.awt.BorderLayout());

        panelMenuPrincipal.setBackground(new java.awt.Color(44, 60, 67));
        panelMenuPrincipal.setLayout(new java.awt.BorderLayout());

        texto.setOpaque(false);
        texto.setPreferredSize(new java.awt.Dimension(1280, 200));
        texto.setLayout(new java.awt.BorderLayout(0, 10));

        textoInstitucion.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        textoInstitucion.setForeground(new java.awt.Color(255, 255, 255));
        textoInstitucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstitucion.setText("INSTITUTO TECNOLOGICO DE SALTILLO");
        textoInstitucion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        texto.add(textoInstitucion, java.awt.BorderLayout.PAGE_START);

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Departamento de Mantenimiento <p>Y prevencion");
        texto.add(jLabel2, java.awt.BorderLayout.CENTER);

        panelMenuPrincipal.add(texto, java.awt.BorderLayout.PAGE_START);

        logo.setOpaque(false);
        logo.setPreferredSize(new java.awt.Dimension(1215, 500));
        logo.setLayout(new java.awt.BorderLayout());

        logoITS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.add(logoITS, java.awt.BorderLayout.CENTER);

        panelMenuPrincipal.add(logo, java.awt.BorderLayout.CENTER);

        add(panelMenuPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc="Metodos usados para la interfaz">
    private void manualInitComponents(){       
        logoITS.setSize(500, 500);
        ponerImagen(logoITS, "src/com/almacen/mx/view/recursos/logotec.png");
    }
    
    private void ponerImagen(JLabel lb, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH));
        lb.setIcon(icono);
        this.repaint();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logoITS;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel texto;
    private javax.swing.JLabel textoInstitucion;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
