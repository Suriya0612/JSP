package com.jpa.project.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="project_mtm")
public class ProjectMTM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(sequenceName = "seq_project_mtm", allocationSize = 1, name = "PROJECT_MTM_SEQ")

            @Column(name="id")
            private Long id;
            @Column(name="projectname")
            private String projectName;
            
            @ManyToMany(mappedBy="projectAssigned",fetch=FetchType.EAGER,cascade= CascadeType.ALL)
            private List<StudentMTM> student;
            
            public ProjectMTM() {
            }

            public ProjectMTM(String projectName, List<StudentMTM> student) {
                super();
                this.projectName = projectName;
                this.student = student;
            }

            public ProjectMTM(String projectName) {
                super();
                this.projectName = projectName;
            }

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public List<StudentMTM> getStudent() {
                return student;
            }

            public void setStudent(List<StudentMTM> student) {
                this.student = student;
            }

            public String getProjectName() {
                return projectName;
            }

            public void setProjectName(String projectName) {
                this.projectName = projectName;
            }

            @Override
            public String toString() {
                return "Project [id=" + id + ", projectName=" + projectName + ", student=" + student + "]";
            }
            
}

