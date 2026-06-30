import java.util.Scanner;

class MainProgram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName=sc.next();
		System.out.print("Enter your last name: ");
		String lastName=sc.next();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Thank you for providing details.");
		System.out.println("Here are the details provide by you:");
		System.out.println("Your First Name: "+firstName);
		System.out.println("Your Last Name: "+lastName);
		System.out.println("Your Age: "+age);
		
		sc.close();
		
	}
}