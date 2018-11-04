import java.util.*;

public class avg{

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
	
		int count = 0;
		double avg, maxAvg, total = 0;
		
		System.out.println("Enter max avg");
               	maxAvg  = sc.nextDouble();


		do{
			System.out.println("Enter number");
			int num = sc.nextInt();
			total += num;
			count++;
			avg = total / count;
			System.out.println("avg: " + avg);
			if(avg >= maxAvg) break;
		}while(true);


	}


}
