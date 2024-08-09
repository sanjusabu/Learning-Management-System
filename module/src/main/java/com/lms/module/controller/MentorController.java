package com.lms.module.controller;

import com.lms.module.dto.ModuleDto;
import com.lms.module.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MentorController {

    private ModuleService moduleService;
    @GetMapping("/module")
    public ResponseEntity<ModuleDto> fetchmoduleDetails(@RequestParam Long moduleId) {
        ModuleDto moduleDto = moduleService.fetchModules(moduleId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(moduleDto);
    }

}
