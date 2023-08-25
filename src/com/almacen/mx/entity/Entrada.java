
package com.almacen.mx.entity;

/**
 * @author SmithHDZ
 */
public class Entrada {
    
    private int idEntrada;
    private int idStock;
    private int idCierre_Material;

    public void setIdCierre_Material(int idCierre_Material) {
        this.idCierre_Material = idCierre_Material;
    }

    public int getIdCierre_Material() {
        return idCierre_Material;
    }
    private int unidades;
    private String estado;
    private String fecha;

    public Entrada() {
    }

    public Entrada(int idEntrada, int idStock, int idCierre_Material, int unidades, String estado, String fecha) {
        this.idEntrada = idEntrada;
        this.idStock = idStock;
        this.unidades = unidades;
        this.estado = estado;
        this.fecha = fecha;
        this.idCierre_Material = idCierre_Material;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
