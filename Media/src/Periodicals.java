
public class Periodicals extends Book {

	private double periodicity_days;
	private double periodicity_hours;
	public Periodicals(String title, double price, String subject, int rating, double lending_length, double iSBN_No,
			String author, double reading_hours) {
		super(title, price, subject, rating, lending_length, iSBN_No, author, reading_hours);
		// TODO Auto-generated constructor stub
	}
	public Periodicals(String title, double price, String subject, int rating, double lending_length) {
		super(title, price, subject, rating, lending_length);
		// TODO Auto-generated constructor stub
	}
	public Periodicals(String title, double price, String subject, int rating, double lending_length, double iSBN_No,
			String author, double reading_hours, double periodicity_days, double periodicity_hours) {
		super(title, price, subject, rating, lending_length, iSBN_No, author, reading_hours);
		this.periodicity_days = periodicity_days;
		this.periodicity_hours = periodicity_hours;
	}
	@Override
	public String toString() {
		return "Periodicals [periodicity_days=" + periodicity_days + ", periodicity_hours=" + periodicity_hours
				+ ", ISBN_No=" + ISBN_No + ", author=" + author + ", reading_hours=" + reading_hours + ", title="
				+ title + ", price=" + price + ", subject=" + subject + ", rating=" + rating + ", lending_length="
				+ lending_length + "]\n";
	}
	


	
}
