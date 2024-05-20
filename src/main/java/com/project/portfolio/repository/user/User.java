package com.project.portfolio.repository.user;

import com.project.portfolio.core.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class User extends Base {

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="role")
    private String role;

    @Column(name="mail_address")
    private String mailAddress;

    @Column(name="password")
    private String password;

}
