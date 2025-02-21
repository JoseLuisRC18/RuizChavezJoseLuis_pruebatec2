
package com.hackaboss.logica;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Turno {
   
    private Long idTurno;
    private String fecha;
    private String estado;

    public Turno() {
    }

    public Turno(Long idTurno, String fecha, String estado) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Long idTurno) {
        this.idTurno = idTurno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    
   

    
    
    
}
