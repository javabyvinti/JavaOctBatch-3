import java.util.Scanner;

class UserInput{


	public static void main(String args[])
	{
		//Scanner --> Predefined 
 
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your value" );
	int value = scanner.nextInt();
	
	System.out.println("Enter another value");
	
	int value2 = scanner.nextInt();

System.out.println("Your value is= " + value + " " + value2 + "\n");	

	}

}