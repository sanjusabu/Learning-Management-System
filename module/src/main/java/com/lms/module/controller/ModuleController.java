package com.lms.module.controller;

import com.lms.module.dto.ModuleDto;
import com.lms.module.dto.ResponseDto;
import com.lms.module.dto.VideoDto;
import com.lms.module.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ModuleController {

    private ModuleService moduleService;
    @GetMapping("/module")
    public ResponseEntity<ModuleDto> fetchmoduleDetails(@RequestParam Integer moduleId) {
        ModuleDto moduleDto = moduleService.fetchModules(moduleId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(moduleDto);
    }
    @PostMapping("/module")
    public ResponseEntity<ResponseDto> addmodule(@RequestBody ModuleDto moduleDto) {
        String msg = moduleService.addModules(moduleDto);
        if(msg.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Successfully Created", HttpStatus.CREATED));
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ResponseDto(msg, HttpStatus.INTERNAL_SERVER_ERROR));
    }
    @DeleteMapping("/module")
    public ResponseEntity<ResponseDto> deletemodule(@RequestParam Integer moduleId) {
        String msg = moduleService.deleteModule(moduleId);
        if(msg.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Module Successfully Deleted", HttpStatus.ACCEPTED));
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ResponseDto(msg, HttpStatus.INTERNAL_SERVER_ERROR));
    }
    @PostMapping("/addvideotomodule")
    public ResponseEntity<ResponseDto> addvideotomodule(@RequestBody VideoDto video) {
        String msg = moduleService.addVideotoModule(video);
        if(msg.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Video Successfully Added", HttpStatus.CREATED));
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ResponseDto(msg, HttpStatus.INTERNAL_SERVER_ERROR));
    }
}
