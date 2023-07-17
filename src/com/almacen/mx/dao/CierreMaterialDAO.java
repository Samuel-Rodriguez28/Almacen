
package com.almacen.mx.dao;

import com.almacen.mx.entity.CiereMaterial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aargus
 */
public class CierreMaterialDAO {
    
    private String mensaje = "";
    public String agregarCiereMaterial(Connection con, CiereMaterial c)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO Ciere_Material (idCierre_material, oc, num_Req, num_Fac,proveedor,fec_sol,fgec_ent,nombre,observ)" + 
                "VALUES (?, ?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getIdCierrematerial());
            pst.setInt(2, c.getOc());
            pst.setInt(3,c.getNumReq());
            pst.setInt(4, c.getNumFac());
            pst.setString(5, c.getProveedor());
            pst.setString(6, c.getFechaSolicitud());
            pst.setString(7, c.getFechaEntrada());
            pst.setString(8, c.getNombreArticulo());
            pst.setString(9, c.getObservacion());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCiereMaterial(Connection con, CiereMaterial c)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE Ciere_Material SET  oc=?, num_Req=?, num_Fac=?,proveedor=?,fec_sol=?,fgec_ent=?,nombre=?,observ=?)" + 
                "WHERE idCierre_material =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getOc());
            pst.setInt(2,c.getNumReq());
            pst.setInt(3, c.getNumFac());
            pst.setString(4, c.getProveedor());
            pst.setString(5, c.getFechaSolicitud());
            pst.setString(6, c.getFechaEntrada());
            pst.setString(7, c.getNombreArticulo());
            pst.setString(8, c.getObservacion());
             pst.setInt(9, c.getIdCierrematerial());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
     public String eliminiarCiereMaterial(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM CiereMaterial where idCierre_material = ? ";
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
