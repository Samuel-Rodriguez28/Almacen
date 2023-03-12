
package com.almacen.mx.entity;

/**
 * @author Samuel
 */
public class Stock {
    private int idStock;
    private int unidades;
    private int codigo;
    private String nombreArticulo;
    private String marca;
    private String observacion;
    private int minimo;
    private String medida;

    public Stock() {
    }

    public Stock(int idSTOCK, int unidades, int codigo, String nombreArticulo, String marca, String observacion, int minimo, String medida) {
        this.idStock = idSTOCK;
        this.unidades = unidades;
        this.codigo = codigo;
        this.nombreArticulo = nombreArticulo;
        this.marca = marca;
        this.observacion = observacion;
        this.minimo = minimo;
        this.medida = medida;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Stock "  
                        + " id STOCK; " + idStock + "\n"
                        + " Unidades; " + unidades + "\n"
                        + " Codigo; " + codigo + "\n"
                        + " Nombre de Articulo; " + nombreArticulo + "\n"
                        + " Marca; " + marca + "\n"
                        + " Observacion; " + observacion + "\n"
                        + " Minimo; " + minimo + "\n"
                        + " Medida; " + medida ;
    }
    
    
    
}
