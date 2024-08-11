package com.lms.module.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuleDto {
    private String moduleName;
    private String description;
    @Value("${mentorId:0}")
    private Integer mentorId;
    @Value("${menteeId:0}")
    private Integer menteeId;
}
