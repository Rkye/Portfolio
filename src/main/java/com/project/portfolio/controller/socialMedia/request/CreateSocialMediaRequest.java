package com.project.portfolio.controller.socialMedia.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateSocialMediaRequest {

    @NotBlank
    private String link;

}
