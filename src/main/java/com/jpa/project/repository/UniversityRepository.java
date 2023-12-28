package com.jpa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.project.Entity.UniversityEntity;
@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity, Long>{

}
