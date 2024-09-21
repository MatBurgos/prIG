/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocvio.abm.duenio;

import modelo.persona.duenio.Duenio;
import modelo.mascota.Gato;
import modelo.mascota.Mascota;
import modelo.mascota.Perro;
import modelo.persona.Persona;
import repositorio.RepositorioDeDatos;


/**
 *
 * @author Alumno
 */
public class ABMDuenio implements IABMDuenio{

    @Override
    public void altaPersona(String nombre, String apellidpo, int dni) {
        Duenio d= new Duenio(nombre, apellidpo, dni);
        altaPersona(d);
    }

    @Override
    public void altaPersona(Persona persona) {
        Duenio duenio=(Duenio)persona;
        if(!validarDatosDuenio((Duenio)persona)){
            if(!RepositorioDeDatos.duenios.contains(duenio))
                RepositorioDeDatos.duenios.add(duenio);
            else
                System.out.println("El dueño ya existe"); 
        }
    }

    @Override
    public void listaTodasrMascotasPorDuenio() {
        System.out.println("====== LISTADO DE MASCOTAS POR DUEÑO ====================");
        for (Persona persona : RepositorioDeDatos.duenios) {
            Duenio duenio=(Duenio)persona;
            System.out.println(duenio.toString());
            System.out.println("============== LITA DE MASCOTA========================");
            for (Mascota mascota : duenio.getMascotas()) {
                if(mascota instanceof Perro){
                    Perro p=(Perro)mascota;
                    System.out.println(p.toString());
                }else{
                    Gato g=(Gato)mascota;
                    System.out.println(g.toString());
                }
            }
        }
        System.out.println("================== FIN LIATDO================================");
    }

    @Override
    public void asignarMacotaAduenio(int dni, Mascota mascota) {
        Duenio d= new Duenio();
        d.setDni(dni);
        Integer index=RepositorioDeDatos.duenios.indexOf(d);
        if(index!=-1){
         d=(Duenio)RepositorioDeDatos.duenios.get(index);
         if(!d.getMascotas().contains(mascota))
            d.getMascotas().add(mascota);
         else
                System.out.println("La mascota ya està asignada pal dueño");
        }
    }
    
    
    @Override
    public void listarMascotasPorDuenio(int dni) {
        System.out.println("====== LISTADO DE MASCOTAS POR DUEÑO ====================");
        for (Persona persona : RepositorioDeDatos.duenios) {
            Duenio duenio=(Duenio)persona;
            System.out.println(duenio.toString());
           if(duenio.getDni()==dni){
             System.out.println("============== LITA DE MASCOTA========================");
            for (Mascota mascota : duenio.getMascotas()) {
                if(mascota instanceof Perro){
                    Perro p=(Perro)mascota;
                    System.out.println(p.toString());
                }else{
                    Gato g=(Gato)mascota;
                    System.out.println(g.toString());
                }
            }
           }
        }
        System.out.println("================== FIN LIATDO================================");
    }

    @Override
    public void listarPersonas(int dni) {
        for (Persona persona : RepositorioDeDatos.duenios) {
            if(persona instanceof Duenio){
                Duenio d=(Duenio)persona;
                d.toString();
            }
        }
    }
    
    
    private boolean validarDatosDuenio(Duenio d){
        if(d.getNombre()==null ||d.getNombre().equals("")){
            System.out.println("Ingrese el Nombre del dueño");
            return true;
        }
        if(d.getApellido()==null || d.getApellido().equals("")){
            System.out.println("Ingrese el apellido del dueño");
            return true;
        }
        if(d.getDni()==0){
            System.out.println("Ingrese el dni del dueño");
            return true;
        }     
        return false;
    }
}
