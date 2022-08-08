/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author gasto
 */
public class dtoHabilidades {
    @NotBlank
    private String nombre;
    @NotBlank
    private String tipo;
    @NotBlank
    private int porcentajeH;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String nombre, String tipo, int porcentaje) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentajeH = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(int porcentajeH) {
        this.porcentajeH = porcentajeH;
    }
    
        
    
    
}
