package com.jpa.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="address_table")
public class AddressEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@SequenceGenerator(sequenceName = "seq_address", allocationSize = 1, name = "seq_address")
		
		@Column(name="id")
	    private Long id;
		@Column(name="street")
	    private String street;
	    
		@OneToOne(mappedBy="address")
		private PersonEntity person;
	    public AddressEntity() {
	    	
	    }
	   
	   public AddressEntity(Long id, String street) {
			super();
			this.id = id;
			this.street = street;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}
		
}
