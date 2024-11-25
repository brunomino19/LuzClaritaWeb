/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.luzclaritaweb.model.domain;

/**
 *
 * @author osval
 */
public class Contacto {

    private int id;
    private String nom_ape;
    private String correo;
    private String celular;
    private String mensaje;
    
    public Contacto() {
    }

    public Contacto(int id, String nom_ape, String correo, String celular, String mensaje) {

        this.id = id;
        this.nom_ape = nom_ape;
        this.correo = correo;
        this.celular = celular;
        this.mensaje = mensaje;

    }
    
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_ape() {
        return nom_ape;
    }

    public void setNom_ape(String nom_ape) {
        this.nom_ape = nom_ape;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
