package com.yogibaba.dao;



import org.springframework.data.repository.CrudRepository;

import com.yogibaba.model.Doctor;


public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {

}
