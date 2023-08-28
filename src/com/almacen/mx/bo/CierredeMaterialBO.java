
package com.almacen.mx.bo;

import com.almacen.mx.dao.CierreMaterialDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.CiereMaterial;
import java.sql.Connection;
import javax.swing.JTable;

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
    
    /*public String modificarCiereMaterial ( CiereMaterial ci)
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
    }*/
    
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
    
    //MÉTODO PARA LISTAR LOS REGISTROS DE CIERRE MATERIAL
    public void listarCierreID (JTable tablaSalida)
    {
        Connection conn = Conexion.getConnection();
        
        cidao.listCierreID(conn, tablaSalida);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
    }
    
    //MÉTODO PARA ENCONTRAR EL ULTIMO REGISTRO EN LA TABLA
    public int idMaxCierre(){
        Connection conn = Conexion.getConnection();
        
        int idMaxEntrada = cidao.idMaxCierre(conn);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return idMaxEntrada;
    }
    
    //METODO PARA COMPROBAR SI UN REGISTRO CON UNA ORDEN DE COMPRA YA EXISTE EN LA BD
    public boolean encontrarRegCi(String oc){
        Connection conn = Conexion.getConnection();
        
        boolean found = cidao.encontrarRegCi(conn, oc);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return found;
    }
    
    //MÉTODO PARA ENCONTRAR EL ID DE UN REGISTRO CON X OC EN LA BD
    public int findIdCierre(String oc){
        Connection conn = Conexion.getConnection();
        
        int idArea = cidao.findIdCierre(conn, oc);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return idArea;
    }
}
    

