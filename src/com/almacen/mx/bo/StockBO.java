
package com.almacen.mx.bo;

import com.almacen.mx.dao.StockDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Stock;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JTable;

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
    
    //MÉTODO PARA ACTUALIZAR LAS EXISTENCIAS DE UN PRODUCTO
    public String actualizarStock ( Stock Stock)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.actualizarStock(conn, Stock);
          
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
    
    //MÉTODOS PARA LISTAR REGISTROS
    public void listarStockID (JTable tablaSalida)
    {
        Connection conn = Conexion.getConnection();
        
        sdao.listStockID(conn, tablaSalida);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
    }
    
    //MÉTODO PARA ENCONTRAR EL ULTIMNO REGISTRO DE STOCK
    public int idMaxStock(){
        Connection conn = Conexion.getConnection();
        
        int idMaxStock = sdao.idMaxStock(conn);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return idMaxStock;
    }
    
    //MÉTODO PARA ENCONTRAR SI UN PRODUCTO CON UN CODIGO ESPECÍFICO ESTÁ REGISTRADO
    public boolean encontrarRegistro(String codigo){
        Connection conn = Conexion.getConnection();
        
        boolean found = sdao.encontrarReg(conn, codigo);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return found;
    }
    
    //MÉTODO PARA ENCONTRAR EL ID DE UNA AREA ESPECÍFICA
    public int findIdArea(String nombre){
        Connection conn = Conexion.getConnection();
        
        int idArea = sdao.findIdArea(conn, nombre);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return idArea;
    }
    
    
    //MÉTODO PARA LLENAR EL COMBOBOX CON LAS AREAS REGISTRADAS
    public void fillAreas(JComboBox jcombo){
        Connection conn = Conexion.getConnection();
        
        sdao.fillAreas(conn, jcombo);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
    }
    
    //MÉTODO PARA LLENAR EL COMBOBOX CON LAS REQUISICIONES EXISTENTES
    public void fillReq(JComboBox jcombo){
        Connection conn = Conexion.getConnection();
        
        sdao.fillReq(conn, jcombo);
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
    }
    
    //MÉTODO PARA ENCONTRAR EL ID DE LA REQUISICION CON X NUMERO
    public int findIdReq(int numero){
        Connection conn = Conexion.getConnection();
        
        int id = sdao.findIdReq(conn, numero);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return id;
    }
    
    //MÉTODO PARA ENCONTRAR EL IDSTOCK DE UN PRODUCTO CON X CODIGO
    public int findIdStock(int codigo){
        Connection conn = Conexion.getConnection();
        
        int id = sdao.findIdStock(conn, codigo);
        
        try {
            conn.close();
        } catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
        
        return id;
    }
    
    
}
