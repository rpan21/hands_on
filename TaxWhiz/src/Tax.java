
public class Tax 
{

	private double rate_sales_tax;
	
	public Tax()
	{
		this.rate_sales_tax = 0.14;
	}
	
	public Tax(double tax)
	{
		if(tax>0.20 || tax<0.1)
		{
			System.err.println("Please enter a tax in range 0.1-0.20");
			System.exit(0);
		}
		this.rate_sales_tax = tax;
	}
	
	public double calcTax(double purchase)
	{
	 return purchase*(this.rate_sales_tax);	
	}
}
