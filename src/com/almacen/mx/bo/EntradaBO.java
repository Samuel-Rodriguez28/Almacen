
package com.almacen.mx.bo;

import com.almacen.mx.dao.EntradaDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Entrada;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author argus
 */
public class EntradaBO {
    
    private String mensaje= "";
    private EntradaDAO edao = new EntradaDAO();
    public String agregarEntrada( Entrada en)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarEntrada(conn, en);
          
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
    
    public String modificarEntrada ( Entrada en)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modificarEntrada(conn, en);
          
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
    
    public String eliminarENTRDA ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarENTRDA(conn, id);
          
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
    
    //MÉTODOS PARA LISTAR REGISTROS
    public void listarEntradaID (JTable tablaSalida)
    {
        Connection conn = Conexion.getConnection();
        
        edao.listEntradaID(conn, tablaSalida);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
    }
}
