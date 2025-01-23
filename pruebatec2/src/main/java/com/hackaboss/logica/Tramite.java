
package com.hackaboss.logica;


public class Tramite {
    
    private Long idTramite;
    private String nombreTramite;
    private String descripcionTramite;

    public Tramite() {
    }

    public Tramite(String nombreTramite, String descripcionTramite) {
        this.nombreTramite = nombreTramite;
        this.descripcionTramite = descripcionTramite;
    }

    

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public String getDescripcionTramite() {
        return descripcionTramite;
    }

    public void setDescripcionTramite(String descripcionTramite) {
        this.descripcionTramite = descripcionTramite;
    }

    @Override
    public String toString() {
        return "Tramite{" + "idTramite=" + idTramite + ", nombreTramite=" + nombreTramite + ", descripcionTramite=" + descripcionTramite + '}';
    }
    
    
    
}
