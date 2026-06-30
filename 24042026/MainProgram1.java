import java.util.Scanner;

class MainProgram1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
	
		for(int i=1;i<=3;i++){
			System.out.println("---Department " +i+ " Details---");
			System.out.print("Enter Department Code: ");
			String departmentCode=sc.next();
			System.out.print("Enter Department Name: ");
			String departmentName=sc.next();
			System.out.println("Department Code: "+departmentCode);
			System.out.println("Department Name: "+departmentName);
		
			for(int j=1;j<=2;j++){
				System.out.println("--Employee " +j+ " Details--");
				System.out.print("Enter Employee ID: ");
				String employeeId=sc.next();
				System.out.print("Enter First Name: ");
				String firstName=sc.next();
				System.out.print("Enter Last Name: ");
				String lastName=sc.next();
				System.out.print("Enter Date of Joining: ");
				String dateofJoin=sc.next();
				System.out.println();
				System.out.println("Employee ID: "+employeeId);
				System.out.println("First Name"+firstName);
				System.out.println("Last Name: "+lastName);
				System.out.println("Date of Joining: "+dateofJoin);
			}
		}
		
	}
}