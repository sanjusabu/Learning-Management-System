package com.lms.module.repository;
import com.lms.module.Entity.VideoModuleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoModuleTable, Integer> {

}
