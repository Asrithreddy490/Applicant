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
@Builder
@Table(name = "Admission_Commitee_Member")
public class AdmissionCommiteeMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Admin_Id" , length = 20)
	private int adminId;
	@Column(name = "Admin_Name" , length = 30)
	private String adminName;
	@Column(name = "Admin_Contact" , length = 20)
	private int adminContact;

}
