package com.project.portfolio.controller.certificate.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CertificateResponse {

    int id;
    String name;
    String organisationName;
    LocalDate givenDate;
    String certificateSiteLink;

}
