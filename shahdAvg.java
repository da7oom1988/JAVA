import java.util.*;

public class shahdAvg{

	public static void main(String[] arg){


		Scanner sc = new Scanner(System.in);
		int total = 0 , avg = 1 ;
		for(int i = 1 ; avg < 50 ; i++){
			int num = sc.nextInt();
			total += num;
			avg = total/i;
			System.out.println(avg);
		}	
	}
} 
