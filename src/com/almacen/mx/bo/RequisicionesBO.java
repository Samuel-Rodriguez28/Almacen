
package com.almacen.mx.bo;

import com.almacen.mx.dao.RequisicionesDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Requisiciones;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class RequisicionesBO {
    
    private String mensaje= "";
    private RequisicionesDAO redao = new RequisicionesDAO();
    public String agregarRequisiciones( Requisiciones rec)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = redao.agregarRequisiciones(conn, rec);
          
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
    
    public String modificarRequisiciones ( Requisiciones rec)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = redao.modificarRequisiciones(conn, rec);
          
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
    
    public String eliminarRequisiciones ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = redao.eliminarRequisiciones(conn, id);
          
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
