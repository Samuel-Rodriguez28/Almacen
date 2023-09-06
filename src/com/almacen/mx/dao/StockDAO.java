
package com.almacen.mx.dao;

import com.almacen.mx.entity.Stock;
import com.almacen.mx.view.aplicaciondepartamentomantenimiento.customUI.ModeloTabla;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argus
 */
public class StockDAO {
      private String mensaje = "";
     public String agregarStock (Connection con, Stock s)
     {
         PreparedStatement pst = null;
        String sql = "INSERT INTO STOCK (idSTOCK,idAREAS,PZAS, CODIGO, NOM_ART, MARCA, MINIMO, MEDIDA)" + 
                "VALUES (?,?,?,?,?,?,?,?)";
     try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdStock());
            pst.setInt(2, s.getIdAreas());
            pst.setInt(3, s.getPiezas());
            pst.setInt(4, s.getCodigo());
            pst.setString(5, s.getNombreArticulo());
            pst.setString(6, s.getMarca());
            pst.setInt(7, s.getMinimo());
            pst.setString(8, s.getMedida());
            
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
     
         return mensaje;
     }
     
     //ACTUALIZAR DATOS DEL STOCK
     public String modificarStock (Connection con, Stock s)
     {
     PreparedStatement pst =null;
        String sql = "UPDATE STOCK SET idAREAS =?, CODIGO =?, NOM_ART =?, MARCA =?, MINIMO =?, MEDIDA = ?" + 
                "WHERE idSTOCK =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdAreas());
            pst.setInt(2, s.getCodigo());
            pst.setString(3, s.getNombreArticulo());
            pst.setString(4, s.getMarca());
            pst.setInt(5, s.getMinimo());
            pst.setString(6, s.getMedida());
            pst.setInt(7, s.getIdStock());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
     }
     
     //ACTUALIZAR LA CANTIDAD DE CIERTO MATERIAL
     public String actualizarStock (Connection con, Stock s)
     {
         PreparedStatement pst = null;
         String query = "UPDATE STOCK SET PZAS = (PZAS + ?) WHERE IDSTOCK = ?" ;
         
         try {
             pst = con.prepareStatement(query);
             pst.setInt(1, s.getPiezas());
             pst.setInt(2, s.getIdStock());
             
             mensaje = "PRODUCTO AGREGADO CON EXITO";
             
             pst.execute();
             pst.close();
         } catch (Exception e) {
             mensaje = e.getMessage();
         }
         
         return mensaje;
     }
     
     public String eliminiarStock(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM STOCK where idSTOCK = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            
            mensaje = "elliminado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo eliminar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    //MÉTODOS PARA MOSTRAR REGISTROS
    public void listStockID(Connection con, JTable tablaSalida){
        String[] titulosSalida = {"NUMERO", "ARTICULO", "CANTIDAD", "MEDIDA", "CODIGO", "MARCA", "AREA"};
        Object[][] datosSalida = new Object[0][0];
        
        DefaultTableModel modeloTablaSalida = new ModeloTabla(datosSalida,titulosSalida, false); 
        tablaSalida.getTableHeader().setBackground(new Color(64,110,36));
        tablaSalida.getTableHeader().setFont(new Font("Corbel", 1, 1));
        
        String sql = "SELECT st.IDSTOCK, st.NOM_ART, st.PZAS as CANTIDAD, st.MEDIDA, st.CODIGO, st.MARCA, ar.NOMBRE as AREA " +
                     "FROM STOCK st " +
                     "JOIN AREAS ar ON st.IDAREAS = ar.IDAREAS " +
                     "ORDER BY st.idSTOCK;";
        
        String [] filas = new String[7];
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                
                modeloTablaSalida.addRow(filas);
            }
            
            tablaSalida.setModel(modeloTablaSalida);
            
            st.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar Stock\n" + e.getMessage());
        }
    }
    
    //MÉTODO PARA TOMAR EL ULTIMO VALOR REGISTRADO EN LA BD
    public int idMaxStock(Connection conn){
        int idMax = 0;
        
        String query = "SELECT MAX(IDSTOCK) FROM STOCK";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                idMax = Integer.parseInt(rs.getString(1)) + 1;
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encotro el máximo numero en Stock\n" + e.getMessage());
        }
        
        return idMax;
    }
    
    //MÉTODO PARA ENCONTRAR SI UN PRODUCTO CON UN CODIGO ESPECÍFICO ESTÁ REGISTRADO
    public boolean encontrarReg(Connection conn, String codigo){
        boolean found = false;
        
        String query = "SELECT IDSTOCK FROM STOCK WHERE CODIGO = " + codigo;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            String nombre = "";
            
            if(rs.next()){
                nombre = rs.getString("IDSTOCK");
                
            }
            
            
            if(!nombre.equals("")){
                found = true;
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error al encontrar el registro\n" + e.getMessage());
        }
        
        return found;
    }
    
    //MÉTODO PARA ENCONTRAR EL ID DE UN ELEMENTO DE UNA AREA
    public int findIdArea(Connection conn, String nombre){
        int idArea = 0;
        
        String query = "SELECT IDAREAS FROM AREAS WHERE NOMBRE = '" + nombre + "'";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                idArea = Integer.parseInt(rs.getString(1));
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encotro el Id del Area con ese nombre\n" + e.getMessage());
        }
        
        return idArea;
    }
    
    //MÉTODO PARA LLENAR EL COMBOBOX CON LAS AREAS REGISTRADAS
    public void fillAreas(Connection conn, JComboBox comIdCol){
        String enc = "SELECT NOMBRE FROM AREAS";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(enc);
            
            String nombre = "";
            
            while (rs.next()) {
                String item = rs.getString("NOMBRE");
                comIdCol.addItem(item);
            }
            
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON LISTAR LOS NOMBRES DE LAS AREAS\n" + e.getMessage());
        }
    }
    
    //MÉTODO PARA LLENAR EL COMBOBOX CON LAS REQUISICIONES EXISTENTES
    public void fillReq(Connection conn, JComboBox comIdCol){
        String enc = "SELECT NUM_REQ FROM REQUISICIONES ORDER BY NUM_REQ ASC";
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(enc);
            
            String nombre = "";
            
            while (rs.next()) {
                String item = rs.getString("NUM_REQ");
                comIdCol.addItem(item);
            }
            
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON LISTAR LOS NUMEROS DE REQUISICIONES\n" + e.getMessage());
        }
    }
    
    //MÉTODO PARA ENCONTRAR EL ID DE LA REQUISICION CON X NUMERO
    public int findIdReq(Connection conn, int num){
        int id = 0;
        
        String query = "SELECT IDREQUISICIONES FROM REQUISICIONES WHERE NUM_REQ = " + num;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                id = rs.getInt("IDREQUISICIONES");
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pido encontrar la requisicion con ese numero\n" + e.getMessage());
        }
        
        return id;
    }
    
    //MÉTODO PARA ENCONTRAR EL IDSTOCK DE UN PRODUCTO CON X CODIGO
    public int findIdStock(Connection conn, int codigo){
        int id = 0;
        
        String query = "SELECT IDSTOCK FROM STOCK WHERE CODIGO = " + codigo;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                id = rs.getInt("IDSTOCK");
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "METODO FIND IDSTOCK\nNo se pido encontrar el ID con ese codigo\n" + e.getMessage());
        }
        
        return id;
    }
    
    //MÉTODO PARA ENCONTRAR LA CANTIDAD DE PIEZAS DE UN PRODUCTO
    public int findPzStock(Connection conn, int id){
        int pzas = 0;
        
        String query = "SELECT PZAS FROM STOCK WHERE idSTOCK = " + id;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                pzas = rs.getInt("PZAS");
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "METODO FIND IDSTOCK\nNo se pido encontrar el ID con ese codigo\n" + e.getMessage());
        }
        
        return pzas;
    }
    
    
}
