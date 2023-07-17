
package com.almacen.mx.bo;

import com.almacen.mx.dao.AreasDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Areas;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class AreasBO {
    
    private String mensaje= "";
    private AreasDAO adao = new AreasDAO();
    public String agregarArea( Areas a)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = adao.agregarArea(conn, a);
          
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
    
    public String modificarAreas ( Areas a)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = adao.modificarAreas(conn, a);
          
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
    
    public String eliminiarAreas ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = adao.eliminiarAreas(conn, id);
          
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
