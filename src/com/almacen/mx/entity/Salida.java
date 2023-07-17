
package com.almacen.mx.entity;

/**
 * @author SmithHDZ
 */
public class Salida {

    private int idSalida;
    private int idDestino;
    private int idStock;
    private int piezas;
    private String personal;
    private String destino;
    private String observacion;
    private int fecha;

    public Salida() {
    }

    public Salida(int idSalida,int idDestino, int idStock, 
                  int piezas, String personal, String destino, 
                  String observacion, int fecha) {
        this.idSalida = idSalida;
        this.idStock = idStock;
        this.piezas = piezas;
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

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
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
                + " idDestino; " + idDestino + "\n"
                + " idStock; " + idStock + "\n"
                + " Piezas; " + piezas + "\n"
                + " Personal; " + personal + "\n"
                + " Destino; " + destino + "\n"
                + " Observacion; " + observacion + "\n"
                + " Fecha; " + fecha ;
    }
    
    
    
}
