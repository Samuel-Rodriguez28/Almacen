package com.almacen.mx.entity;

/**¨
 * @author SmithHDZ
 */
public class Cotizacion {

    private int idCorizacion;
    private String articulo;
    private String um;
    private int cantidad;
    private int clave;
    private int ferr;
    private int elect;
    private int plom;

    public Cotizacion() {
    }

    public Cotizacion(int idCorizacion, String articulo, String um, int cantidad, int clave, int ferr, int elect, int plom) {
        this.idCorizacion = idCorizacion;
        this.articulo = articulo;
        this.um = um;
        this.cantidad = cantidad;
        this.clave = clave;
        this.ferr = ferr;
        this.elect = elect;
        this.plom = plom;
    }

    public int getIdCorizacion() {
        return idCorizacion;
    }

    public void setIdCorizacion(int idCorizacion) {
        this.idCorizacion = idCorizacion;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getFerr() {
        return ferr;
    }

    public void setFerr(int ferr) {
        this.ferr = ferr;
    }

    public int getElect() {
        return elect;
    }

    public void setElect(int elect) {
        this.elect = elect;
    }

    public int getPlom() {
        return plom;
    }

    public void setPlom(int plom) {
        this.plom = plom;
    }

    @Override
    public String toString() {
        return "Cotizacion" 
                + "idCorizacion; " + idCorizacion + "\n"
                + " Articulo; " + articulo + "\n"
                + " um; " + um + "\n"
                + " Cantidad; " + cantidad + "\n"
                + " Clave; " + clave + "\n"
                + " Ferr; " + ferr + "\n"
                + " Elect; " + elect + "\n"
                + " Plom; " + plom ;
    }
    
    
    
}
