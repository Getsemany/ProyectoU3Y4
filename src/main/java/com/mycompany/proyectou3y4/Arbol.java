/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectou3y4;

import java.util.ArrayList;

/**
 *
 * @author oswy
 */
public class Arbol {
    private Alumnos alumno;
    private Arbol nodoIzq;
    private Arbol nodoDer;

    public Arbol(Alumnos alumno, Arbol nodoIzq, Arbol nodoDer) {
        this.alumno = alumno;
        this.nodoIzq = nodoIzq;
        this.nodoDer = nodoDer;
    }
    public boolean agregar(Alumnos al){
        if(alumno==null){
            alumno=al;
            System.out.println(al.getNoControl());
            return true;
        }else{
            if(alumno.getNoControl().compareTo(al.getNoControl())>0){
                if(nodoIzq==null){
                    nodoIzq=new Arbol((al), null, null);
                    System.out.println("Izq");
                    return true;
                }else{
                    return nodoIzq.agregar(al);
                }
            }else if(alumno.getNoControl().compareTo(al.getNoControl())<0){
                if(nodoDer==null){
                    nodoDer=new Arbol((al), null, null);
                    System.out.println("Der");
                    return true;
                }else{
                    return nodoDer.agregar(al);
                }
            }else{
                return false;
            }
        }
    }
    public String ordenNoControl(){
        String cad="";
        if(alumno==null){
            return cad;
        }else{
            if(nodoIzq!=null){
                //cad+= "("+alumno.getNoControl()+")"+" "+alumno.getNombre()+" "+alumno.getApellidos()+"\n";
                cad+= nodoIzq.ordenNoControl();
            }
            cad+= "("+alumno.getNoControl()+")"+" "+alumno.getNombre()+" "+alumno.getApellidos()+"\n";
            if(nodoDer!=null){
                //cad+= "(d"+alumno.getNoControl()+")"+" "+alumno.getNombre()+" "+alumno.getApellidos()+"\n";
                cad+=nodoDer.ordenNoControl();
            }
            return cad;
        }
    }
    
}
