package com.lms.module.repository;
import com.lms.module.Entity.ModuleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleTable, Long> {

}
