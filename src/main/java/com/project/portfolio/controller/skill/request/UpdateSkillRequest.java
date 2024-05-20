package com.project.portfolio.controller.skill.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateSkillRequest {

    @NotNull
    private int id;

    @NotBlank
    private String name;

}
