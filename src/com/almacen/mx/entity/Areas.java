
package com.almacen.mx.entity;

/**
 @author SmithHDZ
 */
public class Areas {
    private int idAreas;
    private String nombre;
    
    public Areas(){
    }
    
    public Areas (int idAreas,String nombre){
    this.idAreas = idAreas;
    this.nombre = nombre; 
    }

    public int getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(int idAreas) {
        this.idAreas = idAreas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Areas" + 
                "idAreas = " + idAreas + "\n" + 
                "nombre = " + nombre ;
    }
    
    
}
