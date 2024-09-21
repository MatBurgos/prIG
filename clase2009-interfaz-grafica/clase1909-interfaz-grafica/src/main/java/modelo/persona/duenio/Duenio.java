/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persona.duenio;


import modelo.mascota.Mascota;
import modelo.persona.Persona;
import util.coleccion.ArrayListDeMascota;

/**
 *
 * @author Alumno
 */
public class Duenio extends Persona{
    
    private ArrayListDeMascota<Mascota>mascotas;
    
    public Duenio(){
        super();
        this.mascotas= new ArrayListDeMascota<Mascota>();
    }
    public Duenio(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.mascotas= new ArrayListDeMascota<Mascota>();
    }


    public ArrayListDeMascota<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayListDeMascota<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
   
    public String toString(){
        return "NOMBRE: "+this.getNombre()+ " APELLIDO: "+this.getApellido()+ " DNI: "+this.getDni();
    }
    
}
