package com.cg.entities;

import java.time.LocalDate;

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
@Table(name = "Admission_Details")

public class Admission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = " Admission_Id" , length = 20)
	private int admissionId;
	@Column(name = " Course_Id" , length = 20)
	private Course courseId;
	@Column(name = " Applicant_Id" , length = 20)
	private Applicant applicantId; 
	@Column(name = "Admission_Date")
	private LocalDate admissionDate;
//	
//	@Enumerated(EnumType.STRING)
//	private AdmissionStatus status;
	
	@OneToOne
	@JoinColumn(name = "Applicant_Id" , referencedColumnName = "Applicant_Id")
	private Applicant Applicant;
	
	@OneToOne
	@JoinColumn(name = "Course_Id" , referencedColumnName = "Course_Id")
	private Course Course;
	
}
