package com;

public class Patient implements Comparable<Patient>{
private String patientsName;
private long patientsId;

public String getPatientsName() {
	return patientsName;
}
public void setPatientsName(String patientsName) {
	this.patientsName = patientsName;
}
public long getPatientsId() {
	return patientsId;
}
public void setPatientsId(long patientsId) {
	this.patientsId = patientsId;
}
public Patient(String patientsName, long patientsId) {
	super();
	this.patientsName = patientsName;
	this.patientsId = patientsId;
}
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Patient [patientsName=" + patientsName + ", patientsId=" + patientsId + "]";
}
public int compareTo(Patient o) {
	
	if(patientsId> o.patientsId)return -1;
	if(patientsId< o.patientsId)return  1;
	return 0;
}



}
