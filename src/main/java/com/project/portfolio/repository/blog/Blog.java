package com.project.portfolio.repository.blog;

import com.project.portfolio.core.Base;
import com.project.portfolio.repository.skill.Skill;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Blogs")
public class Blog extends Base {

    @Column(name="title")
    private String title;

    @Column(name="detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
