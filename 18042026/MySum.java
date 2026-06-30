import java.util.Scanner;

class MySum{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		int result=0; 
		
		for(int i=1;i<=n;i++){
			System.out.println("Enter number "  +i+": ");
			int inputNum=scanner.nextInt();
			
			result=result+inputNum;
			
		}
		System.out.println("Sum of input numbers: "+ result);
	
	}
}