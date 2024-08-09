package com.lms.mentorservice.service.Impl;

import com.lms.mentorservice.Entity.Module;
import com.lms.mentorservice.dto.ModuleDto;
import com.lms.mentorservice.exceptions.ResourceNotFoundException;
import com.lms.mentorservice.mapper.ModuleMapper;
import com.lms.mentorservice.repository.ModuleRepository;
import com.lms.mentorservice.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModuleServiceimpl implements ModuleService {
    ModuleRepository moduleRepository;
    @Override
    public ModuleDto fetchModules(Long moduleId) {
        Module module = moduleRepository.findById(moduleId).orElseThrow(
                () -> new ResourceNotFoundException("Module","", Long.toString(moduleId))
        );

        return ModuleMapper.mapToModuleDto(module, new ModuleDto());
    }
}
