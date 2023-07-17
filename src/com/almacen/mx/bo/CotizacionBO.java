
package com.almacen.mx.bo;

import com.almacen.mx.dao.CotizacionDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Cotizacion;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class CotizacionBO {
    
    private String mensaje= "";
    private CotizacionDAO cdao = new CotizacionDAO();
    public String agregarCotizacion( Cotizacion c)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.agregarCotizacion(conn, c);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarCotizacion ( Cotizacion c)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.modificarCotizacion(conn, c);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminiarCotizacion ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.eliminiarCotizacion(conn, id);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
        
        
    }
}
