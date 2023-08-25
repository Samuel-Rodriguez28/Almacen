
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        String sql = "INSERT INTO STOCK (idSTOCK,idAREAS,PIEZAS, CODIGO, NOM_ART, MARCA, MINIMO)" + 
                "VALUES (?,?,?,?,?,?,?)";
     try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdStock());
            pst.setInt(2, s.getIdAreas());
            pst.setInt(3, s.getCodigo());
            pst.setString(4, s.getNombreArticulo());
            pst.setString(5, s.getMarca());
            pst.setInt(6, s.getMinimo());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
     
         return mensaje;
     }
     
     public String modificarStock (Connection con, Stock s)
     {
     PreparedStatement pst =null;
        String sql = "UPDATE STOCK SET idAREAS =?, CODIGO =?, NOM_ART =?, MARCA =?, MINIMO =?" + 
                "WHERE idSTOCK =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdAreas());
            pst.setInt(2, s.getCodigo());
            pst.setString(3, s.getNombreArticulo());
            pst.setString(4, s.getMarca());
            pst.setInt(5, s.getMinimo());
            pst.setInt(6, s.getIdStock());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
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
}
