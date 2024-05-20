package com.project.portfolio.controller.homepage.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HomepageResponse {

    int id;
    String detail;
    int socialMediaId;
    //TODO List<String> socialMediaName;

}
