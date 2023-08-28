
package com.almacen.mx.dao;

import com.almacen.mx.entity.Entrada;
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
public class EntradaDAO {
    
    private String mensaje = "";
    public String agregarEntrada (Connection con, Entrada ent)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO ENTRADA (idENTRADA, idSTOCK, idCIERRE_MATERIAL, UNIDADES, ESTADO, FECHA)" + 
                "VALUES (?, ?, ?,?,?, FORMAT(SYSDATETIME(), 'MM-dd-yyyy'))";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getIdEntrada());
            pst.setInt(2, ent.getIdStock());
            pst.setInt(3, ent.getIdCierre_Material());
            pst.setInt(4, ent.getUnidades());
            pst.setString(5, ent.getEstado());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
   
    public String modificarEntrada (Connection con, Entrada ent)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE ENTRADA SET IDCIERRE_MATERIAL = ?, IDSTOCK = ? UNIDADES =?, ESTADO =?,FECHA = FORMAT(SYSDATETIME(), 'MM-dd-yyyy') " + 
                "WHERE idENTRADA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getIdCierre_Material());
            pst.setInt(2, ent.getIdStock());
            pst.setInt(3, ent.getUnidades());
            pst.setString(4, ent.getEstado());
            pst.setInt(5, ent.getIdEntrada());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarENTRDA(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM ENTRADA where idENTRADA = ? ";
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
    public void listEntradaID(Connection con, JTable tablaSalida){
        String[] titulosSalida = {"NUMERO", "ORDEN COMPRA", "ARTICULO", "CODIGO", "UNIDADES", "ESTADO", "FECHA"};
        Object[][] datosSalida = new Object[0][0];
        
        DefaultTableModel modeloTablaSalida = new ModeloTabla(datosSalida,titulosSalida, false); 
        tablaSalida.getTableHeader().setBackground(new Color(64,110,36));
        tablaSalida.getTableHeader().setFont(new Font("Corbel", 1, 1));
        
        String sql = "SELECT en.idENTRADA, ci.OC, st.NOM_ART AS ARTICULO, st.CODIGO, en.UNIDADES, en.ESTADO, FORMAT(en.FECHA, 'dd-MM-yyyy') as FECHA " +
                     "FROM ENTRADA en " +
                     "JOIN CIERRE_MATERIAL ci ON en.idCIERRE_MATERIAL = ci.idCIERRE_MATERIAL " +
                     "JOIN STOCK st ON en.idSTOCK = st.idSTOCK " +
                     "ORDER BY en.idENTRADA;";
        
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
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //MÉTODO PARA ENCONTRAR EL ULTIMO REGISTRO EN LA TABLA
    public int idMaxEntrada(Connection conn){
        int idMax = 0;
        
        String query = "SELECT MAX(IDENTRADA) FROM ENTRADA";
        
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
}
