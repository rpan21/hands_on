package com.src;

import java.util.*;

public class TranslateService {

	private Hashtable<String, String> hindiToEnglish;
	
	public TranslateService()
	{
		hindiToEnglish= new Hashtable<String,String>();
		init();
	}
	
	
	public void printWords()
	{
	
		Set<Map.Entry<String,String>> list =hindiToEnglish.entrySet();
		
		for(Map.Entry<String,String> words:list)
		{
			System.out.println(words.getKey() +" := "+ words.getValue());
		}
	}
	public void init()
	{

		hindiToEnglish.put("dil", "heart");
		hindiToEnglish.put("pyaar", "love");
		hindiToEnglish.put("tufaan", "storm");
		hindiToEnglish.put("dard", "pain");
		hindiToEnglish.put("kukkur", "dog");
		
		
		
		
	}
	public String findEnglishWord(String hindiWord)
	{
		
		
		if(hindiToEnglish.get(hindiWord)==null)
			return "Sorry word not found";
		else
			return hindiToEnglish.get(hindiWord);
	}
	
	
	
	
}
