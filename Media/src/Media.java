
public class Media {

	protected String title;
	
	
	protected double price;
	protected String subject;
	protected int rating;
	protected double lending_length;
	
	
	public Media(String title, double price, String subject, int rating , double lending_length) {
		super();
		this.title = title;
	
		
		this.price = price;
		this.subject = subject;
		this.rating = rating;
	    this.lending_length = lending_length;	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	


	public double getLending_length() {
		return lending_length;
	}

	public void setLending_length(double lending_length) {
		this.lending_length = lending_length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
}
