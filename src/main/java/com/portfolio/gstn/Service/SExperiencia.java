/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Service;

import com.portfolio.gstn.Entity.ExperienciaLaboral;
import com.portfolio.gstn.Repository.RepExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RepExperiencia rExperiencia;
    
    public List<ExperienciaLaboral> list(){
        return rExperiencia.findAll();
    }
    
    
    public Optional<ExperienciaLaboral> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<ExperienciaLaboral> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(ExperienciaLaboral expe){
        rExperiencia.save(expe);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
    
}
