
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoPersona {
    @NotBlank
    private String name;
    
    @NotBlank
    private String lastname;
    
    @NotBlank
    private String about1;
    
    @NotBlank
    private String about2;
     
    @NotBlank
    private String tit1;
    
    @NotBlank
    private String tit2;
    
    @NotBlank
    private String banner;
    
    @NotBlank
    private String link;

    public DtoPersona(String name, String lastname, String about1, String about2, String tit1, String tit2, String banner, String link) {
        this.name = name;
        this.lastname = lastname;
        this.about1 = about1;
        this.about2 = about2;
        this.tit1 = tit1;
        this.tit2 = tit2;
        this.banner = banner;
        this.link = link;
    }
    
    
}
