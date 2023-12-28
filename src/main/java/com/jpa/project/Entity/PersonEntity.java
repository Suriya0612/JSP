package com.jpa.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="person_table")
public class PersonEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@SequenceGenerator(sequenceName = "seq_gen", allocationSize = 1, name = "seq_gen")

		@Column(name="id")
	    private Long id;
		@Column(name="name")
	    private String name;
	    
	    @OneToOne(cascade= CascadeType.ALL)
	    @JoinColumn(name="address_id")
	    private AddressEntity address;
	    
	    public PersonEntity() {
	    	
	    }
	    
		public PersonEntity(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public AddressEntity getAddress() {
			return address;
		}

		public void setAddress(AddressEntity address) {
			this.address = address;
		}

	       
}
