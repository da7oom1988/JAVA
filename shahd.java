import java.util.*;

public class shahd {

	public static void main(String[] args){

		int Fprice = 100;
		int Bprice = 75;
		int Cprice = 50;

		int F;
		int B;
		int C;

		int totalPassengers;
		double total;

		double percentB;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the number of F class");
		F = sc.nextInt();

		System.out.println("Please Enter the number of B class");
                B = sc.nextInt();

		System.out.println("Please Enter the number of C class");
                C = sc.nextInt();

		totalPassengers = F + B + C;
		total = (F*Fprice) + (B*Bprice) + (C*Cprice);
		
		System.out.println("The coust is " + total);
		
		percentB = (B / (double)(totalPassengers) ) * 100;
		System.out.println("B: " + percentB + " %");
  
	}


} 
