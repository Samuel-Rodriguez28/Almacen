package com.almacen.mx.entity;
/**
 * @author SmithHDZ
 */
public class CiereMaterial {

    private int idCierrematerial;
    private int idRequisicion;
    private int oc;
    private int numFac;
    private String fechaSolicitud;
    private String fechaEntrada;
    private String observacion;
    private String nombre;

    
    public CiereMaterial() {
    }

    public CiereMaterial(int idCierrematerial, int oc, int numFac, 
                        String fechaSolicitud, String fechaEntrada, String observacion, int idRequisicion, String nombre) {
        this.idCierrematerial = idCierrematerial;
        this.oc = oc;
        this.numFac = numFac;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrada = fechaEntrada;
        this.observacion = observacion;
        this.idRequisicion = idRequisicion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getIdCierrematerial() {
        return idCierrematerial;
    }

    public void setIdCierrematerial(int idCierrematerial) {
        this.idCierrematerial = idCierrematerial;
    }

    public int getIdRequisicion() {
        return idRequisicion;
    }

    public void setIdRequisicion(int idRequisicion) {
        this.idRequisicion = idRequisicion;
    }

    
    
    public int getOc() {
        return oc;
    }

    public void setOc(int oc) {
        this.oc = oc;
    }

    public int getNumFac() {
        return numFac;
    }

    public void setNumFac(int numFac) {
        this.numFac = numFac;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
    
    
}
