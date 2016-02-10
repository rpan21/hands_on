package com;
import java.io.*;
public class BookSerializer {

	public String serialize(Book obj)
	{
		String message=null;
		ObjectOutputStream out=null;
		try
		{
			    out =new ObjectOutputStream(new FileOutputStream(new File("Book.Ser")));
			out.writeObject(obj);
			message= "Serialization Complete";
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				out.close();
				
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		return message;
		
	}
	
	public Object deSerialize()
	{
		Object obj=null;
		//ObjectInputStream oin = null;
		
		try
		(
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("Book.Ser"))))
		{
			obj = oin.readObject();
		}
				catch(IOException|ClassNotFoundException e)
		{
				System.out.println(e.getMessage());	
		}
				
		
		return obj;
	}
}
