
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
     
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String tit1;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String tit2;
    //@NotNull
    //@Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres") 
    //private String image;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String aboutMe;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String aboutMe2;
    
    
}
