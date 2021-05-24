/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectou3y4;


/**
 *
 * @author oswy
 */
public class Alumnos implements Comparable<Alumnos>{
    private String noControl;
    private String nombre;
    private String apellidos;

    public Alumnos(String noControl,String apellidos,String nombre) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //Metodo para obtener la info de cada alumno
    @Override
    public String toString(){
    return "("+this.getNoControl()+")"+" "+this.getNombre()+" "+this.getApellidos();
}
    //metodo para comparar los alumnos y poder utilizar la priority queue
    @Override
    public int compareTo(Alumnos o) {
        String cad1=o.getApellidos()+" "+o.getNombre();
        String cad2=this.getApellidos()+" "+this.getNombre();
        return cad1.compareTo(cad2)*(-1);
    }

    
    
}
