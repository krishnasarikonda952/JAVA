import java.util.Scanner;

class MathOperations{
		int fNum,sNum;
		int result;
		
		void takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		fNum=sc.nextInt();
		System.out.print("Enter Second Number: ");
		sNum=sc.nextInt();
		}
		
		void add(){
			result=fNum+sNum;
		}
		
		void divide(){
			result=fNum/sNum;
		}
		
		void subtract(){
			result=fNum-sNum;
		}
		
		void multiply(){
			result=fNum*sNum;
		}
		
		
		void display(){
			System.out.println(result);
		}
}