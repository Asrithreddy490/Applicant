package com.cg.entities;


import java.time.LocalDate;

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
@Table(name = "Course")
@Builder
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Course_Id")
	private int courseId;
	@Column(name = "Course_Name" , length = 30)
	private String courseName;
	@Column(name = "Duration")
	private String duration;
	@Column(name = "Course_Start_Date")
	private LocalDate courseStartDate;
	@Column(name = "Course_End_Date")
	private LocalDate courseEndDate;
	@Column(name = "Course_Fee")
	private double courseFee;

}
