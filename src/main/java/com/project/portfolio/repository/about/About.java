package com.project.portfolio.repository.about;

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
@Table(name = "About")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class About extends Base {

    @Column(name="detail")
    private String detail;

}
