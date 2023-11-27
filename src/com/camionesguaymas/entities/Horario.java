/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.camionesguaymas.entities;

/**
 *
 * @author Propietario
 */
public class Horario {
    
    private int id;
    private String camion_id;
    private String ruta_id;
    private String hora_salida;
    private String hora_llegada;
    private String fecha;
    private String latitud;
    private String longitud;

   
    

    public Horario(int id, String camion_id, String ruta_id, String hora_salida, String hora_llegada, String fecha, String latitud, String string6) {
        this.id = id;
        this.camion_id = camion_id;
        this.ruta_id = ruta_id;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    
  
    public Horario(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCamion_id() {
        return camion_id;
    }

    public void setCamion_id(String camion_id) {
        this.camion_id = camion_id;
    }

    public String getRuta_id() {
        return ruta_id;
    }

    public void setRuta_id(String ruta_id) {
        this.ruta_id = ruta_id;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}