import java.util.Scanner;

class CountProgram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>0){
				count++;
			}
		}
		System.out.println("Count: "+count);
	}
}