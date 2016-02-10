package com;

import java.io.IOException;
import java.io.WriteAbortedException;

public class Application2 {

	public static void main(String[] args) throws IOException {
	Book[] ob = new Book[3];
		ob[0] = new Book(10102, "Venice Tours", "alfred brandy", 209.50);
		ob[1] = new Book(10202, "lenice Tours", "alfred brandy", 409.50);
		ob[2] = new Book(10302, "menice Tours", "alfred brandy", 709.50);
		
		BookManager bkm = new BookManager();
		
		bkm.addBooks(ob);
		bkm.printBooks();
		

	}

}
