import java.util.* ;

public class StringLength {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
	
	String name , newName , capFirst ;
	String firstLetter , restOfName ;
	int nameLength ;

	System.out.println("Enter a String");
	name = sc.next();
	firstLetter = name.substring(0 ,1);
	restOfName = name.substring(1);
	capFirst = firstLetter.toUpperCase();
	newName = capFirst.concat(restOfName);
	nameLength = name.length();
	
	System.out.println("the Formated String is: " + newName + "\nand the Length is: " + nameLength );	
	

	}


}



