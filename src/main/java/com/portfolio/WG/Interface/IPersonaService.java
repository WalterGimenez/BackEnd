
package com.portfolio.WG.Interface;

import com.portfolio.WG.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona p);
    
    public void deletePersona(Long id);
            
    public Persona findPersona(Long id);
}
