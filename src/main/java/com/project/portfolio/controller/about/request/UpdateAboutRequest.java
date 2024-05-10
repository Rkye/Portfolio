package com.project.portfolio.controller.about.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAboutRequest {

    @NotBlank
    String detail;

}
