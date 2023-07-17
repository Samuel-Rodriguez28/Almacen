
package com.almacen.mx.bo;

import com.almacen.mx.dao.DestinoDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Destino;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class DestinoBO {
    
    private String mensaje= "";
    private DestinoDAO ddao = new DestinoDAO();
    public String agregarDestino( Destino d)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ddao.agregarDestino(conn, d);
          
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
    
    public String modificarDestino ( Destino d)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ddao.modificarDestino(conn, d);
          
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
    
    public String eliminiarDestino ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ddao.eliminiarDestino(conn, id);
          
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
