package com.lms.mentorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuleDto {

    private String moduleName;
    private String description;
    private String mentorId;
    private Long videoId;
    private Long menteeId;
}
