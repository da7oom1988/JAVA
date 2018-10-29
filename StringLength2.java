import java.util.* ;
  
public class StringLength2 {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args){
	
	System.out.println("Enter a String");
        
	String name = sc.next();
	String newName = name.substring(0 ,1).toUpperCase().concat(name.substring(1));
	
	System.out.println("the Formated String is: " + newName + "\nand the Length is: " + name.length() );

        }


}
