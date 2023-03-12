
package com.almacen.mx.entity;

/**
 * @author SmithHDZ
 */
public class Entrada {
    
    private int idEntrada;
    private int idStock;
    private int unidades;
    private String nombreArticulo;
    private String estado;
    private int fecha;

    public Entrada() {
    }

    public Entrada(int idEntrada, int idStock, int unidades, String nombreArticulo, String estado, int fecha) {
        this.idEntrada = idEntrada;
        this.idStock = idStock;
        this.unidades = unidades;
        this.nombreArticulo = nombreArticulo;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
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

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Entrada" +
                "idEntrada; " + idEntrada + "\n"
                + " idStock; " + idStock + "\n"
                + " Unidades; " + unidades + "\n"
                + " Nombre Articulo; " + nombreArticulo + "\n"
                + " Estado; " + estado + "\n"
                + " Fecha; " + fecha ;
    }
    
    
}
