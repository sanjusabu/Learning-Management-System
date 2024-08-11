package com.lms.module.service.impl;

import com.lms.module.Entity.ModuleTable;
import com.lms.module.Entity.VideoModuleTable;
import com.lms.module.dto.ModuleDto;
import com.lms.module.dto.VideoDto;
import com.lms.module.exceptions.ResourceNotFoundException;
import com.lms.module.mapper.ModuleMapper;
import com.lms.module.mapper.VideoModuleMapper;
import com.lms.module.repository.ModuleRepository;
import com.lms.module.repository.VideoRepository;
import com.lms.module.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModuleServiceimpl implements ModuleService {
    ModuleRepository moduleRepository;
    VideoRepository videoRepository;
    @Override
    public ModuleDto fetchModules(Integer moduleId) {
        ModuleTable module = moduleRepository.findById(moduleId).orElseThrow(
                () -> new ResourceNotFoundException("Module"," ", Integer.toString(moduleId))
        );

        return ModuleMapper.mapToModuleDto(module, new ModuleDto());
    }

    @Override
    public String addModules(ModuleDto moduleDto) {
        try {
            ModuleTable mod = ModuleMapper.mapToModule(moduleDto, new ModuleTable());
            moduleRepository.save(mod);
        } catch(RuntimeException ex){
            return ex.getMessage();
        }
        return "";
    }

    @Override
    public String addVideotoModule(VideoDto videodto) {
        try {
            Integer moduleId = videodto.getModuleId();
            ModuleTable module = moduleRepository.findById(moduleId).orElseThrow(
                    () -> new ResourceNotFoundException("Module","id", Integer.toString(moduleId))
            );
            if(module.getModuleId() > 0) {
                VideoModuleTable vid = VideoModuleMapper.mapToVideo(videodto, new VideoModuleTable());
                videoRepository.save(vid);
            } else {
                return String.format("Module %d not found", moduleId);
            }
        } catch(RuntimeException ex){
            return ex.getMessage();
        }
        return "";
    }

    @Override
    public String deleteModule(Integer moduleId) {
        try {
            ModuleTable module = moduleRepository.findById(moduleId).orElseThrow(
                    () -> new ResourceNotFoundException("Module","id", Integer.toString(moduleId))
            );
            if(module.getModuleId() > 0) {
                moduleRepository.deleteById(moduleId);
            } else {
                return String.format("Module %d not found", moduleId);
            }
        } catch(RuntimeException ex){
            return ex.getMessage();
        }
        return "";
    }
}
