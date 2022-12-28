
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


/*@Getter @Setter*/
public class DtoEducation {
     @NotBlank
    private String name;
    
    @NotBlank
    private String startend;
    
    @NotBlank
    private String descrip;
    
    @NotBlank
    private String link;

    public DtoEducation(String name, String startend, String descrip, String link) {
        this.name = name;
        this.startend = startend;
        this.descrip = descrip;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartend() {
        return startend;
    }

    public void setStartend(String startend) {
        this.startend = startend;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
