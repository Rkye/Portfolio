package com.project.portfolio.controller.project.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProjectRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String detail;

    @NotNull
    private LocalDate projectDate;

    @NotNull
    private int skillId;

    @NotBlank
    private String liveSiteLink;

    @NotBlank
    private String githubLink;

}
