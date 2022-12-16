
package com.portfolio.WG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @Size(min= 1, max = 100, message = "debe agregar entre 1 y 100 caracteres")
    private String name;
    
    @Size(min= 1, max = 100, message = "debe agregar entre 1 y 100 caracteres")
    private String startend;
    
    @Size(min= 1, max = 255, message = "debe agregar entre 1 y 2555 caracteres")
    private String link;
    
    @Size(min= 1, max = 2555, message = "debe agregar entre 1 y 2555 caracteres")
    private String job;
    
    @Size(min= 1, max = 2555, message = "debe agregar entre 1 y 2555 caracteres")
    private String descrip;
    
    public Experience(){
        
    }

    public Experience(String name, String startend, String link, String job, String descrip) {
        this.name = name;
        this.startend = startend;
        this.link = link;
        this.job = job;
        this.descrip = descrip;
    }
    
    
}
