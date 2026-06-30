import java.util.Scanner;

class AccessingDepartment{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[][] departments=new String[3][2];
		String[][] employees=new String[6][5];
		
		LoopforDepartments:
		for(int i=0;i<3;i++){
			System.out.println("---Department " +i+ " Details---");
			System.out.print("Enter Department Code: ");
			String departmentCode=sc.next();
			System.out.print("Enter Department Name: ");
			String departmentName=sc.next();
			
			departments[i][0]=departmentCode;
			departments[i][1]=departmentName;
			
			
			
			LoopforEmployees:
			for(int j=0;j<2;j++){
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
			
		}
		
		System.out.println();
		System.out.println("-----Department Details-----");
		for(int k=0;k<3;k++){
			System.out.println("Department Code: " + departments[k][0] + "   Department Name: " + departments[k][1]);
		}
		
	}
}