/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocvio.abm.duenio;

import modelo.mascota.Mascota;
import negocvio.IABMPersona;

/**
 *
 * @author Alumno
 */
public interface IABMDuenio extends IABMPersona {
 
    public void asignarMacotaAduenio(int dni,Mascota mascota);
    
    public void listaTodasrMascotasPorDuenio();
    
    public void listarMascotasPorDuenio(int dni);
}
