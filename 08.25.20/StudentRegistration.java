import java.util.Scanner;

public class StudentRegistration{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the student registration ");
	System.out.println("Enter your First Name: ");
	String firstName = sc.nextLine(); 
	System.out.println("Your first name is: " + firstName);
	System.out.println("Enter your City: ");
	String city = sc.nextLine(); 
	System.out.println("Your city is: " + city);
	System.out.println("Enter your roll number: ");
	int roll = sc.nextInt(); 
	System.out.println("Your roll number is: " + roll);
		
	

	}
}