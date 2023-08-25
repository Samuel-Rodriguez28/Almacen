/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.almacen.mx.view.aplicaciondepartamentomantenimiento;

import aplicaciondepartamentomantenimiento.customUI.ScrollBarCustom;
import javax.swing.ButtonGroup;

/**
 *
 * @author acost
 */
public class CotizacionMenu extends javax.swing.JPanel {

    /**
     * Creates new form CotizacionMenu
     */
    public CotizacionMenu() {
        initComponents();
        manualInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelPrincipal = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        umTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cantidadTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        claveTextField = new javax.swing.JTextField();
        plomeriaRadioButton = new javax.swing.JRadioButton();
        electricidadRadioButton = new javax.swing.JRadioButton();
        ferreteriaRadioButton = new javax.swing.JRadioButton();
        limpiarButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        idErrorLabel = new javax.swing.JLabel();
        umErrorLabel = new javax.swing.JLabel();
        cantidadErrorLabel = new javax.swing.JLabel();
        claveErrorLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 616));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID COTIZACION");

        idTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N

        umTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UM");

        cantidadTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLAVE");

        claveTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N

        plomeriaRadioButton.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        plomeriaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        plomeriaRadioButton.setSelected(true);
        plomeriaRadioButton.setText("PLOMERIA");

        electricidadRadioButton.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        electricidadRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        electricidadRadioButton.setText("ELECTRICIDAD");
        electricidadRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electricidadRadioButtonActionPerformed(evt);
            }
        });

        ferreteriaRadioButton.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        ferreteriaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ferreteriaRadioButton.setText("FERRETERIA");

        limpiarButton.setBackground(new java.awt.Color(255, 51, 51));
        limpiarButton.setText("LIMPIAR");
        limpiarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarButtonMouseClicked(evt);
            }
        });

        guardarButton.setBackground(new java.awt.Color(0, 153, 51));
        guardarButton.setText("GUARDAR");
        guardarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
        });

        idErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        idErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        idErrorLabel.setText("ERROR");

        umErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        umErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        umErrorLabel.setText("ERROR");

        cantidadErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        cantidadErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        cantidadErrorLabel.setText("ERROR");

        claveErrorLabel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        claveErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        claveErrorLabel.setText("ERROR");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(claveTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(umTextField)
                    .addComponent(jLabel1)
                    .addComponent(idTextField)
                    .addComponent(cantidadErrorLabel)
                    .addComponent(jLabel3)
                    .addComponent(idErrorLabel)
                    .addComponent(claveErrorLabel)
                    .addComponent(umErrorLabel)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(cantidadTextField)
                        .addGap(17, 17, 17)))
                .addGap(340, 340, 340)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ferreteriaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plomeriaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electricidadRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarButton)
                .addGap(18, 18, 18)
                .addComponent(guardarButton)
                .addGap(119, 119, 119))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idErrorLabel)
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(plomeriaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ferreteriaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(electricidadRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umErrorLabel)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadErrorLabel)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveErrorLabel)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        scrollPanelPrincipal.setViewportView(panelPrincipal);

        add(scrollPanelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Metodos interfaz"> 
    private void electricidadRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electricidadRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electricidadRadioButtonActionPerformed

    private void limpiarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarButtonMouseClicked
        limpiar();
    }//GEN-LAST:event_limpiarButtonMouseClicked

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        comprobarDatos();
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void manualInit() {
        scrollPanelPrincipal.setVerticalScrollBar(new ScrollBarCustom());
        scrollPanelPrincipal.getVerticalScrollBar().setUnitIncrement(15);
        ocultarErrores();
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(electricidadRadioButton);
        grupo.add(ferreteriaRadioButton);
        grupo.add(plomeriaRadioButton);
    }

    private void ocultarErrores() {
        idErrorLabel.setText("");
        umErrorLabel.setText("");
        cantidadErrorLabel.setText("");
        claveErrorLabel.setText("");
    }
    
    private void limpiar(){
        idTextField.setText("");
        umTextField.setText("");
        cantidadTextField.setText("");
        claveTextField.setText("");
        ocultarErrores();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos para obtencion de datos">
    //ESTE METODO COMPROBARA QUE CADA DATO EN LOS ELEMENTOS PARA RELLENAR SEA DEL FORMATO APROPIADO Y QUE NO ESTE VACIO 
    //SI TODOS LOS DATOS ESTAN CORRECTOS, DEVUELVE TRUE, DE LO CONTRARIO DEVUELVE UN FALSE
    //CUANDO UN FORMATO NO ESTE CORRECTO, SE INDICARA CON UN MENSAJE JUSTO DEBAJO DEL ELEMENTO EL CUAL GENERE EL ERROR
    private boolean comprobarDatos() {
        ocultarErrores();
        //ESTA VARIABLE VALIDARA SI HUBO UN ERROR DURANTE LAS COMPROBACIONES, SI LO HAY ESTE VALOR SERA TRUE
        boolean error = false;

        //COMPROBAR QUE EL TEXTO ESCRITO EN ID TEXTFIELD SEAN SOLO NUMEROS
        try {
            Integer.valueOf(idTextField.getText());           
        } catch (NumberFormatException e) {
            idErrorLabel.setText("Error");
            error = true;
        }

        //Comprobar que el texto escrito en um no este vacio(ACEPTA NUMEROS Y LETRAS)
        if (umTextField.getText().isBlank() || umTextField.getText().isEmpty()) {
            umErrorLabel.setText("ERROR");
            error = true;
        }
        
        //COMPROBAR QUE EL TEXTO CANTIDAD EN ID TEXTFIELD SEAN SOLO NUMEROS
        try {
            Integer.valueOf(cantidadTextField.getText());           
        } catch (NumberFormatException e) {
            cantidadErrorLabel.setText("Error");
            error = true;
        }
        
        //Comprobar que el texto escrito en clave no este vacio(ACEPTA NUMEROS Y LETRAS)
        if (claveTextField.getText().isBlank() || claveTextField.getText().isEmpty()) {
            claveErrorLabel.setText("ERROR");
            error = true;
        }
        
        return true;
    }
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadErrorLabel;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JLabel claveErrorLabel;
    private javax.swing.JTextField claveTextField;
    private javax.swing.JRadioButton electricidadRadioButton;
    private javax.swing.JRadioButton ferreteriaRadioButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel idErrorLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton plomeriaRadioButton;
    private javax.swing.JScrollPane scrollPanelPrincipal;
    private javax.swing.JLabel umErrorLabel;
    private javax.swing.JTextField umTextField;
    // End of variables declaration//GEN-END:variables
}
