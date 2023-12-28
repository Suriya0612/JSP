package com.jpa.project.Entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name="project_table")
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(sequenceName = "seq_gen", allocationSize = 1, name = "seq_gen")

			@Column(name="id")
		    private Long id;
			@Column(name="projectname")
		    private String projectname;
		    
		    @ManyToMany(mappedBy="projectassigned",fetch=FetchType.EAGER,
		    		cascade = CascadeType.ALL)
		    private List<StudentEntity> student;
		 
		    public ProjectEntity() {
		    }

			public ProjectEntity(Long id, String projectname, List<StudentEntity> student) {
				super();
				this.id = id;
				this.projectname = projectname;
				this.student = student;
			}
			
			

			public ProjectEntity(String projectname) {
				super();
				this.projectname = projectname;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<StudentEntity> getStudent() {
				return student;
			}

			public void listStudent(List<StudentEntity> student) {
				this.student = student;
			}

			public String getProjectname() {
				return projectname;
			}

			public void setProjectname(String projectname) {
				this.projectname = projectname;
			}
		    

            @Override
            public String toString() {
                return "Project [id=" + id + ", projectname=" + projectname + ", student=" + student + "]";
            }
		    
}
