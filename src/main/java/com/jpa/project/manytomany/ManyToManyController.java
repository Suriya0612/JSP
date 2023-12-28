package com.jpa.project.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mtm")
public class ManyToManyController {
	
	@Autowired
	ProjectMTMRepository projectRepository;
	
	@Autowired
	StudentMTMRepository studentRepository;
	
	@PostMapping("saveStudents")
	public String saveStudents(@RequestBody StudentMTM student) {
		
		studentRepository.save(student);
		return "Student Saved Successfully";
	}

	@PostMapping("saveProjects")
	public String saveProjects(@RequestBody ProjectMTM project) {
		projectRepository.save(project);
		return "Projects Saved Successfully";
	}
	
	@GetMapping("getAllProjects")
    public String getAllProjects() {        
        List<ProjectMTM> list = projectRepository.findAll();
        return list.toString();
    }
	
	@GetMapping("getAllStudents")
    public String getAllStudents() {
        List<StudentMTM> list = studentRepository.findAll();
        return list.toString();
    }

}
