
package com.almacen.mx.dao;

import com.almacen.mx.entity.Areas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author argus
 */
public class AreasDAO {
    
    private String mensaje = "";
    public String agregarArea (Connection con, Areas a)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO Areas (idAreas, nombre)" + 
                "VALUES (?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, a.getIdAreas());
            pst.setString(2, a.getNombre());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarAreas (Connection con, Areas a)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE Areas SET nombre =?)" + 
                "WHERE idAreas =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, a.getNombre());
            pst.setInt(2,a.getIdAreas());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminiarAreas(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Areas where idAreas = ? ";
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
