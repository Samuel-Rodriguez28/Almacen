
package com.almacen.mx.entity;

/**
 *
 * @author SmithHDZ
 */
public class Destino {
    private int idDestino ;
    private String nombre;
    
    public Destino (){
    }
    
    public Destino (int idDestino, String nombre){
    this.idDestino =idDestino ;
    this.nombre=nombre;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Destino{" + "idDestino=" + idDestino + ", nombre=" + nombre + '}';
    }
    
    
}
