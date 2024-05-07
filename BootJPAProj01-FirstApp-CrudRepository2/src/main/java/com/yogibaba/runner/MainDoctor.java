package com.yogibaba.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yogibaba.model.Doctor;
import com.yogibaba.service.IDoctorService;
@Component("main_runner")
public class MainDoctor implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorservice;
	@Override
	public void run(String... args) throws Exception {
		
		
		try 
		{
			//save method from CrudRepository - Save one Object
			/*Doctor doctor1 = new Doctor();
			
			doctor1.setDoctorName("Yogesh");
			doctor1.setSpecialization("MBBS");
			doctor1.setDoctorContact(9120976605L);
			doctor1.setDoctorIncome(100000.00);
			
			
			String msg = doctorservice.registerDoctor(doctor1);
			
			System.out.println(msg);*/
			
			
			//saveAll() method from CrudRepository - Save bacth of object or group of Object.
			
			//Create Doctor Objects
			
			
			/*
			 * Doctor d1 = new Doctor(null, "Yogesh", "cardio", 10000.00, 9326486598L);
			 * Doctor d2 = new Doctor(null, "Yogesh", "cardio", 10000.00, 9326486598L);
			 * Doctor d3 = new Doctor(null, "Yogesh", "cardio", 10000.00, 9326486598L);
			 * 
			 * 
			 * //Callig business method:
			 * 
			 * String msg=doctorservice.registerDoctorsGroup(List.of(d1,d2,d3)); //List.of
			 * gives immutable list collections
			 * 
			 * //or
			 * 
			 * //String msg2 = doctorservice.registerDoctorsGroup(Arrays.asList(d1,d2,d3));
			 * 
			 * 
			 * System.out.println(msg);
			 */
			
			
			//Fetch Doctors Count::
			
			/*
			 * long doctorscount = doctorservice.fetchDoctorsCount();
			 * 
			 * System.out.println("Doctors Count =:"+doctorscount);
			 */
			
			//Cheak Weather Doctor is existOrNot::
			
			
			
			// System.out.println("1 Id is exist : ?"+doctorservice.cheakDoctorsAvailability(1));
			
			
			//Show All Available Doctrs - findAll()
			
			
			/*
			 * Iterable<Doctor> alldoctors = doctorservice.showAllDoctors();
			 * 
			 * for(Doctor doc : alldoctors) { System.out.println(doc); }
			 */
			
			
			//findAllDoctors By Ids -findAll(Iterable<Integer> ids):
			
			/*
			 * Iterable<Doctor> alldoctorById =
			 * doctorservice.showAllDoctorsById(List.of(1,2,3,4));
			 * 
			 * 
			 * alldoctorById.forEach(System.out::println);
			 */
			
			
			//findById
			
			/*
			 * Doctor result = doctorservice.showDoctorById(1000);
			 * 
			 * System.out.println(result);
			 */
			
			//Fully Object Modification & Partial Object Modification
			
			/*
			 * Doctor doctor = new Doctor();
			 * 
			 * doctor.setDoctorId(20);
			 * 
			 * doctor.setDoctorName("Manish");
			 * 
			 * doctor.setDoctorIncome(28000.00);
			 * 
			 * doctor.setDoctorContact(888888888L);
			 * 
			 * doctor.setSpecialization("Animal");
			 * 
			 * 
			 * //call The Business method
			 * 
			 * String msg = doctorservice.registerOrUpdateDoctor(doctor);
			 * 
			 * System.out.println(msg);
			 */
			
			//Partial Doctor Modification
			
			/*
			 * Doctor doctor = new Doctor();
			 * 
			 * doctor.setDoctorId(1);
			 * 
			 * doctor.setDoctorName("Ramesh Babu");
			 * 
			 * String msg = doctorservice.registerOrUpdateDoctor(doctor);
			 * 
			 * System.out.println(msg);
			 */
			
			  //Doctor -Delete By Id
			  
				/*
				 * String msg = doctorservice.deleteDoctorById(100);
				 * 
				 * System.out.println(msg)
				 */;
			
				 
				
				 //Doctor - Delete by entity
				 
					/*
					 * Doctor doctor = new Doctor();
					 * 
					 * doctor.setDoctorId(16);
					 * 
					 * doctor.setDoctorName("Yogesh");
					 * 
					 * 
					 * String msg = doctorservice.deleteDoctor(doctor);
					 * 
					 * System.out.println(msg);
					 */
			
				 
				 //Doctors -> Delete All Doctors::
				 
				 
					/*
					 * String msg = doctorservice.removeAllDoctors();
					 * 
					 * System.out.println(msg);
					 */
				 
				 //DeleteDoctors  By Ids -deleteByIds
					
					/*
					 * String msg = doctorservice.removeDoctorsByIds(List.of(21));
					 * 
					 * System.out.println(msg);
					 */
					 
				 
				 
				 //Delete Doctors By Entities.
				 
				 Doctor d1 = new Doctor();
				 
				 d1.setDoctorId(22);
				 d1.setDoctorName("Yogesh");
				 
				 String msg = doctorservice.removeAllDoctors(List.of(d1));
				 
				 System.out.println(msg);
				 
			
			 
		
			
		
			
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
