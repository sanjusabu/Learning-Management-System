package com.lms.module.service;

import com.lms.module.dto.ModuleDto;
import com.lms.module.dto.VideoDto;

public interface ModuleService {
    ModuleDto fetchModules(Integer moduleId);

    String addModules(ModuleDto moduleDto);

    String addVideotoModule(VideoDto video);

    String deleteModule(Integer moduleId);
}
