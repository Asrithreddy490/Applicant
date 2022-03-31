package com.cg.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "Applicant")
public class Applicant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Applicant_Id" , length = 10)
	private int applicantId;
	@Column(name = " Name_of_Applicant" , length = 20)
	private String applicantName;
	@Column(name = "Applicant_Mobile_Number" , length = 10)
	private int mobileNumber;
	@Column(name = "Applicant_Degree" , length = 10)
	private int applicantDegree;
	@Column(name = "Applicant_Percentage" , length = 10)
	private double graduationPercentage;
	
	
}