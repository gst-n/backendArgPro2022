/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gstn.Repository;

import com.portfolio.gstn.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gasto
 */

@Repository
public interface ProyectoRepository extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
