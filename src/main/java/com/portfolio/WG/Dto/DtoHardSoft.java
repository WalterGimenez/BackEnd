
package com.portfolio.WG.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/*@Getter @Setter*/
public class DtoHardSoft {
    @NotBlank
    private String name;
    
    @NotBlank
    private int perc;

    public DtoHardSoft(String name, int perc) {
        this.name = name;
        this.perc = perc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }
    
    
    
}
