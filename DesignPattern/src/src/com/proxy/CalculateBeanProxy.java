package src.com.proxy;

public class CalculateBeanProxy implements CalculateBean {

	@Override
	public double farenToCelsius(double faren) {
		// TODO Auto-generated method stub
		CalculateBeanImpl imp = new CalculateBeanImpl();
		
		
		return imp.farenToCelsius(faren);
	}

}
