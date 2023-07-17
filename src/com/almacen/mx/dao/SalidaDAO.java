/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almacen.mx.dao;

import com.almacen.mx.entity.Salida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author argus
 */
public class SalidaDAO {
    private String mensaje = "";
    public String agregarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO SALIDA (idSALIDA, idDESTINO, idSTOCK, PZAS, PERSONAL, DESTINO, OBSERV, FECHA)" + 
                "VALUES (?, ?, ?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getIdSalida());
            pst.setInt(2, sal.getIdStock());
            pst.setInt(3, sal.getPiezas());
            pst.setString(4, sal.getPersonal());
            pst.setString(5, sal.getDestino());
            pst.setString(6, sal.getObservacion());
            pst.setInt(7, sal.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE SALIDA SET PZAS =?, PERSONAL =? , DESTINO =?, OBSERV =?, FECHA =?)" + 
                "WHERE idSALIDA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getPiezas());
            pst.setString(2, sal.getPersonal());
            pst.setString(3, sal.getDestino());
            pst.setString(4, sal.getObservacion());
            pst.setInt(5, sal.getFecha());
            pst.setInt(6, sal.getIdSalida());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
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
    
}
