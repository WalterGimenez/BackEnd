

package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/*@Getter @Setter*/
public class DtoProyect {
    @NotBlank
    private String link;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String descrip;
    
    @NotBlank
    private String linkproy;

    public DtoProyect(String link, String name, String descrip, String linkproy) {
        this.link = link;
        this.name = name;
        this.descrip = descrip;
        this.linkproy = linkproy;
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
