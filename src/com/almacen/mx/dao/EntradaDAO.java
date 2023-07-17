
package com.almacen.mx.dao;

import com.almacen.mx.entity.Entrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author argus
 */
public class EntradaDAO {
    
    private String mensaje = "";
    public String agregarEntrada (Connection con, Entrada ent)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO ENTRADA (idENTRADA, idSTOCK, UNIDADES, NOM_ART, ESTADO, FECHA)" + 
                "VALUES (?, ?, ?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getIdEntrada());
            pst.setInt(2, ent.getIdStock());
            pst.setInt(3, ent.getUnidades());
            pst.setString(4, ent.getNombreArticulo());
            pst.setString(5, ent.getEstado());
            pst.setInt(6, ent.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
   
    public String modificarEntrada (Connection con, Entrada ent)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE ENTRADA SET UNIDADES =?, NOM_ART =?,ESTADO =?,FECHA =?)" + 
                "WHERE idENTRADA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getUnidades());
            pst.setString(2, ent.getNombreArticulo());
            pst.setString(3, ent.getEstado());
            pst.setInt(4, ent.getFecha());
             pst.setInt(5, ent.getIdEntrada());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarENTRDA(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM ENTRADA where idENTRADA = ? ";
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
