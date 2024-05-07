package com.yogibaba.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity()
@NoArgsConstructor
@Table(name="DOCTORJPA")
public class Doctor {
	
	
	
	@Column(name="DOCTOR-ID")
	@Id
	@SequenceGenerator(name = "Seq1",sequenceName ="Sequece1",initialValue =1, allocationSize = 1)
    @GeneratedValue(generator = "Seq1",strategy = GenerationType.SEQUENCE)
	private Integer DoctorId;
	
	@Column(name="DOCTOR-NAME")
	private String DoctorName;
	
	@Column(name="DOCTOR-SPECIALIZATION")
	private String Specialization;
	
	//@Transient
	@Column(name="DOCTOR-INCOME")
	private Double DoctorIncome;
	
	@Column(name="DOCTOR-CONTACT")
	private Long DoctorContact;

	
	  public Doctor(Integer doctorId, String doctorName, String specialization,
	  Double doctorIncome, Long doctorContact) { super(); DoctorId = doctorId;
	  DoctorName = doctorName; Specialization = specialization; DoctorIncome =
	  doctorIncome; DoctorContact = doctorContact; }
	 

	
}
