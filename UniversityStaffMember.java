package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "University_Staff_Member")
@Builder

public class UniversityStaffMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Staff_Id" , length = 20)
	private int staffId;
	@Column(name = "Password")
	private String password;
	@Column(name = "Designation")
	private String role;

}
