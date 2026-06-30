import java.util.Scanner;
class Practice{
	public static void main(String[] args){
		//Declaring Variables.
		int firstNum=0,secondNum=0,result=0;
		int operationCode=0;
		
		//Taking Inputs.
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Number: ");
		firstNum=sc.nextInt();
		System.out.println("Enter Second Number: ");
		secondNum=sc.nextInt();
		System.out.println("Choose Your Options 1/2/3/4 ");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		operationCode=sc.nextInt();
		
		//Performing Opertaions.
		if(operationCode==1){
			result=firstNum+secondNum;
			System.out.println("Addition result: "+result);
		}
		else if(operationCode==2){
			result=firstNum-secondNum;
			System.out.println("Substraction result: "+result);
		}
		else if(operationCode==3){
			result=firstNum*secondNum;
			System.out.println("Multipliation result: "+result);
		}
		else if(operationCode==4){
			result=firstNum/secondNum;
			System.out.println("Division result: "+result);
		}
		else{
			System.out.println("Invalid Number");
		}
		sc.close();
	}
} 