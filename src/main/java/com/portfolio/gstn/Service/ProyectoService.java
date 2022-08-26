/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Service;

import com.portfolio.gstn.Entity.Proyectos;
import com.portfolio.gstn.Repository.ProyectoRepository;
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
public class ProyectoService {
    @Autowired
    ProyectoRepository proyectoRepository;
    
        public List<Proyectos> list(){
        return proyectoRepository.findAll();
    }
        
        
        public Optional<Proyectos> getOne(int id){
        return proyectoRepository.findById(id);
    }
    
    public Optional<Proyectos> getByNombre(String nombre){
        return proyectoRepository.findByNombre(nombre);
    }
    
    public void save(Proyectos proy){
        proyectoRepository.save(proy);
    }
    
    public void delete(int id){
        proyectoRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return proyectoRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return proyectoRepository.existsByNombre(nombre);
    }
    
}
