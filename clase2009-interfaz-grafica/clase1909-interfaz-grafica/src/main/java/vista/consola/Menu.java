/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.consola;

import java.util.Scanner;
import modelo.mascota.Perro;
import negocvio.abm.perro.ABMPerro;

/**
 *
 * @author Alumno
 */
public class Menu {
    
    static ABMPerro ambPerro= new ABMPerro();
    
    public static void main(String[] args){
        menuPrincipal();
    }
    
    private static void menuPrincipal(){
        
        System.out.println("========================== MENU ========================");
        
        System.out.println("1 Para Alta de Perro");
        System.out.println("2 Para Baja de Perro");
        System.out.println("3 Para Modificardatos de Perro");
        System.out.println("4 Listar Perros");
        System.out.println("5 Salir");
        
        Scanner scan= new Scanner(System.in);
        int opt=scan.nextInt();
        while(opt!=5){
            switch (opt) {
                case 1:

                    ambPerro.altaMascotaArray(cargarDatosPerro());
                    break;
                case 2:
                   bajaPerro();
                    break;
                case 3:
                    modificarDatosPerro();
                    break;
                case 4: 
                    // Codigo para el listado
                    break;
                default:
                    throw new AssertionError();
        }
            opt=scan.nextInt();
        }
        
    }
    
    private static Perro cargarDatosPerro(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese Nombre del Perro");
        String nombre = scan.nextLine();
        System.out.println("Ingrese M si es macho o H si es hembra");
        String sexo=scan.nextLine();
        System.out.println("Ingrese la edad del Perro");
        int edad=scan.nextInt();
        System.out.println("Ingrese el peso del Perro");
        float peso=scan.nextFloat();
        System.out.println("Ingrese la Raza del Perro");
        String raza=scan.nextLine();
        return  new Perro(raza, nombre, edad, peso, (sexo.equals("M"))?'M':'F');
    }
    
    private static void bajaPerro(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el còdigo de la mascota a eliminar");
        String codigo=scan.nextLine();
        ambPerro.bajaMascotaArray(codigo);
    }
    
    private static void modificarDatosPerro(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el còdigo de la mascota a eliminar");
        String codigo=scan.nextLine();
        Perro p= (Perro)ambPerro.buscarMascota(codigo);
        if(p!=null){
            System.out.println("Ingrese Nombre del Perro");
        String nombre = scan.nextLine();
        p.setNombre(nombre);
        System.out.println("Ingrese M si es macho o H si es hembra");
        String sexo=scan.nextLine();
        p.setSexo((sexo.equals("M"))?'M':'F');
        System.out.println("Ingrese la edad del Perro");
        int edad=scan.nextInt();
        p.setEdad(edad);
        System.out.println("Ingrese el peso del Perro");
        float peso=scan.nextFloat();
        p.setPeso(peso);
        System.out.println("Ingrese la Raza del Perro");
        String raza=scan.nextLine();
        p.setRaza(raza);
        ambPerro.modificacionMascotaArray(p);
        }else
            System.out.println("La mascota que se intenta modificar no existe");
    }
}
