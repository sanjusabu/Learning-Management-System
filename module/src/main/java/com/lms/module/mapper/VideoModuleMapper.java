package com.lms.module.mapper;

import com.lms.module.Entity.ModuleTable;
import com.lms.module.Entity.VideoModuleTable;
import com.lms.module.dto.ModuleDto;
import com.lms.module.dto.VideoDto;

public class VideoModuleMapper {
    public static VideoModuleTable mapToVideo(VideoDto videoDto, VideoModuleTable video) {
        video.setModuleId(videoDto.getModuleId());
        video.setVideoLink(videoDto.getVideoLink());
        return video;
    }
}
