package com.lms.module.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VideoModuleTable",uniqueConstraints=
@UniqueConstraint(columnNames={"moduleId", "videoLink"}) )
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class VideoModuleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer moduleId;
    @Column(nullable = false)
    private String videoLink;
}
