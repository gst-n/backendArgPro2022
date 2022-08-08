/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gstn.Repository;

import com.portfolio.gstn.Entity.ExperienciaLaboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gasto
 */

@Repository
public interface RepExperiencia extends JpaRepository<ExperienciaLaboral, Integer> {
    public Optional<ExperienciaLaboral> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
