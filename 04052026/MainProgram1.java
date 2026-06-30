import java.util.Scanner;

class MainProgram1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Addition addition=new Addition();
		System.out.print("Addition of two numbers: ");
		addition.add2Numbers(a, b);
		System.out.print("Addition of three numbers: ");
		addition.add3Numbers(a, b, c);
	}
}