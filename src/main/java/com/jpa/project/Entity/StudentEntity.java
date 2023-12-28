package com.jpa.project.Entity;
import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name="student_table")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(sequenceName = "seq_student", allocationSize = 1, name = "seq_student")

			@Column(name="id")
		    private Long id;
			@Column(name="studentname")
		    private String studentname;
		    
		    @ManyToMany(fetch=FetchType.LAZY,cascade= CascadeType.ALL)
		    @JoinTable(name="student_project_table",
		    joinColumns= {
		    		@JoinColumn(name="student_id",referencedColumnName="id"),
		    },
		    inverseJoinColumns= {
		    		@JoinColumn(name="project_id",referencedColumnName="id")})
			private List<ProjectEntity> projectassigned;
		    
		  
		    public StudentEntity() {
		    	
		    }

			public StudentEntity(Long id, String studentname, List<ProjectEntity> projectassigned) {
				super();
				this.id = id;
				this.studentname = studentname;
				this.projectassigned = projectassigned;
			}
			

			public StudentEntity(String studentname) {
				super();
				this.studentname = studentname;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			
			public String getStudentname() {
				return studentname;
			}

			public void setStudentname(String studentname) {
				this.studentname = studentname;
			}

			public List<ProjectEntity> getProjectassigned() {
				return projectassigned;
			}

			public void setProjectassigned(List<ProjectEntity> projectassigned) {
				this.projectassigned = projectassigned;
			}
			 @Override
	            public String toString() {
	                return "Student [studentName=" + studentname + "]";
	            }

			
		    
}
