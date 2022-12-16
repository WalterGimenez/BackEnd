
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
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
    
    
}
