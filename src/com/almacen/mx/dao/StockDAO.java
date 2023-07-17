
package com.almacen.mx.dao;

import com.almacen.mx.entity.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author argus
 */
public class StockDAO {
      private String mensaje = "";
     public String agregarStock (Connection con, Stock s)
     {
         PreparedStatement pst = null;
        String sql = "INSERT INTO STOCK (idSTOCK,idAREAS,PIEZAS, CODIGO, NOM_ART, MARCA, OBSERVACION, MINIMO)" + 
                "VALUES (?,?,?,?,?,?,?)";
     try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdStock());
            pst.setInt(2, s.getIdAreas());
            pst.setInt(3, s.getCodigo());
            pst.setString(4, s.getNombreArticulo());
            pst.setString(5, s.getMarca());
            pst.setString(6, s.getObservacion());
            pst.setInt(7, s.getMinimo());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
     
         return mensaje;
     }
     
     public String modificarStock (Connection con, Stock s)
     {
     PreparedStatement pst =null;
        String sql = "UPDATE STOCK SET idAREAS =?, CODIGO =?, NOM_ART =?, MARCA =?, OBSERVACION =?, MINIMO =?" + 
                "WHERE idSTOCK =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdAreas());
            pst.setInt(2, s.getCodigo());
            pst.setString(3, s.getNombreArticulo());
            pst.setString(4, s.getMarca());
            pst.setString(5, s.getObservacion());
            pst.setInt(6, s.getMinimo());
            pst.setInt(7, s.getIdStock());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
     }
     
     public String eliminiarStock(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM STOCK where idSTOCK = ? ";
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
