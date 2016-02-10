package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class BookManager {

	public String addBooks(Book[] bks)
	{
		
		//PrintWriter out = new PrintWriter(new FileWriter(new File("BookRecords.txt")));
		PrintWriter obj=null;
		try {
			obj = new PrintWriter(new FileWriter(new File("BookRecords1.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Book book:bks)
		{
		obj.println(book.toString());
		System.out.println("books added");
		
		}
		
		obj.close();
     return null;
		 
	}
	
	public void printBooks()
	{
		FileReader fr=null;
		try {
			fr = new  FileReader("BookRecords1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while((line=br.readLine())!=null)
			{
				System.err.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
