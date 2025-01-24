
package com.hackaboss.persistencia;

import com.hackaboss.logica.Ciudadano;
import com.hackaboss.logica.Usuario;
import com.hackaboss.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    CiudadanoJpaController ciudadaJpa = new CiudadanoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    public void crearCiudadano(Ciudadano ciudada) {
       // se llama al jpa controler
       ciudadaJpa.create(ciudada);
    }

    public List<Ciudadano> traerCiudadanos() {
        
       return (List<Ciudadano>) ciudadaJpa.findCiudadanoEntities();
        
    }
    //borrado fisico
    public void eliminarCiudadano(Long id) {
        try {
            ciudadaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Ciudadano traerCiudadano(Long id) {
        return ciudadaJpa.findCiudadano(id);
    }

    public void editarCiudadano(Ciudadano ciudada) {
        try {
            ciudadaJpa.edit(ciudada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
}
