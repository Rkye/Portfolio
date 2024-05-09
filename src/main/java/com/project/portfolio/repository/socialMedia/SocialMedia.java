package com.project.portfolio.repository.socialMedia;

import com.project.portfolio.core.Base;
import com.project.portfolio.repository.homepage.Homepage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Social_Medias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SocialMedia extends Base {

    @Column(name="link")
    private String link;

    @OneToMany(mappedBy = "social_media")
    private List<Homepage> homepageList;
}
