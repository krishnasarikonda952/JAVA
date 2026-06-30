import java.util.Scanner;

class Operation{
	int dayNum;
	String dayName;
	
	void takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Day Number: ");
		dayNum=sc.nextInt();
	}
	
	/*void findDay(){
	if(dayNum==1){
		dayName="Monday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else if (dayNum==2){
		dayName="Tuesday";
	} else{
		System.out.println("Invalid Day Number");
	}
	}*/
	void findDay(){
		switch (dayNum){
			case 1:
				dayName="Monday";
				break;
			case 2:
				dayName="Monday";
				break;
			case 3:
				dayName="Monday";
				break;
			case 4:
				dayName="Monday";
				break;
			case 5:
				dayName="Monday";
				break;
			case 6:
				dayName="Monday";
				break;
			case 7:
				dayName="Monday";
				break;
			default:
				dayName="Invalid day number.";
				break;
		}
	}
		
	void print(){
		System.out.println("Day: "+dayNum);
		System.out.println("Day Name: "+dayName);
	}
}
	
	
	