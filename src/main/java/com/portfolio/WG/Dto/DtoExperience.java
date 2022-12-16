
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoExperience {
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String startend;
    
    @NotBlank
    private String link;
    
    @NotBlank
    private String job;
    
    @NotBlank
    private String descrip;

    public DtoExperience(String name, String startend, String link, String job, String descrip) {
        this.name = name;
        this.startend = startend;
        this.link = link;
        this.job = job;
        this.descrip = descrip;
    }
    
}
