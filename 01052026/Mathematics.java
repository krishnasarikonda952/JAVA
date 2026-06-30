import java.util.Scanner;

class Mathematics{
	int firstNumber;
	int secondNumber;
	
	void add(){
		int result=firstNumber+secondNumber;
		
		System.out.println("Addition of Two Numbers: "+result);
	}
	
	void subtract(){
		int result=firstNumber-secondNumber;
		
		System.out.println("Subtraction of Two Numbers: "+result);
	}
	
	void divide(){
		int result=firstNumber/secondNumber;
		
		System.out.println("Division of Two Numbers: "+result);
	}
	
	void multiply(){
		int result=firstNumber*secondNumber;
		
		System.out.println("Multiplication of Two Numbers: "+result);
	}
	
	void takeInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		firstNumber=sc.nextInt();
		System.out.print("Enter Second Number: ");
		secondNumber=sc.nextInt();
		
		sc.close();
	}
}