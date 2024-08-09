package com.lms.module.service.impl;

import com.lms.module.Entity.ModuleTable;
import com.lms.module.dto.ModuleDto;
import com.lms.module.exceptions.ResourceNotFoundException;
import com.lms.module.mapper.ModuleMapper;
import com.lms.module.repository.ModuleRepository;
import com.lms.module.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModuleServiceimpl implements ModuleService {
    ModuleRepository moduleRepository;
    @Override
    public ModuleDto fetchModules(Long moduleId) {
        ModuleTable module = moduleRepository.findById(moduleId).orElseThrow(
                () -> new ResourceNotFoundException("Module","", Long.toString(moduleId))
        );

        return ModuleMapper.mapToModuleDto(module, new ModuleDto());
    }
}
