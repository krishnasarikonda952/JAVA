import java.util.Scanner;

class MainProgram1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int noofStudents=sc.nextInt();
		
		int[][] marksArr=new int[noofStudents][5];
		
		for(int i=0;i<noofStudents;i++){	
			System.out.print("Enter student Roll Number: ");
			int rollNumber=sc.nextInt();
			
			//marksArr[i][0]=rollNumber;
			
			System.out.print("Enter the number of subjects: ");
			int noofSubjects=sc.nextInt();
			
			for(int j=0;j<noofSubjects;j++){
				System.out.print("Enter Subject Code[1-5]: ");
				int subjectCode=sc.nextInt();
				System.out.print("Enter Subject Marks: ");
				int subjectMarks=sc.nextInt();
				
				marksArr[i][subjectCode]=subjectMarks;
			}
			System.out.println("Done saving student data.");
		}
		System.out.println();
		
		System.out.println("Subject1\tSubject2\tSubject3\tSubject4\tSubject5");
		for(int i=0;i<marksArr.length;i++){
			for(int j=0;j<marksArr[i].length;j++){
				int data=marksArr[i][j];
				
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}
}