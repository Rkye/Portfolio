package com.project.portfolio.controller.project.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectResponse {

    int id;
    String title;
    String detail;
    LocalDate projectDate;
    int skillId;
    //TODO String skillName;
    String liveSiteLink;
    String githubLink;

}
