package com.lms.module.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "module")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ModuleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moduleId;
    @Column(nullable = false, unique = true)
    private String moduleName;
    private String description;
    private Integer mentorId;
    private Integer menteeId;
}
