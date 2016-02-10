package co.training.utils;

import java.util.Comparator;

import com.Doctor;

public class MyComparators {

	
	public class NameComparator implements Comparator<Doctor>
	{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			//String class already implements comparable
			//Doctor class is encapsulated hence using getter method
			return (o1.getDoctor_Name().compareTo(o2.getDoctor_Name()));
			
		}
		
	}
	
	public class SpecializationComparator implements Comparator<Doctor>
	{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			return (o1.getSpecialization().compareTo(o2.getSpecialization()));
		}
		
	}
	
}
