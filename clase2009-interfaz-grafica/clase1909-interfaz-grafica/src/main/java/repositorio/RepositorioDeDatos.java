/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import modelo.persona.duenio.Duenio;
import modelo.mascota.Mascota;
import util.coleccion.ArrayLidtDuenio;
import util.coleccion.ArrayListDeMascota;

/**
 *
 * @author Alumno
 */
public abstract class RepositorioDeDatos {
    
    private static final int CANTIDAD_MASCOTAS=10;
    public static int indice=0;
    public static Mascota[] mascotas= new Mascota[CANTIDAD_MASCOTAS];
    
    public static ArrayListDeMascota<Mascota> mascotasArray= new ArrayListDeMascota<Mascota>();
    
    public static ArrayLidtDuenio<Duenio> duenios= new ArrayLidtDuenio<Duenio>(); 
    
}
