package com.project.portfolio.controller.contact.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateContactRequest {

    @NotNull
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String emailAddress;

    @NotBlank
    private String message;

}
