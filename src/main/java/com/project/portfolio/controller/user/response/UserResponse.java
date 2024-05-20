package com.project.portfolio.controller.user.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

    int id;
    String name;
    String surname;
    String role;
    String emailAddress;

}
