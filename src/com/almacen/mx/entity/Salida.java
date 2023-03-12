
package com.almacen.mx.entity;

/**
 * @author jaher
 */
public class Salida {

    private int idSalida;
    private int idStock;
    private int piezas;
    private int codigo;
    private String nombre;
    private String personal;
    private String destino;
    private String observacion;
    private int fecha;

    public Salida() {
    }

    public Salida(int idSalida, int idStock, int piezas, 
                  int codigo, String nombre, String personal, 
                  String destino, String observacion, int fecha) {
        this.idSalida = idSalida;
        this.idStock = idStock;
        this.piezas = piezas;
        this.codigo = codigo;
        this.nombre = nombre;
        this.personal = personal;
        this.destino = destino;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Salida" +
                  " idSalida; " + idSalida + "\n"
                + " idStock; " + idStock + "\n"
                + " Piezas; " + piezas + "\n"
                + " Codigo; " + codigo + "\n"
                + " Nombre; " + nombre + "\n"
                + " Personal; " + personal + "\n"
                + " Destino; " + destino + "\n"
                + " Observacion; " + observacion + "\n"
                + " Fecha; " + fecha ;
    }
    
    
    
}
