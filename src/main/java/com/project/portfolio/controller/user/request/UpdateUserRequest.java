package com.project.portfolio.controller.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserRequest {

    @NotNull
    private int id;

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
