/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondepartamentomantenimiento.customUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Lenovo Legion
 */
public class CustomHeader implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JComponent jcomponent = null;
        
        if( value instanceof String ) {
            jcomponent = new JLabel((String) value);
            ((JLabel)jcomponent).setHorizontalAlignment(SwingConstants.CENTER );
            ((JLabel)jcomponent).setSize(30, jcomponent.getWidth());   
            ((JLabel)jcomponent).setPreferredSize( new Dimension(6, jcomponent.getWidth()));
        }         
         
        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground( new Color(64,110,36) );
        jcomponent.setForeground(Color.white);
        jcomponent.setFont(new Font("Corbel", 0,20));
        
        
        return jcomponent;
    }
}


