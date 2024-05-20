package com.project.portfolio.controller.blog.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBlogRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String detail;

    @NotNull
    private int skillId;

    boolean isActive;

    boolean isDeleted;

}
