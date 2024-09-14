/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import modelo.mascota.Mascota;
import util.coleccion.ArrayListDeMascota;

/**
 *
 * @author Alumno
 */
public abstract class RepositorioDeDatos {
    
    private static final int CANTIDAD_MASCOTAS=10;
    public static int indice=0;
    public static Mascota[] mascotas= new Mascota[CANTIDAD_MASCOTAS];
    
    public static ArrayList<Mascota> mascotasArray= new ArrayListDeMascota();
    
    
    
}
