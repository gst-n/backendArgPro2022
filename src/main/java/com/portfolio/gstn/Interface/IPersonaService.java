
package com.portfolio.gstn.Interface;

import com.portfolio.gstn.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();
    
    
    public void savePersona(Persona persona);
    
    
    public void deletePerona(Long id);
    
    
    public Persona findPersona(Long id);    
}
