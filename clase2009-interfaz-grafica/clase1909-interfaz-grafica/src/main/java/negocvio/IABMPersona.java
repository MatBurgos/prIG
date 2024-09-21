/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocvio;

import modelo.persona.duenio.Duenio;
import modelo.mascota.Mascota;
import modelo.persona.Persona;

/**
 *
 * @author Alumno
 */
public interface IABMPersona {
    
    public void altaPersona(String nombre,String apellidpo,int dni);
    
    public void altaPersona(Persona persona);
      
    public void listarPersonas(int dni);
}
