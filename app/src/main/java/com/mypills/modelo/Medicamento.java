package com.mypills.modelo;

public class Medicamento {

    private String nombre;
    private String presentacion;
    private String unidadMedida;
    private String alias;
    private String dosis;
    private String intervalo;
    private String dias;
    private String fecha;
    private String hora;
    private String observaciones;

    public Medicamento() {
    }

    public Medicamento(String nombre, String presentacion, String unidadMedida, String alias, String dosis, String intervalo, String dias, String fecha, String hora, String observaciones) {
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.unidadMedida = unidadMedida;
        this.alias = alias;
        this.dosis = dosis;
        this.intervalo = intervalo;
        this.dias = dias;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", alias='" + alias + '\'' +
                ", dosis='" + dosis + '\'' +
                ", intervalo='" + intervalo + '\'' +
                ", dias='" + dias + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
