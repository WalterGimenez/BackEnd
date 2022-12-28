
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/*@Getter @Setter*/
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
