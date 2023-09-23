/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.almacen.mx.view.aplicaciondepartamentomantenimiento;

import aplicaciondepartamentomantenimiento.customUI.ScrollBarCustom;

/**
 *
 * @author acost
 */
public class DestinoFormularioMenu extends javax.swing.JPanel {

    /**
     * Creates new form DestinoFormularioMenu
     */
    public DestinoFormularioMenu() {
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

        scrollPanePrincipal = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        idErrorLabel = new javax.swing.JLabel();
        nombreErrorLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        guardarButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setText("ID DESTINO");

        idTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N

        idErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        idErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        idErrorLabel.setText("ERROR");

        nombreErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        nombreErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        nombreErrorLabel.setText("ERROR");

        nombreTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE");

        guardarButton.setBackground(new java.awt.Color(0, 153, 51));
        guardarButton.setText("GUARDAR");
        guardarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
        });

        limpiarButton.setBackground(new java.awt.Color(255, 51, 51));
        limpiarButton.setText("LIMPIAR");
        limpiarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(idErrorLabel)
                    .addComponent(nombreErrorLabel)
                    .addComponent(jLabel4)
                    .addComponent(nombreTextField))
                .addGap(563, 563, 563))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarButton)
                .addGap(34, 34, 34)
                .addComponent(guardarButton)
                .addGap(121, 121, 121))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idErrorLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreErrorLabel)
                .addGap(87, 87, 87)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        scrollPanePrincipal.setViewportView(panelPrincipal);

        add(scrollPanePrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        comprobarDatos();
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void limpiarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarButtonMouseClicked
        limpiar();
    }//GEN-LAST:event_limpiarButtonMouseClicked
    
    //<editor-fold defaultstate="collapsed" desc="Metodos para la interfaz">
    private void manualInitComponents() {
        scrollPanePrincipal.setVerticalScrollBar(new ScrollBarCustom());
        scrollPanePrincipal.getVerticalScrollBar().setUnitIncrement(15);

        ocultarErrores();
    }

    private void ocultarErrores() {
        idErrorLabel.setText("");
        nombreErrorLabel.setText("");
    }

    private void limpiar() {
        idTextField.setText("");
        nombreTextField.setText("");
        ocultarErrores();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos para la obtencion de datos">
    //ESTE METODO COMPROBARA QUE CADA DATO EN LOS ELEMENTOS PARA RELLENAR SEA DEL FORMATO APROPIADO Y QUE NO ESTE VACIO 
    //SI TODOS LOS DATOS ESTAN CORRECTOS, DEVUELVE TRUE, DE LO CONTRARIO DEVUELVE UN FALSE
    //CUANDO UN FORMATO NO ESTE CORRECTO, SE INDICARA CON UN MENSAJE JUSTO DEBAJO DEL ELEMENTO EL CUAL GENERE EL ERROR
    private boolean comprobarDatos() {
        //COMPROBAR QUE EL TEXTO ESCRITO EN ID TEXTFIELD SEAN SOLO NUMEROS
        boolean error = false;
        try {
            Integer.valueOf(idTextField.getText());
        } catch (NumberFormatException e) {
            idErrorLabel.setText("ERROR");
            error = true;
        }

        //COMPROBAR QUE EL TEXTO EN NOMBRE NO ESTE VACIO
        if (nombreTextField.getText().isBlank() || nombreTextField.getText().isEmpty()) {
            nombreErrorLabel.setText("ERROR");
            error = true;
        }

        //SI HUBO ALGUN ERROR EL METODO REGRESA FALSE
        if (error) {
            return false;
        }

        //SI NO HUBO NINGUN ERROR EL METODO REGRESA TRUE
        ocultarErrores();
        return true;
    }

    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel idErrorLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JLabel nombreErrorLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanePrincipal;
    // End of variables declaration//GEN-END:variables
}
