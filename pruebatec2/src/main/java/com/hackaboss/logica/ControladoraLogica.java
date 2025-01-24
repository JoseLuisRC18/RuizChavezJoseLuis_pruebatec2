
package com.hackaboss.logica;

import com.hackaboss.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCiudadano(String nombre, String apellido, String curp) {
        Ciudadano ciudada = new Ciudadano( nombre, apellido, curp);
        controlPersis.crearCiudadano(ciudada);
    }

    public ArrayList<Ciudadano> buscarPorCurp(String busquedaCurp) {
        
       ArrayList<Ciudadano> ciudadanosCoincidentes = new ArrayList<>();
       List<Ciudadano> listaCiudadanos = controlPersis.traerCiudadanos();
       for(Ciudadano ciudada:listaCiudadanos){
       if(ciudada.getCurp().equals(busquedaCurp)){
           ciudadanosCoincidentes.add(ciudada);
       }
       }
       return ciudadanosCoincidentes;
    }

    public void eliminarCiudadano(Long id) {
         controlPersis.eliminarCiudadano(id);
    }

    public Ciudadano buscarCiudadano(Long id) {
         return controlPersis.traerCiudadano(id);
    }

    public void editarCiudadano(Ciudadano ciudada) {
        controlPersis.editarCiudadano(ciudada);
    }

    public boolean validarAcceso(String email, String password) {
       Usuario usu = controlPersis.buscarUsuario(email);
       return false;
    }

    

    
    
}
