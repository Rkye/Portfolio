package com.project.portfolio.controller.blog.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlogResponse {

    int id;
    String title;
    String detail;
    int skillId;
    //String skillName;
    boolean isActive;
    boolean isDeleted;

}
