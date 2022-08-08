/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Habilidades {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Id
    private int id;
    @NotNull
    private String nombreH;
    @NotNull
    private String tipoH;
    @NotNull
    private int porcentajeH;

    public Habilidades() {
    }

    public Habilidades(String nombreH, String tipoH, int porcentajeH) {
        this.nombreH = nombreH;
        this.tipoH = tipoH;
        this.porcentajeH = porcentajeH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreH;
    }

    public void setNombre(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getTipo() {
        return tipoH;
    }

    public void setTipo(String tipoH) {
        this.tipoH = tipoH;
    }

    public int getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(int porcentajeH) {
        this.porcentajeH = porcentajeH;
    }
    
    
    
    
}
