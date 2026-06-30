import java.util.Scanner;

class Subtraction{
	int firstNum;
	int secondNum;
	
	void subtract(){
		int result=firstNum-secondNum;
		
		System.out.println(result);
	}
	
	void takeInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		firstNum=sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		secondNum=sc.nextInt();
	}
}