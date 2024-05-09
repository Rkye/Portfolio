package com.project.portfolio.repository.skill;

import com.project.portfolio.core.Base;
import com.project.portfolio.repository.blog.Blog;
import com.project.portfolio.repository.project.Project;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Skills")
public class Skill extends Base {

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "skill")
    private List<Project> projectList;

    @OneToMany(mappedBy = "skill")
    private List<Blog> blogList;

}
