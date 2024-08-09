package com.lms.mentorservice.service;

import com.lms.mentorservice.dto.ModuleDto;

public interface ModuleService {
     ModuleDto fetchModules(Long moduleId);
}
