
package com.almacen.mx.bo;

import com.almacen.mx.dao.StockDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Stock;
import java.sql.Connection;

/**
 *
 * @author argus
 */
public class StockBO {
    
    private String mensaje= "";
        private StockDAO sdao = new StockDAO();
    public String agregarStock( Stock Stock)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.agregarStock(conn, Stock);
          
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
    
    public String modificarStock ( Stock Stock)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.modificarStock(conn, Stock);
          
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
    
    public String eliminiarStock ( int id)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.eliminiarStock(conn, id);
          
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
