package com.project.portfolio.controller.user.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String role;

    @NotBlank
    private String emailAddress;

    @NotBlank
    private String password;

}
