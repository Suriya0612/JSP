package com.jpa.project.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="department_table")
public class DepartmentEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@SequenceGenerator(sequenceName = "seq_dept", allocationSize = 1, name = "seq_dept")

				@Column(name="id")
			    private Long id;
				@Column(name="college")
			    private String college;
				@Column(name="department")
				private String department;
			    

			    public DepartmentEntity() {
			    	
			    }

			    public DepartmentEntity(Long id, String college, String department) {
			    	super();
			    	this.id = id;
			    	this.college = college;
			    	this.department = department;
			    }

				public Long getId() {
					return id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getCollege() {
					return college;
				}

				public void setCollege(String college) {
					this.college = college;
				}

				public String getDepartment() {
					return department;
				}

				public void setDepartment(String department) {
					this.department = department;
				}
			    
			    

}
