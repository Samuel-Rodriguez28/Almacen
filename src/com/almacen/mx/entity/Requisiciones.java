package com.almacen.mx.entity;

/**
 * @author SmithHDZ
 */
public class Requisiciones {
    private int idRequisiciones;
    private char jef;
    private char plan;
    private char sub;
    private char dir;
    private char com;
    private char rec;
    private String observ;
    private int fecha;
    
    public Requisiciones (){
    }
    
    public Requisiciones (int idRequisiciones,char jef, char plan, char sub, char dir, char com, char rec, String observ, int fecha){
     this.idRequisiciones = idRequisiciones;
     this.jef = jef;
     this.plan = plan;
     this.sub = sub;
     this.dir = dir;
     this.com = com;
     this.rec = rec;
     this.observ = observ;
     this.fecha = fecha;
    }

    public int getIdRequisiciones() {
        return idRequisiciones;
    }

    public void setIdRequisiciones(int idRequisiciones) {
        this.idRequisiciones = idRequisiciones;
    }

    
    
    public char getJef() {
        return jef;
    }

    public void setJef(char jef) {
        this.jef = jef;
    }

    public char getPlan() {
        return plan;
    }

    public void setPlan(char plan) {
        this.plan = plan;
    }

    public char getSub() {
        return sub;
    }

    public void setSub(char sub) {
        this.sub = sub;
    }

    public char getDir() {
        return dir;
    }

    public void setDir(char dir) {
        this.dir = dir;
    }

    public char getCom() {
        return com;
    }

    public void setCom(char com) {
        this.com = com;
    }

    public char getRec() {
        return rec;
    }

    public void setRec(char rec) {
        this.rec = rec;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Requisiciones " + 
                "idRequisiciones = " + idRequisiciones + "\n" + 
                "jef = " + jef +  "\n" + 
                "plan = " + plan +  "\n" +
                "sub = " + sub + "\n" + 
                "dir = " + dir + "\n" + 
                "com = " + com + "\n" + 
                "rec = " + rec + "\n" + 
                "observ = " + observ + "\n" + 
                "fecha = " + fecha ;
    }
    
    
    
}
