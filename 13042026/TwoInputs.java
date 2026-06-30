import java.util.Scanner;
public class TwoInputs{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int n2=sc.nextInt();
		
		System.out.println("Addition of Two Numbers: "+(n1+n2));
		System.out.println("Substraction of Two Numbers: "+(n1-n2));
		System.out.println("Multiplication of Two Numbers: "+(n1*n2));
		System.out.println("Division of Two Numbers: "+(n1/n2));
		sc.close();
	}
}