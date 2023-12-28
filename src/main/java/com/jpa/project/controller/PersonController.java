package com.jpa.project.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jpa.project.Entity.*;
import com.jpa.project.repository.*;

@RestController
@RequestMapping("/data")
public class PersonController {

		@Autowired
	    private PersonRepository personRepository;
		
		@Autowired
	    private UniversityRepository universityRepository;
		
		@Autowired
	    private StudentRepository studentRepository;
	    
		@Autowired
		private ProjectRepository projectRepository;
		
		
		
//		public PersonController(StudentRepository studentRepository, ProjectRepository projectRepository) {
//			super();
//			this.studentRepository = studentRepository;
//			this.projectRepository = projectRepository;
//		}

		@PostMapping("/saveperson")
	    public PersonEntity savePerson( @RequestBody PersonEntity person){
	    	return personRepository.save(person);
	    }

	    @GetMapping("/getallperson")
	    public List<PersonEntity> getAllPerson() {
	        return personRepository.findAll();
	    }
	    
	    @PostMapping("/savestudent")
	    public StudentEntity savestudent( @RequestBody  StudentEntity student){
	    	return studentRepository.save(student);
	    }

	    @GetMapping("/getmanytomany")
	    public List<ProjectEntity> getAllproject() {
	        return projectRepository.findAll();
	    }
	    
	    @PostMapping("/saveproject")
	    public ProjectEntity saveproject( @RequestBody  ProjectEntity project){
	    	return projectRepository.save(project);
	    }
	    
	    @GetMapping("/getallproject")
	    public List<StudentEntity> getAllProject() {
	        return studentRepository.findAll();
	    }
	    
	    @PostMapping("/saveuniv")
	    public UniversityEntity saveuniv( @RequestBody  UniversityEntity university){
	    	return universityRepository.save(university);
	    }

	    @GetMapping("/getalldata")
	    public List<UniversityEntity> getAlldata() {
	        return universityRepository.findAll();
	    }
	    

}