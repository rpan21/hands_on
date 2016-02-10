package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class NursingApplication  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Doctor doc1 = new Doctor(101, "raj", "dental");
Doctor doc2 = new Doctor(102, "suraj", "dental");
Doctor doc3 = new Doctor(103, "abhinav", "neuro");
Doctor doc4 = new Doctor(104, "vikash", "general");

Nursinghome nursing = new Nursinghome();
nursing.addDoctor(doc1);
nursing.addDoctor(doc4);
nursing.addDoctor(doc2);
nursing.addDoctor(doc3);

//nursing.printDoctorList();
//System.out.println("\n\n The sorted List: \n");
//nursing.printSort();
//nursing.compare(doc1, doc2);
//nursing.printDoctorList();

//System.out.println("\n\n The sorted List: \n");
//nursing.printSort(3);


Patient pat1 = new Patient("ajit", 2098);
Patient pat2 = new Patient("vishwajit", 2398);
Patient pat3 = new Patient("manajit", 4309);

	//HashSet is not ordered in any way so comparators not required
//HashSet<Patient> patients = new HashSet<Patient>();
TreeSet<Patient> patients = new TreeSet<Patient>();
patients.add(pat1);
patients.add(pat2);
patients.add(pat3);
System.err.println(patients.add(pat3));
doc1.setPatients(patients);
doc2.setPatients(patients);
doc3.setPatients(patients);
doc4.setPatients(patients);
nursing.printDoctorList();


	}
	
	

}
