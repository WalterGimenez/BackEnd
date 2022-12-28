
package com.portfolio.WG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @Size(min= 1, max = 2555, message = "debe agregar entre 1 y 2555 caracteres")
    private String link;
    
    @Size(min= 1, max = 100, message = "debe agregar entre 1 y 100 caracteres")
    private String name;
    
    @Size(min= 1, max = 255, message = "debe agregar entre 1 y 2555 caracteres")
    private String descrip;
    
    @Size(min= 1, max = 255, message = "debe agregar entre 1 y 2555 caracteres")
    private String linkproy;
    
    public Proyect(){
        
    }

    public Proyect(String link, String name, String descrip, String linkproy) {
        this.link = link;
        this.name = name;
        this.descrip = descrip;
        this.linkproy = linkproy;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getLinkproy() {
        return linkproy;
    }

    public void setLinkproy(String linkproy) {
        this.linkproy = linkproy;
    }
    
    
}
