
package com.portfolio.WG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    @Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres")
    private String name;
    
    @NotNull
    @Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres")
    private String lastName;
     
    @NotNull
    @Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres") 
    private String image;
    
    //por ahora le digo nulo
    private String aboutMe; 
    
    
}
