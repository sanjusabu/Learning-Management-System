package com.lms.module.mapper;

import com.lms.module.dto.ModuleDto;
import com.lms.module.Entity.ModuleTable;
public class ModuleMapper {
    public static ModuleDto mapToModuleDto(ModuleTable module, ModuleDto moduleDto) {
        moduleDto.setModuleName(module.getModuleName());
        moduleDto.setDescription(module.getDescription());
        moduleDto.setMentorId(module.getMentorId());
        moduleDto.setMenteeId(module.getMenteeId());
        moduleDto.setVideoId(module.getVideoId());
        return moduleDto;
    }

}
