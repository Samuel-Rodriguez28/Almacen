
package com.almacen.mx.dao;

import com.almacen.mx.entity.Requisiciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class RequisicionesDAO {
    
    private String mensaje = "";
     public String  agregarRequisiciones(Connection con, Requisiciones r)
     {
         PreparedStatement pst = null;
        String sql = "INSERT INTO REQUISICIONES (idRequisiciones,jef,plan, sub, dir, com, rec, observ,fecha)" + 
                "VALUES (?,?,?,?,?,?,?,?,?)";
     try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, r.getIdRequisiciones());
            pst.setInt(2, r.getJef());
            pst.setInt(3, r.getPlan());
            pst.setInt(4, r.getSub());
            pst.setInt(5, r.getDir());
            pst.setInt(6, r.getCom());
            pst.setInt(7, r.getRec());
            pst.setString(8, r.getObserv());
            pst.setInt(9, r.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
     
         return mensaje;
     }
     
     public String modificarRequisiciones (Connection con, Requisiciones r)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE SALIDA SET jef =?, plan =? , sub =?, dir =?, com =?, rec =?, observ =?, fecha = ?)" + 
                "WHERE idRequisiciones =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, r.getJef());
            pst.setInt(2, r.getPlan());
            pst.setInt(3, r.getSub());
            pst.setInt(4, r.getDir());
            pst.setInt(5, r.getCom());
            pst.setInt(6, r.getRec());
            pst.setString(7, r.getObserv());
            pst.setInt(8, r.getFecha());
            pst.setInt(9, r.getIdRequisiciones());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
     
     public String eliminarRequisiciones(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Requisiciones where idRequisiciones = ? ";
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
