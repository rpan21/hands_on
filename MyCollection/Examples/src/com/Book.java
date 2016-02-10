package com;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 21L;
	private long bookNumber;
	private String bookName;
	private String author;
	private transient double price;
	
	public Book(long bookNumber, String bookName, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		System.out.println("Inside 0 argument Constructor");
		// TODO Auto-generated constructor stub
	}
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\t\t-----------------------Book-------------------------\n BookNumber=" + bookNumber + "\nBookName=" + bookName + "\nAuthor=" +author+ "\nPrice =" +price ;
	}
	
	
	
	

}
