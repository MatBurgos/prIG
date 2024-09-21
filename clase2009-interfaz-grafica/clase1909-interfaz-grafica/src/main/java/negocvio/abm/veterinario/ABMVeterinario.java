/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocvio.abm.veterinario;

import modelo.persona.duenio.Duenio;
import modelo.persona.Persona;
import modelo.persona.veterinario.Veterinario;
import negocvio.IABMPersona;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class ABMVeterinario implements IABMPersona {

    @Override
    public void altaPersona(String nombre, String apellidpo, int dni) {
      Duenio d= new Duenio(nombre, apellidpo, dni);
        altaPersona(d);   
    }

    @Override
    public void altaPersona(Persona persona) {
        Veterinario veterinario=(Veterinario)persona;
        if(!validarDatosVeterinario((Veterinario)persona)){
            if(!RepositorioDeDatos.duenios.contains(veterinario))
                RepositorioDeDatos.duenios.add(veterinario);
            else
                System.out.println("El veterinario ya existe"); 
        }
    }

    @Override
    public void listarPersonas(int dni) {
       for (Persona persona : RepositorioDeDatos.duenios) {
            if(persona instanceof Veterinario){
                Veterinario v=(Veterinario)persona;
                v.toString();
            }
        }
    }
    
    private boolean validarDatosVeterinario(Veterinario v){
        if(v.getNombre()==null ||v.getNombre().equals("")){
            System.out.println("Ingrese el Nombre del veterinario");
            return true;
        }
        if(v.getApellido()==null || v.getApellido().equals("")){
            System.out.println("Ingrese el apellido del veterinario");
            return true;
        }
        if(v.getDni()==0){
            System.out.println("Ingrese el dni del veterinario");
            return true;
        }
        if(v.getMatricula()==null || v.getMatricula().equals("") ){
            System.out.println("Ingrese la matricula del veterinario");
            return true;
        }
        return false;
    }
}
