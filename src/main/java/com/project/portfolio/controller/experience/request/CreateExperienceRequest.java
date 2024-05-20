package com.project.portfolio.controller.experience.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateExperienceRequest {

    @NotBlank
    private String departmentTitle;

    @NotBlank
    private String workplace;

    @NotBlank
    private String detail;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

}
