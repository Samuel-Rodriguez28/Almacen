package com.almacen.mx.entity;
/**
 * @author SmithHDZ
 */
public class CiereMaterial {

    private int idCierrematerial;
    private int oc;
    private int numReq;
    private int numFac;
    private String proveedor;
    private String fechaSolicitud;
    private String fechaEntrada;
    private String nombreArticulo;
    private String observacion;

    
    public CiereMaterial() {
    }

    public CiereMaterial(int idCierrematerial, int oc, int numReq, int numFac, String proveedor, 
                        String fechaSolicitud, String fechaEntrada, String nombreArticulo, String observacion) {
        this.idCierrematerial = idCierrematerial;
        this.oc = oc;
        this.numReq = numReq;
        this.numFac = numFac;
        this.proveedor = proveedor;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrada = fechaEntrada;
        this.nombreArticulo = nombreArticulo;
        this.observacion = observacion;
    }

    public int getIdCierrematerial() {
        return idCierrematerial;
    }

    public void setIdCierrematerial(int idCierrematerial) {
        this.idCierrematerial = idCierrematerial;
    }

    public int getOc() {
        return oc;
    }

    public void setOc(int oc) {
        this.oc = oc;
    }

    public int getNumReq() {
        return numReq;
    }

    public void setNumReq(int numReq) {
        this.numReq = numReq;
    }

    public int getNumFac() {
        return numFac;
    }

    public void setNumFac(int numFac) {
        this.numFac = numFac;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "CiereMaterial"
                + "id Cierrematerial; " + idCierrematerial + "\n"
                + " oc; " + oc + "\n"
                + " Numero de Reqistro; " + numReq + "\n"
                + " Numero de Factor; " + numFac + "\n"
                + " proveedor; " + proveedor + "\n"
                + " Fecha Solicitud; " + fechaSolicitud + "\n"
                + " Fecha Entrada; " + fechaEntrada + "\n"
                + " Nombre Articulo; " + nombreArticulo + "\n"
                + " Observacion; " + observacion ;
    }
    
    
    
    
}
