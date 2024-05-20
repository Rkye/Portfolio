package com.project.portfolio.controller.skill.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateSkillRequest {

    @NotBlank
    private String name;

}
