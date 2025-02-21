
package com.hackaboss.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudadano implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String curp;

    public Ciudadano() {
    }

    public Ciudadano(String nombre, String apellido, String curp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", curp=" + curp + '}';
    }
    
    

    

    
    
  
    
    
}
