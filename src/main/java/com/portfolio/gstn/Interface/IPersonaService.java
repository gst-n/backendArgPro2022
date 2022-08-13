
package com.portfolio.gstn.Interface;

import com.portfolio.gstn.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //para traer una persona
    public List<Persona> getPersona();
    
    //guardar un obj de tipo persona
    
    public void savePersona(Persona persona);
    
    //delete usuario por id
    
    public void deletePerona(Long id);
    
    //buscar persona por id
    
    public Persona findPersona(Long id);    
}
