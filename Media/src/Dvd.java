
public class Dvd extends Media {
	
	private String type;
	private double running_time;
	private String company;
	
	public Dvd(String title, double price, String subject, int rating, double lending_length) {
		super(title, price, subject, rating, lending_length);
		// TODO Auto-generated constructor stub
	}
	
	public Dvd(String title, double price, String subject, int rating, double lending_length, String type,
			double running_time, String company) {
		super(title, price, subject, rating, lending_length);
		this.type = type;
		this.running_time = running_time;
		this.company = company;
	}


	





	
	

}
