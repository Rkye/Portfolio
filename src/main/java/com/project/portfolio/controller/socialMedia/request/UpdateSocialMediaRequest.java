package com.project.portfolio.controller.socialMedia.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateSocialMediaRequest {

    @NotNull
    private int id;

    @NotBlank
    private String link;

}
