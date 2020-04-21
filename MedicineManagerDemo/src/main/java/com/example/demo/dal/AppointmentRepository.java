package com.example.demo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Medicine;
import com.example.demo.model.userAppointment;
import com.example.demo.model.user.Patient;

public interface AppointmentRepository  extends JpaRepository<userAppointment, Integer>{

	
}
