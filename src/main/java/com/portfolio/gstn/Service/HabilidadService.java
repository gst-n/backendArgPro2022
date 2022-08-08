/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Service;

import com.portfolio.gstn.Entity.Habilidades;
import com.portfolio.gstn.Repository.Rhabilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gasto
 */
@Service
@Transactional
public class HabilidadService {
    @Autowired
    Rhabilidades rHabilidades;
    
    public List<Habilidades> list(){
        return rHabilidades.findAll();
    }
    
    public Optional<Habilidades> getOne(int id){
        return rHabilidades.findById(id);
    }
    
    public Optional<Habilidades> getByNombreH(String nombreH){
        return rHabilidades.findByNombreH(nombreH);
    }
    
    public void save(Habilidades habilidad){
        rHabilidades.save(habilidad);
    }
    
    public void delete(int id){
        rHabilidades.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHabilidades.existsById(id);
    }
    
    public boolean existsByNombreH(String nombreH){
        return rHabilidades.existsByNombreH(nombreH);
    }
}
