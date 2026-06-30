import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result = 0;
		/*int result=(n*(n+1))/2;
		System.out.println(result);*/
		while(n>0){
			result += n;
			n--;
		}
		System.out.println(result);
	}
}