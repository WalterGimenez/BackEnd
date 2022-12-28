
package com.portfolio.WG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres")
    private String name;
    
    @NotNull
    @Size(min= 1, max = 50, message = "debe agregar entre 1 y 50 caracteres")
    private String lastname;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String about1;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String about2;
     
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String tit1;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String tit2;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String banner;
    
    @Size(min=1, max = 255,message = "debe agregar entre 1 y 255 caracteres" )
    private String link;
    
    public Persona(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAbout1() {
        return about1;
    }

    public void setAbout1(String about1) {
        this.about1 = about1;
    }

    public String getAbout2() {
        return about2;
    }

    public void setAbout2(String about2) {
        this.about2 = about2;
    }

    public String getTit1() {
        return tit1;
    }

    public void setTit1(String tit1) {
        this.tit1 = tit1;
    }

    public String getTit2() {
        return tit2;
    }

    public void setTit2(String tit2) {
        this.tit2 = tit2;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
