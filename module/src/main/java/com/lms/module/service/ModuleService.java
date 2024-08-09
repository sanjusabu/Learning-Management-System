package com.lms.module.service;

import com.lms.module.dto.ModuleDto;

public interface ModuleService {
    ModuleDto fetchModules(Long moduleId);
}
