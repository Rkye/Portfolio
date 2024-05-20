package com.project.portfolio.controller.contact.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactResponse {

    int id;
    String name;
    String surname;
    String emailAddress;
    String message;

}
