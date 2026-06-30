import java.util.Scanner;

class RegArray{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the student details...... ");
		
		String[] studentName=new String[4];
		
		System.out.print("Enter Register Number: ");
		studentName[0]=scanner.next();
		System.out.print("Enter First Name: ");
		studentName[1]=scanner.next();
		System.out.print("Enter Last Name: ");
		studentName[2]=scanner.next();
		System.out.print("Enter Date Of Birth (dd-mm-yyyy) : ");
		studentName[3]=scanner.next();
		
		System.out.println();
		System.out.println("Entered Student Details............... ");
		
		//String regNo=studentName[0];
		//System.out.println("Registration Number "+regNo); 
		
		System.out.println("Student Registration Code: "+studentName[0]);
		System.out.println("First Name: "+studentName[1]);
		System.out.println("Last Name: "+studentName[2]);
		System.out.println("Date of Birth: "+studentName[3]);
		
		System.out.println();
		System.out.println("Data Successfully Saved.........");
		
		scanner.close();
	}
}