package com.yogibaba.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogibaba.dao.IDoctorRepository;
import com.yogibaba.model.Doctor;

@Service("doctor_service")
public class DoctorServiceIml implements IDoctorService {
	
	@Autowired
	private IDoctorRepository doctorrepo;
	

	@Override
	public String registerDoctor(Doctor doctor) {
		
		Doctor doctor1=   doctorrepo.save(doctor);
		
		
		return "Doctor save succefully with ID"+doctor1.getDoctorId();
		
	}





	/*
	 * @Override public String registerDoctorsGroup(List<Doctor> doctors) {
	 * 
	 * if(doctors!=null) {
	 * 
	 * //save collection of Object List<Doctor> savedoctors = (List<Doctor>)
	 * doctorrepo.saveAll(doctors);
	 * 
	 * //colllected id from collection object
	 * 
	 * List<Integer> ids =
	 * savedoctors.stream().map(d->d.getDoctorId()).collect(Collectors.toList());
	 * 
	 * return savedoctors.size()
	 * +"Number of Doctors are inserted having"+ids+"id values";
	 * 
	 * }
	 * 
	 * 
	 * 
	 * return "No possible to save the object"; }
	 */

	//Or
	
	@Override
	public String registerDoctorsGroup(List<Doctor> doctors) {
		
		
		if(doctors!=null) 
		{
			
			//save collection of Object::
			
			List<Doctor> savedoctors = (List<Doctor>)doctorrepo.saveAll(doctors);
			
			List<Integer> ids = new ArrayList<Integer>();
			
			savedoctors.forEach(doc->{
				
				ids.add(doc.getDoctorId());
			});
			
			return savedoctors.size()+"Number of doctors are inserted having"+ids+"id values";
		}
		
		
		return null;
	}





	@Override
	public long fetchDoctorsCount() {
		
		return doctorrepo.count();
	}





	@Override
	public boolean cheakDoctorsAvailability(Integer id) {
		
		return doctorrepo.existsById(id);
	}





	@Override
	public Iterable<Doctor> showAllDoctors() {
		
		return doctorrepo.findAll();
	}





	@Override
	public Iterable<Doctor> showAllDoctorsById(Iterable<Integer> ids) {
		
		
		
		return doctorrepo.findAllById(ids)  ;
	}





	




	




	/*
	 * @Override public Doctor showDoctorById(Integer id) {
	 * 
	 * Doctor dutydoctor = new Doctor();
	 * 
	 * dutydoctor.setSpecialization("duty Doctor");
	 * 
	 * Doctor doc=doctorrepo.findById(id).orElse(dutydoctor);
	 * 
	 * 
	 * return doc; }
	 */
	
	                  //OR //Best
	
	/*
	 * @Override public Doctor showDoctorById(Integer id) { Doctor doc =
	 * doctorrepo.findById(id).orElseThrow(()-> new                        
	 * IllegalArgumentException("Invalid Doctor id")); return doc; }
	 */
	
	
                       //OR
	
	@Override
	public Doctor showDoctorById(Integer id) {
		 
		Optional<Doctor> opt = doctorrepo.findById(id);
		
		if(opt.isPresent()) 
		{
			return opt.get();
		}
		else 
		{
			throw new IllegalArgumentException("Invalid Doctor Id:");
		}
	}





	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
		
		//load doctot object in optional conatainer
		Optional<Doctor> opt = doctorrepo.findById(doctor.getDoctorId());
		
		if(opt.isPresent()) 
		{
			
			doctorrepo.save(doctor);
			
			return doctor.getDoctorId()+"Doctor details found and Updated";
		}
		
		else 
		{
		
		return "Doctor is save with id value"+doctorrepo.save(doctor).getDoctorId();
		
		}
	}





	@Override
	public String deleteDoctorById(Integer id) {
		
		//load the object
		
		Optional<Doctor> opt = doctorrepo.findById(id);
		
		if(opt.isPresent()) 
		{
			
			doctorrepo.deleteById(id);
			
			return id +"Doctor is found and deleted";
			
		}
		return id + "Doctor is Not Found for deletion";
	}





	@Override
	public String deleteDoctor(Doctor doctor) {
		
		//load the object
		
		Optional<Doctor> opt = doctorrepo.findById(doctor.getDoctorId());
		
		if(opt.isEmpty()) 
		{
			
			return doctor.getDoctorId()+"doctor is not found";
			
		}
	
		else
		{
			
			doctorrepo.delete(opt.get());
			
			return doctor.getDoctorId()+"Doctor is found and deleted";
		}
	}





	@Override
	public String removeAllDoctors() {
		
		Long count = doctorrepo.count();
		
		if(count > 0) 
		{
			
			doctorrepo.deleteAll();
			
			return count +"No of Doctors are deleted::";
			
			
		}
		return "No records found delete";
	}





	@Override
	public String removeDoctorsByIds(Iterable<Integer> ids) {
		
      List<Doctor> id =(List<Doctor>)doctorrepo.findAllById(ids); 
      
      doctorrepo.deleteAllById(ids);
      
		
		return id.size()+"No of records are deleted";
	}





	@Override
	public String removeAllDoctors(Iterable<Doctor> doctors) {
		
		int count =0;
		for (Doctor doctor : doctors) {
			
			count++;
		}
		
		doctorrepo.deleteAll(doctors);
		
		return count + "Doctors are deleted";
	}
		

	
	

}
