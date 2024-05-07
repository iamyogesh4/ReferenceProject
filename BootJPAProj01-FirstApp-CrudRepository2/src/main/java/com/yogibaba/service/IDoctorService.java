package com.yogibaba.service;



import java.util.List;

import com.yogibaba.model.Doctor;

public interface IDoctorService {
	
	public String registerDoctor(Doctor doctor);
	
	public String registerDoctorsGroup(List<Doctor> doctors);
	
	public long fetchDoctorsCount();
	
	public boolean cheakDoctorsAvailability(Integer id);
	
	public Iterable<Doctor> showAllDoctors();
	
	public Iterable<Doctor> showAllDoctorsById(Iterable<Integer> ids);
	
	public Doctor showDoctorById(Integer id);
	
	public String registerOrUpdateDoctor(Doctor doctor);
	
	public String deleteDoctorById(Integer id);
	
	public String deleteDoctor(Doctor doctor);
	
	public String removeAllDoctors();
	
	public String removeDoctorsByIds(Iterable<Integer> ids);
	
	public String removeAllDoctors(Iterable<Doctor> doctors);
	
	
	
	

}
