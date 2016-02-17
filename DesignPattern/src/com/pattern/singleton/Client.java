package com.pattern.singleton;

public class Client {

	public static void main(String[] args)
	{
		Counter count1 = Counter.getInstance();
		System.out.println(count1.hashCode() + " -- " + count1.getCountNo() + " object instance");
		Counter count2 = Counter.getInstance();
		System.out.println(count2.hashCode() + " -- " + count2.getCountNo() + " object instance");
		Counter count3 = Counter.getInstance();
		System.out.println(count3.hashCode() + " -- " + count3.getCountNo() + " object instance");
	}
}
