
package com.almacen.mx.dao;

import java.sql.Connection;
import com.almacen.mx.entity.Entrada;
import com.almacen.mx.entity.Salida;
import com.almacen.mx.entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StockDAO {
    
        private String mensaje = "";
     public String Stock (Connection con, Stock s)
     {
         PreparedStatement pst =null;
        String sql = "INSERT INTO STOCK (idSTOCK, UNIDADES, CODIGO, NOM_ART, MARCA, OBSERVACION, MINIMO, MEDIDA)" + 
                "VALUES (?,?,?,?,?,?,?,?)";
     try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getIdStock());
            pst.setInt(2, s.getUnidades());
            pst.setInt(3, s.getCodigo());
            pst.setString(4, s.getNombreArticulo());
            pst.setString(5, s.getMarca());
            pst.setString(6, s.getObservacion());
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
     
     public String mStock (Connection con, Stock s)
     {
     PreparedStatement pst =null;
        String sql = "UPDATE STOCK SET UNIDADES =?, CODIGO =?, NOM_ART =?, MARCA =?, OBSERVACION =?, MINIMO =?, MEDIDA =?" + 
                "WHERE idSTOCK =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getUnidades());
            pst.setInt(2, s.getCodigo());
            pst.setString(3, s.getNombreArticulo());
            pst.setString(4, s.getMarca());
            pst.setString(5, s.getObservacion());
            pst.setInt(6, s.getMinimo());
            pst.setString(7, s.getMedida());
            pst.setInt(8, s.getIdStock());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
     }
     
    public String agregarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO SALIDA (idSALIDA, idSTOCK, PZAS, CODIGO, NOMBRE, PERSONAL, DESTINO, OBSERV, FECHA)" + 
                "VALUES (?, ?, ?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getIdSalida());
            pst.setInt(2, sal.getIdStock());
            pst.setInt(3, sal.getPiezas());
            pst.setInt(4, sal.getCodigo());
            pst.setString(5, sal.getNombre());
            pst.setString(6, sal.getPersonal());
            pst.setString(7, sal.getDestino());
            pst.setString(8, sal.getObservacion());
            pst.setInt(9, sal.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String agregarEntrada (Connection con, Entrada ent)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO ENTRADA (idENTRADA, idSTOCK, UNIDADES, NOM_ART, ESTADO, FECHA)" + 
                "VALUES (?, ?, ?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getIdEntrada());
            pst.setInt(2, ent.getIdStock());
            pst.setInt(3, ent.getUnidades());
            pst.setString(4, ent.getNombreArticulo());
            pst.setString(5, ent.getEstado());
            pst.setInt(6, ent.getFecha());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    public String modificarSalida (Connection con, Salida sal)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE SALIDA SET PZAS =?, CODIGO =?, NOMBRE =?, PERSONAL =? , DESTINO =?, OBSERV =?, FECHA =?)" + 
                "WHERE idSALIDA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, sal.getPiezas());
            pst.setInt(2, sal.getCodigo());
            pst.setString(3, sal.getNombre());
            pst.setString(4, sal.getPersonal());
            pst.setString(5, sal.getDestino());
            pst.setString(6, sal.getObservacion());
            pst.setInt(7, sal.getFecha());
            pst.setInt(8, sal.getIdSalida());
            mensaje = "ACTUALIZADO correctamente";
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
        String sql = "UPDATE ENTRADA SET UNIDADES =?, NOM_ART =?,ESTADO =?,FECHA =?)" + 
                "WHERE idENTRADA =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ent.getUnidades());
            pst.setString(2, ent.getNombreArticulo());
            pst.setString(3, ent.getEstado());
            pst.setInt(4, ent.getFecha());
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
    
    public void listaStock(Connection con, JTable tabla)
    {
    DefaultTableModel model; 
        String [] columnas = {"idSTOCK", "UNIDADES"," CODIGO"," NOM_ART"," MARCA"," OBSERVACION"," MINIMO"," MEDIDA"};
        model = new DefaultTableModel(null,columnas);
        String sql = "SELECT * FROM STOCK ORDER BY idSTOCK";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i +1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "no se puede listar la tabla ");
        }
    
    
    }
    
    public void listarEntradas(Connection con, JTable tabla)
    {
        DefaultTableModel model; 
        String [] columnas = {"NUMERO","PIEZAS","CODIGO","NOMBRE","ESTADO","PREOVEEDOR","FECHA"};
        model = new DefaultTableModel(null,columnas);
        String sql = "SELECT * FROM ENTRADA ORDER BY idENTRADA";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i +1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "no se puede listar la tabla ");
        }
    }
    
    public void listarSalidas(Connection con, JTable tabla)
    {
        DefaultTableModel model; 
        String [] columnas = {"NUMERO","PIEZAS","CODIGO","NOMBRE","PERSONAL","LUGAR","ESTADO","FECHA"};
        model = new DefaultTableModel(null,columnas);
        String sql = "SELECT * FROM SALIDA ORDER BY idSALIDA";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i +1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "no se puede listar la tabla ");
        }
    }
}
