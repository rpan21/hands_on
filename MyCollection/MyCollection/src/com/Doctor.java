package com;

import java.util.TreeSet;

public class Doctor implements Comparable<Doctor> {

	
	private long doctor_Id;
	private String doctor_Name;
	private String specialization;
	private TreeSet<Patient> patients;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long doctor_Id, String doctor_Name, String specialization) {
		super();
		this.doctor_Id = doctor_Id;
		this.doctor_Name = doctor_Name;
		this.specialization = specialization;
	}

	

	@Override
	public String toString() {
		return "Doctor [doctor_Id=" + doctor_Id + ", doctor_Name=" + doctor_Name + ", specialization=" + specialization
				+ "]";
	}

	public long getDoctor_Id() {
		return doctor_Id;
	}

	public void setDoctor_Id(long doctor_Id) {
		this.doctor_Id = doctor_Id;
	}

	public String getDoctor_Name() {
		return doctor_Name;
	}

	public void setDoctor_Name(String doctor_Name) {
		this.doctor_Name = doctor_Name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public int compareTo(Doctor o) {
		
		if(doctor_Id> o.doctor_Id)return -1;
		if(doctor_Id< o.doctor_Id)return  1;
		return 0;
	}
	
	public TreeSet<Patient> getPatients() {
		return patients;
	}

	public void setPatients(TreeSet<Patient> patients) {
		this.patients = patients;
	}
	
}
