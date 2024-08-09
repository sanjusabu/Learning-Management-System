package com.lms.mentorservice.mapper;

import com.lms.mentorservice.Entity.Module;
import com.lms.mentorservice.dto.ModuleDto;

public class ModuleMapper {
    public static ModuleDto mapToModuleDto(Module module, ModuleDto moduleDto) {
        moduleDto.setModuleName(module.getModuleName());
        moduleDto.setDescription(module.getDescription());
        moduleDto.setMentorId(module.getMentorId());
        moduleDto.setMenteeId(module.getMenteeId());
        moduleDto.setVideoId(module.getVideoId());
        return moduleDto;
    }

}
