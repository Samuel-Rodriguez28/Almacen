/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almacen.mx.dao;

import com.almacen.mx.entity.Salida;
import com.almacen.mx.view.aplicaciondepartamentomantenimiento.customUI.ModeloTabla;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argus
 */
public class SalidaDAO {
    private String mensaje = "";
    
    //MÉTODO PARA AGREGAR UN REGISTRO DE SALIDA
    public String agregarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO SALIDA (idSALIDA, idDESTINO, idSTOCK, PZAS, PERSONAL, OBSERV, FECHA)" + 
                "VALUES (?, ?, ?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getIdSalida());
            pst.setInt(2, sal.getIdStock());
            pst.setInt(3, sal.getPiezas());
            pst.setString(4, sal.getPersonal());
            pst.setString(5, sal.getObservacion());
            pst.setString(6, sal.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    //MÉTODO PARA MODIFICAR UN REGISTRO DE SALIDA
    public String modificarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE SALIDA SET PZAS =?, PERSONAL =? , OBSERV =?, FECHA =?)" + 
                "WHERE idSALIDA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getPiezas());
            pst.setString(2, sal.getPersonal());
            pst.setString(3, sal.getObservacion());
            pst.setString(4, sal.getFecha());
            pst.setInt(5, sal.getIdSalida());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    //MÉTODO PARA ELIMINAR UN REGISTRO 
    public String eliminiarSALIDA(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM SALIDA where idSALIDA = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            
            mensaje = "elliminado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo eliminar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    //MÉTODOS PARA LISTAR LOS ELEMENTOS DE LAS TABLAS
    public void listSalidaID(Connection con, JTable tablaSalida){
        String[] titulosSalida = {"NUMERO", "DESTINO", "ARTICULO", "PIEZAS", "PERSONAL", "OBSERV", "FECHA"};
        Object[][] datosSalida = new Object[0][0];
        
        DefaultTableModel modeloTablaSalida = new ModeloTabla(datosSalida,titulosSalida, false); 
        tablaSalida.getTableHeader().setBackground(new Color(64,110,36));
        tablaSalida.getTableHeader().setFont(new Font("Corbel", 1, 1));
        
        String sql = "SELECT sa.IDSALIDA, dest.NOMBRE, st.NOM_ART, sa.PZAS, sa.PERSONAL, sa.OBSERV, FORMAT(sa.FECHA, 'dd-MM-yyyy') as FECHA " +
                     "FROM SALIDA sa " +
                     "JOIN DESTINO dest ON sa.IDDESTINO = dest.IDDESTINO " +
                     "JOIN STOCK st ON sa.idSTOCK = st.IDSTOCK " +
                     "ORDER BY sa.IDSALIDA;";
        
        String [] filas = new String[7];
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                
                modeloTablaSalida.addRow(filas);
            }
            
            tablaSalida.setModel(modeloTablaSalida);
            
            st.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
