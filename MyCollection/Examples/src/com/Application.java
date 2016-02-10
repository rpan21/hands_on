package com;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookSerializer obj = new BookSerializer();
		Book ob = new Book(10202, "Venice Tours", "alfred brandy", 409.50);
		
	
//		System.out.println(obj.serialize(ob));
//		System.out.println(obj);
//		Book ob1 = new Book1(102021, "Venice Tours", "alfred brandy", 409.50);
		
		 ob = (Book) obj.deSerialize();
	    System.out.println("\nAfter Deserialize:\n\n"+ob);
		
	}

}
