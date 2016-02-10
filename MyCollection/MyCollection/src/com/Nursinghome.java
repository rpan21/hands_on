package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.print.Doc;

import co.training.utils.MyComparators;

public class Nursinghome //implements Comparator<Doctor>
{
	
	
//Creating type safe Ordered Collection
	private ArrayList<Doctor> docList;
	
	public Nursinghome()
	{
		docList = new ArrayList<Doctor>();
	}
	
	public boolean addDoctor(Doctor doc)
	{
		
		
		
		boolean result=docList.add(doc);
	
		return result;
	}
	
	public void printDoctorList()
	{
		for(Doctor doc:docList)
		{
			System.out.println(doc);
			
			System.out.println("appointments:");
			
			for(Patient pat:doc.getPatients())
			{
				System.out.println(pat);
			
				
			}
		}
	}
	
	public void printSort()
	{
		Collections.sort(docList);
		//Reusing Print Function - OOP Concept
		printDoctorList();
	}
	
	public void printSort(int key)
	{
		MyComparators comp=new MyComparators();
		switch(key)
		{
		case 1:
			printSort();
			break;
		case 2:
			
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList, comp1);
			printDoctorList();
			break;
		case 3:
			
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(docList, comp2);
			printDoctorList();
			break;
			default:
				break;
		}
	}
	
}
