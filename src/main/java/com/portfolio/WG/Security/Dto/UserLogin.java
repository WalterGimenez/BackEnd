
package com.portfolio.WG.Security.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserLogin {
    @NotBlank
    private String userName;
    
    @NotBlank
    private String password;
}
