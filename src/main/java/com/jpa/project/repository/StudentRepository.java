package com.jpa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.project.Entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{
}
