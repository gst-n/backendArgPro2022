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
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imgUrl;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombre, String urlGithub, String descripcion, String imgUrl) {
        this.nombre = nombre;
        this.urlRepositorio = urlGithub;
        this.descripcion = descripcion;
        this.imgUrl = imgUrl;
        
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
