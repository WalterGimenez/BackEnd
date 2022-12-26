
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
public class HardSoft { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @Size(min= 1, max = 100, message = "debe agregar entre 1 y 100 caracteres")
    private String name;
        
    private int perc;
    
    public HardSoft(){
        
    }

    public HardSoft(String name, int perc) {
        this.name = name;
        this.perc = perc;
    }
    
    
}
