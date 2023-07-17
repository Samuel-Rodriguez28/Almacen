
package com.almacen.mx.bo;

import com.almacen.mx.dao.CierreMaterialDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.CiereMaterial;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class CierredeMaterialBO {
   
    private String mensaje= "";
    private CierreMaterialDAO cidao = new CierreMaterialDAO();
    public String agregarCiereMaterial( CiereMaterial ci)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cidao.agregarCiereMaterial(conn, ci);
          
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
    
    public String modificarCiereMaterial ( CiereMaterial ci)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cidao.modificarCiereMaterial(conn, ci);
          
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
    
    public String eliminiarCiereMaterial ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cidao.eliminiarCiereMaterial(conn, id);
          
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
    

