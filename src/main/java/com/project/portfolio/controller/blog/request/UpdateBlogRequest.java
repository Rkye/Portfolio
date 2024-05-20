package com.project.portfolio.controller.blog.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateBlogRequest {

    @NotNull
    private int id;

    @NotBlank
    private String title;

    @NotBlank
    private String detail;

    @NotNull
    private int skillId;

    boolean isActive;

    boolean isDeleted;
}
