
package com.portfolio.WG.Service;

import com.portfolio.WG.Entity.Persona;
import com.portfolio.WG.Interface.IPersonaService;
import com.portfolio.WG.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePersona implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
    

    @Override
    public List<Persona> getPersona() {
        List<Persona> listPersona = ipersonaRepository.findAll();
        return listPersona;
    }

    @Override
    public void savePersona(Persona p) {
        ipersonaRepository.save(p);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
