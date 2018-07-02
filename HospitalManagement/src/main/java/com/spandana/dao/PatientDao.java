package com.spandana.dao;

import java.util.List;
import java.util.Map;

import com.spandana.model.Patient;

public interface PatientDao {
	public List<Patient> allPatients();
	public Patient createPatient(Patient patient);
	public void updatePatient(Patient patient);
	public void deletePatient(long id);
	public List<Map<String, Object>> searchPatientByName(String name);
	public Patient searchPatientById(long id);
}
