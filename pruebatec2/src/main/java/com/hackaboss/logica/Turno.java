
package com.hackaboss.logica;

import java.time.LocalDate;


public class Turno {
    
    private Long idTurno;
    private LocalDate fecha;
    private String estado;

    public Turno() {
    }

    public Turno(LocalDate fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

   

    public Long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Long idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", fecha=" + fecha + ", estado=" + estado + '}';
    }
    
    
    
    
}
