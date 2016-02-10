
public class Media_Application {

	public static void main(String[] args) {
		Media[] media = new Media[4];
		//media[0] = new Book("Play the Game", 100.00, "history", 7.9, 4,1276Gh343, "william hellings", 89);
		media[0] = new Dvd("sherlock_holmes", 541.08, "Entertainment", 8, 6 , "NA", 2.6, "T-series");
		media[1] = new Periodicals("magazine 1", 18.00, "weekly", 5, 41, 3, "rahul", 51);
		
		System.out.println(media[0].toString());
		System.out.println(media[1].toString());
				
	}

}
