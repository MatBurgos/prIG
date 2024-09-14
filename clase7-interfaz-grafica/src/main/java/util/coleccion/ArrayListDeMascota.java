/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.coleccion;

import java.util.ArrayList;
import modelo.mascota.Gato;
import modelo.mascota.Mascota;
import modelo.mascota.Perro;

/**
 *
 * @author Alumno
 */
public class ArrayListDeMascota extends ArrayList<Mascota> {
    
   
    public boolean contains(Mascota o){
        boolean existe=false;
        for (Mascota m : this) {
            if(m instanceof Perro){
                Perro p=(Perro)m;
                Perro po=(Perro)o;
                if(p.getCodigoPerro().equals(po.generarCodigo()))
                     return true;
            }else if(m instanceof Gato){
                Gato g=(Gato)m;
                Gato go=(Gato)o;
                if(g.generarCodigo().equals(go.generarCodigo()))
                     return true;
            }                
        }

        return existe;
    }
    
}
