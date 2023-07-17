
package com.almacen.mx.dao;

import com.almacen.mx.entity.Cotizacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author argus
 */
public class CotizacionDAO {
    private String mensaje = "";
    public String agregarCotizacion(Connection con, Cotizacion c)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO Cotizacion (idCotizacion, ARTIC, UM, CANT,CLAVE,FERR,ELECT,PLOM)" + 
                "VALUES (?, ?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getIdCorizacion());
            pst.setString(2, c.getArticulo());
            pst.setString(3, c.getUm());
            pst.setInt(4, c.getCantidad());
            pst.setInt(5, c.getClave());
            pst.setInt(6, c.getFerr());
            pst.setInt(7, c.getElect());
            pst.setInt(8, c.getPlom());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCotizacion (Connection con, Cotizacion c)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE Cotizacion SET ARTIC =?,UM=?,CANT=?,CLAVE=?,FERR=?,PLOM=?)" + 
                "WHERE idCotizacion =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getArticulo());
            pst.setString(2,c.getUm());
            pst.setInt(3, c.getCantidad());
            pst.setInt(4, c.getClave());
            pst.setInt(5, c.getFerr());
            pst.setInt(6, c.getElect());
            pst.setInt(7, c.getPlom());
            pst.setInt(8, c.getIdCorizacion());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminiarCotizacion(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Cotizacion where idCotizacion = ? ";
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
