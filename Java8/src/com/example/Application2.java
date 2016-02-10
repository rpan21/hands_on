package com.example;
import java.io.File;

import com.example.Greeting2;
public class Application2 {

	public static void main(String[] args)
	{
		int x=0;
		Greeting2 app = (String[] msg)->
		{
			for(String  x2:msg )
			{
				System.out.println(x2);
			}
		};
		
		String[] msg = {"rahul","ajay","vikash"};
		app.display(msg);
		
		File file = new File("c:\\com1\\training1");
		file.mkdir();
		
	}
}
