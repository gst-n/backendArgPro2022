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
public class dtoProyectos {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String urlRepositorio;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombre, String urlGithub) {
        this.nombre = nombre;
        this.urlRepositorio = urlGithub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlRepositorio() {
        return urlRepositorio;
    }

    public void setUrlRepositorio(String urlRepositorio) {
        this.urlRepositorio = urlRepositorio;
    }


    
}
