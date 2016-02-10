
public class Book extends Media {
	
protected double ISBN_No;
protected String author;
protected double reading_hours;

public Book(String title, double price, String subject, int rating, double lending_length, double iSBN_No,
		String author, double reading_hours) {
	super(title, price, subject, rating, lending_length);
	ISBN_No = iSBN_No;
	this.author = author;
	this.reading_hours = reading_hours;
}
public Book(String title, double price, String subject, int rating, double lending_length) {
	super(title, price, subject, rating, lending_length);
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [ISBN_No=" + ISBN_No + ", author=" + author + ", reading_hours=" + reading_hours + ", title=" + title
			+ ", price=" + price + ", subject=" + subject + ", rating=" + rating + ", lending_length=" + lending_length
			+ "]";
}







}
