package com.example.demo.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appointment;
import com.example.demo.model.user.Patient;

public interface AppointmentRepository  extends JpaRepository<Appointment, Integer>{

	List<Appointment> findByAppointmentPatient(Patient p);
	List<Appointment> findByAppointmentPatientPatientID(int patientID);
	
	
}
