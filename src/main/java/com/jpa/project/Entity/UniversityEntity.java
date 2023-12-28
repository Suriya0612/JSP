package com.jpa.project.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="university_table")
public class UniversityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(sequenceName = "seq_univ", allocationSize = 1, name = "seq_univ")

			@Column(name="id")
		    private Long id;
			@Column(name="university_name")
		    private String university;
			@Column(name="city")
			private String city;
		    
		    @OneToMany(cascade= CascadeType.ALL)
		    @JoinColumn(name="fk_univ_id",referencedColumnName="id")
		    private List<DepartmentEntity> department;
		    
		    public UniversityEntity() {
		    	
		    }
		    
			public UniversityEntity(Long id, String university, String city, List<DepartmentEntity> department) {
				super();
				this.id = id;
				this.university = university;
				this.city = city;
				this.department = department;
			}		

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getUniversity() {
				return university;
			}

			public void setUniversity(String university) {
				this.university = university;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public List<DepartmentEntity> getDepartment() {
				return department;
			}

			public void setDepartment(List<DepartmentEntity> department) {
				this.department = department;
			}
			
}
