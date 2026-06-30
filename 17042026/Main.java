import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int EnterDay=sc.nextInt();
		WeekDays day=new WeekDays();
		
		if(EnterDay==1){
			day.Day1();
		}
		
		if(EnterDay==2){
			day.Day2();
		}
		
		if(EnterDay==3){
			day.Day3();
		}
		
		if(EnterDay==4){
			day.Day4();
		}
		
		if(EnterDay==5){
			day.Day5();
		}
		
		if(EnterDay==6){
			day.Day6();
		}
		
		if(EnterDay==7){
			day.Day7();
		}
		
		if(EnterDay>7){
			System.out.println("Invalid Day");
		}
	}
}