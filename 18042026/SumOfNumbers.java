import java.util.Scanner;

class SumOfNumbers{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the values: ");
	int n=scanner.nextInt();
	int[] numbers=new int[n];
	int sum=0;
	
	for(int i=0;i<numbers.length;i++){
		sum=sum+numbers[i];
	}
	System.out.println(numbers);
	
	}
}