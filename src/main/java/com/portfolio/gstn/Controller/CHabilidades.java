/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Controller;

import com.portfolio.gstn.Dto.dtoHabilidades;
import com.portfolio.gstn.Entity.Habilidades;
import com.portfolio.gstn.Security.Controller.Mensaje;
import com.portfolio.gstn.Service.HabilidadService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidades {
    @Autowired
    HabilidadService habilidadService;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Habilidades>> list(){
        List<Habilidades> list = habilidadService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id){
        if(!habilidadService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Habilidades habilidades = habilidadService.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHabilidades dtohab){
        if(StringUtils.isBlank(dtohab.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(habilidadService.existsByNombreH(dtohab.getNombre()))
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
       
        Habilidades habilidades = new Habilidades(dtohab.getNombre(),dtohab.getTipo(), dtohab.getPorcentajeH());
        habilidadService.save(habilidades);
        
        System.out.println(dtohab.getPorcentajeH());
        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!habilidadService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        habilidadService.delete(id);
        return new ResponseEntity (new Mensaje("Habilidad eliminada"),HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidades dtohab){
        //Validamos si existe el ID
        if(!habilidadService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de habilidades
        if(habilidadService.existsByNombreH(dtohab.getNombre()) && habilidadService.getByNombreH(dtohab.getNombre()).get().getId() != id )
            return new ResponseEntity(new Mensaje("Esa Habilidad ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtohab.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Habilidades habilidades = habilidadService.getOne(id).get();
        habilidades.setNombre(dtohab.getNombre());
        habilidades.setTipo((dtohab.getTipo()));
        
        habilidadService.save(habilidades);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
    }
}
