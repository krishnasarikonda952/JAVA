import java.util.Scanner;

class Registration{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the student details...... ");
		System.out.print("Enter Register Number: ");
		String regNo=scanner.next();
		System.out.print("Enter First Name: ");
		String firstName=scanner.next();
		System.out.print("Enter Last Name: ");
		String lastName=scanner.next();
		System.out.print("Enter Date Of Birth (dd-mm-yyyy) : ");
		String dob=scanner.next();
		
		System.out.println();
		System.out.println("Entered Data: ");
		System.out.println("Student Registration Code: "+regNo);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Date of Birth: "+dob);
		
		System.out.println();
		System.out.println("Data Successfully Saved.........");
		
		scanner.close();
	}
}