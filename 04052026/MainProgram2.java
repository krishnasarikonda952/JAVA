import java.util.Scanner;

class MainProgram2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Multiplication mul=new Multiplication();
		System.out.print("Multiplication of two numbers: ");
		mul.mul2Numbers(a, b);
		System.out.print("Multiplication of three numbers: ");
		mul.mul3Numbers(a, b, c);
	}
}