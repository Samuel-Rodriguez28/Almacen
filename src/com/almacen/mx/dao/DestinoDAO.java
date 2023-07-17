
package com.almacen.mx.dao;

import com.almacen.mx.entity.Destino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author argus
 */
public class DestinoDAO {
    private String mensaje = "";
    public String agregarDestino (Connection con, Destino d)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO Destino (idDestino, nombre)" + 
                "VALUES (?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, d.getIdDestino());
            pst.setString(2, d.getNombre());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarDestino (Connection con, Destino d)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE Destino SET nombre =?)" + 
                "WHERE idDestino =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, d.getNombre());
            pst.setInt(2,d.getIdDestino());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminiarDestino(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Destino where idDestino = ? ";
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
