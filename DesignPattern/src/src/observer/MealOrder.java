package src.observer;

import java.util.Observable;
import java.util.Observer;

public class MealOrder extends Observable {

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		setChanged();
		notifyObservers(status);
	}

	public MealOrder(String status) {
		super();
		this.status = status;
	}

	public MealOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
