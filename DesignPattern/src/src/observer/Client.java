package src.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MealOrder meal = new MealOrder();
    meal.addObserver(new Waiter());
    meal.setStatus("Accepted");
    try {
		Thread.sleep(1000, 121);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    meal.setStatus("Completed");
	}

}
