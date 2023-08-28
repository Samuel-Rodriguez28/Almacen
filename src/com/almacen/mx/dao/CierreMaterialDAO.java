
package com.almacen.mx.dao;

import com.almacen.mx.entity.CiereMaterial;
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
 * @author aargus
 */
public class CierreMaterialDAO {
    
    private String mensaje = "";
    public String agregarCiereMaterial(Connection con, CiereMaterial c)
    {
        PreparedStatement pst =null;
        String sql = "INSERT INTO Cierre_Material (idCierre_material, idRequisiciones, oc, num_Fac, fec_sol,fec_ent, nombre, observ)" + 
                "VALUES (?, ?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getIdCierrematerial());
            pst.setInt(2, c.getIdRequisicion());
            pst.setInt(3, c.getOc());
            pst.setInt(4, c.getNumFac());
            pst.setString(5, c.getFechaSolicitud());
            pst.setString(6, c.getFechaEntrada());
            pst.setString(7, c.getNombre());
            pst.setString(8, c.getObservacion());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }
    
    /*public String modificarCiereMaterial(Connection con, CiereMaterial c)
    {
        PreparedStatement pst =null;
        String sql = "UPDATE Ciere_Material SET  oc=?, num_Req=?, num_Fac=?,fec_sol=?,fgec_ent=?,nombre=?,observ=?)" + 
                "WHERE idCierre_material =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getOc());
            pst.setInt(2,c.getNumReq());
            pst.setInt(3, c.getNumFac());
            pst.setString(4, c.getFechaSolicitud());
            pst.setString(5, c.getFechaEntrada());
            pst.setString(6, c.getNombreArticulo());
            pst.setString(7, c.getObservacion());
             pst.setInt(8, c.getIdCierrematerial());
            mensaje = "ACTUALIZADO correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "no se pudo guardar correctamente \n " + e.getMessage();
        }
        return mensaje;
    }*/
    
     public String eliminiarCiereMaterial(Connection con , int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM CiereMaterial where idCierre_material = ? ";
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
    
    //MÉTODO PARA LISTAR LOS REGISTROS DE CIERRE DE MATERIAL
     public void listCierreID(Connection con, JTable tablaSalida){
        String[] titulosSalida = {"NUMERO", "REQUISICION", "ORDEN COMPRA", "FACTURA", "FECHA SOL", "FECHA ENT", "NOMBRE", "OBSERV"};
        Object[][] datosSalida = new Object[0][0];
        
        DefaultTableModel modeloTablaSalida = new ModeloTabla(datosSalida,titulosSalida, false); 
        tablaSalida.getTableHeader().setBackground(new Color(64,110,36));
        tablaSalida.getTableHeader().setFont(new Font("Corbel", 1, 1));
        
        String sql = "SELECT ci.idCIERRE_MATERIAL, req.NUM_REQ, ci.OC, ci.NUM_FAC, ci.FEC_SOL, ci.FEC_ENT, ci.NOMBRE, ci.OBSERV " +
                     "FROM CIERRE_MATERIAL ci " +
                     "JOIN REQUISICIONES req ON ci.idREQUISICIONES = req.idREQUISICIONES " +
                     "ORDER BY ci.idCIERRE_MATERIAL;";
        
        String [] filas = new String[8];
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                for (int i = 0; i < 8; i++) {
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
    public int idMaxCierre(Connection conn){
        int idMax = 0;
        
        String query = "SELECT MAX(IDCIERRE_MATERIAL) FROM CIERRE_MATERIAL";
        
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
    
    //METODO PARA COMPROBAR SI UN REGISTRO CON UNA ORDEN DE COMPRA YA EXISTE EN LA BD
    public boolean encontrarRegCi(Connection conn, String ordenCompra){
        boolean found = false;
        
        String query = "SELECT IDCIERRE_MATERIAL FROM CIERRE_MATERIAL WHERE OC = " + ordenCompra;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            String nombre = "";
            
            if(rs.next()){
                nombre = rs.getString("IDCIERRE_MATERIAL");
                
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
    
    //MÉTODO PARA ENCONTRAR EL ID DE UN REGISTRO CON X OC EN LA BD
    public int findIdCierre(Connection conn, String oc){
        int id = 0;
        
        String query = "SELECT IDCIERRE_MATERIAL FROM CIERRE_MATERIAL WHERE OC = " + oc;
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                id = rs.getInt("IDCIERRE_MATERIAL");
            }
            
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pido encontrar el ID con ese codigo\n" + e.getMessage());
        }
        
        return id;
    }
}
