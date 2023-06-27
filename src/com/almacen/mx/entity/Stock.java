
package com.almacen.mx.entity;

/**
 * @author SmithHDZ
 */
public class Stock {
    private int idStock;
    private int idAreas;
    private int piezas;
    private int codigo;
    private String nombreArticulo;
    private String marca;
    private String observacion;
    private int minimo;
    

    public Stock() {
    }

    public Stock(int idStock, int idAreas,int piezas, int codigo, 
                 String nombreArticulo, String marca, String observacion, int minimo) {
        
        this.idStock = idStock;
        this.idAreas = idAreas;
        this.piezas = piezas;
        this.codigo = codigo;
        this.nombreArticulo = nombreArticulo;
        this.marca = marca;
        this.observacion = observacion;
        this.minimo = minimo;
        
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public int getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(int idAreas) {
        this.idAreas = idAreas;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    
    
    @Override
    public String toString() {
        return "Stock "  
                        + " id STOCK; " + idStock + "\n"
                        + " id Areas; " + idAreas + "\n"
                        + " Piezas; " + piezas + "\n"
                        + " Codigo; " + codigo + "\n"
                        + " Nombre de Articulo; " + nombreArticulo + "\n"
                        + " Marca; " + marca + "\n"
                        + " Minimo; " + minimo + "\n" ;
                   
    }
    
    
    
}
