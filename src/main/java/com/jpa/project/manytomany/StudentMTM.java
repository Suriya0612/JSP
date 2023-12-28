package com.jpa.project.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="student_mtm")
public class StudentMTM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(sequenceName = "seq_student_mtm", allocationSize = 1, name = "STUDENT_MTM_SEQ")

            @Column(name="id")
            private Long id;
            @Column(name="studentName")
            private String studentName;
            
            @ManyToMany(cascade= CascadeType.ALL,fetch = FetchType.LAZY)
            @JoinTable(name="student_project_mtm",
            joinColumns= {
                    @JoinColumn(name="student_id",referencedColumnName="id"),
            },
            inverseJoinColumns= {
                    @JoinColumn(name="project_id",referencedColumnName="id")})
            private List<ProjectMTM> projectAssigned;
            
            public StudentMTM() {
                
            }

            public StudentMTM(String studentName, List<ProjectMTM> projectAssigned) {
                super();
                this.studentName = studentName;
                this.projectAssigned = projectAssigned;
            }            

            public StudentMTM(String studentName) {
                super();
                this.studentName = studentName;
            }

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public String getStudentName() {
                return studentName;
            }

            public void setStudentName(String studentName) {
                this.studentName = studentName;
            }

            public List<ProjectMTM> getProjectAssigned() {
                return projectAssigned;
            }

            public void setProjectAssigned(List<ProjectMTM> projectAssigned) {
                this.projectAssigned = projectAssigned;
            }

            @Override
            public String toString() {
                return "Student [studentName=" + studentName + "]";
            }

}

