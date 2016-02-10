package examples;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String type;
		Scanner in = new Scanner(System.in);
		System.out.println("Select the type\n1.FAN \n2.AC");
		int typech=in.nextInt();
		if(typech==1) type="FAN"; 
    	if(typech==2) type="AC"; 
		System.out.println("please provide the Quantity : ");
		int quantity=in.nextInt();
		System.out.println("please provide the Lending length : ");
		int Lending_length=in.nextInt();
		Item obj;
		if(typech==1)
			{
			obj = new Fan( 122 ,quantity , Lending_length);
			
		   obj.calculate();
		    System.out.println(obj.toString());
			}
			if(typech==2)
			{
				obj = new Air_Conditioner(123 ,quantity , Lending_length);
		
			obj.calculate();
			System.out.println(obj.toString());
			}
		
//		Item[] obj = new Item[4];
//		obj[0] = new Fan(101, 4, 5);
//		obj[1] = new Air_Conditioner(102, 4, 2);
//		obj[2] = new Fan(103, 1, 5);
//		if(typech==1)
//		obj[3] = new Fan( 104 ,quantity , Lending_length);
//		if(typech==2)
//			obj[3] = new Air_Conditioner( 104 ,quantity , Lending_length);
//		
//		
//		
//		
//		while(true)
//		{
//		System.out.println("\n\nEnter the choice: \n (between 101-103");	
//		int choice = in.nextInt();
//		switch(choice)
//		{
//		case 101:
//			System.out.println(obj[0].calculate());
//			System.out.println(obj[0].toString());
//			break;
//		case 102:
//			System.out.println(obj[1].calculate());
//			System.out.println(obj[1].toString());
//			break;
//		case 103:
//			System.out.println(obj[2].calculate());
//			System.out.println(obj[2].toString());
//			break;
//			default:
//				System.err.println("serial number doesn't exist");
//				System.exit(0);
//				
//		}
//		
//		}
//		
//		
//		
		
		
		
	}

}
