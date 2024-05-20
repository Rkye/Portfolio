package com.project.portfolio.controller.certificate.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCertificateRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String organisationName;

    @NotNull
    private LocalDate givenDate;

    @NotBlank
    private String certificateSiteLink;

}
