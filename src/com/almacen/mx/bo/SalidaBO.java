
package com.almacen.mx.bo;

import com.almacen.mx.dao.SalidaDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Salida;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author argus
 */
public class SalidaBO {
    
    private String mensaje= "";
        private SalidaDAO sadao = new SalidaDAO();
    public String agregarSalida( Salida Salida)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sadao.agregarSalida(conn, Salida);
          
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
    
    public String modificarSalida ( Salida Salida)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sadao.modificarSalida(conn, Salida);
          
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
    
    public String eliminiarSALIDA ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sadao.eliminiarSALIDA(conn, id);
          
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
    
    public void listarSalidaID (JTable tablaSalida)
    {
        Connection conn = Conexion.getConnection();
        
        sadao.listSalidaID(conn, tablaSalida);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
    }
}
