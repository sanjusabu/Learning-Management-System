package com.lms.module.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VideoTable",uniqueConstraints=
@UniqueConstraint(columnNames={"videoLink"}) )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideoTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String videoName;
    @Column(nullable = false)
    private String videoLink;
}
