
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/*@Getter @Setter*/
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
}
