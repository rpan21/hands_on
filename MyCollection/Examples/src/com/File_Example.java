package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Example {

	public static void main(String[] args) {
		
		File f =new File("Sample.txt");
		System.out.println("directory is\t:"+f.isDirectory());
		System.out.println("file present\t:"+f.isFile()+"\n\n");
		try{
			f.createNewFile();
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("After-------->\n");
		System.out.println("directory is\t:"+f.isDirectory());
		System.out.println("file present\t:"+f.isFile());
		
		PrintWriter writer;
		try{
			writer = new PrintWriter(f);
			writer.println("hello");
			writer.close();
			File dir =new File(".");
			dir.mkdir();
			System.out.println("directory is\t:"+dir.isDirectory());
		    String[] files = dir.list();
			File[] filelist = dir.listFiles();
			for(String str:files)
			{
				
			System.out.println(str);
			
			
			}
			for(File x:filelist)
			{
				System.out.println(x);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
