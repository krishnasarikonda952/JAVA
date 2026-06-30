import java.util.Scanner;

public class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Byte Number: ");
		byte b1=sc.nextByte();
		System.out.println("Enter a short Number: ");
		short s1=sc.nextShort();
		System.out.println("Enter a Int Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter a Long Number: ");
		long l1=sc.nextLong();
		
		//int n2=n1;
		//System.out.println(n2);
		byte num= (byte) n1;
		short num1= (short) l1;
		
		System.out.println("Int to byte: "+num);
		System.out.println("Long to short: "+num1);
		
		
	}
}
	