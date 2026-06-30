import java.util.Scanner;

class MainProgram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the department size:");
		int dSize=sc.nextInt();
		System.out.print("Enter the Number of Employees :");
		int eName=sc.nextInt();
		
		String[][] departments=new String[dsize][2];
		String[][] employees=new String[eName][5];
		
		int deptCount=0;
		int empCount=0;
		
		System.out.print("Do you want to Enter a new Record: ");
		String newRecord=sc.next();
		
		while(newRecord=="Yes" || newRecord="yes"){
			System.out.println("---Department " +i+ " Details---");
			System.out.print("Enter Department Code: ");
			String departmentCode=sc.next();
			System.out.print("Enter Department Name: ");
			String departmentName=sc.next();
			
			departments[deptCount][0]=departmentCode;
			departments[deptCount][0]=departmentName;
			
			System.out.print("Enter No. of Employees:");
			int emps=sc.nextInt();
			
			System.out.println("--Employee " +j+ " Details--");
			System.out.print("Enter Employee ID: ");
			String employeeId=sc.next();
			System.out.print("Enter First Name: ");
			String firstName=sc.next();
			System.out.print("Enter Last Name: ");
			String lastName=sc.next();
			System.out.print("Enter Date of Joining: ");
			String dateofJoin=sc.next();
				
			employees[j][0]=employeeId;
			employees[j][1]=firstName;
			employees[j][2]=lastName;
			employees[j][3]=dateofJoin;
			employees[j][4]=departmentCode;
		}
		System.out.println("Choose the Options 1.View all Departments 2.View all Employees 3.View all employees department-wise. ");	
		int n=sc.nextInt();
		switch(n){
			case 1:
				for(int k=0;k<
		}
		
	}
}