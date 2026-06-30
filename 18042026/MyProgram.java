import java.util.Scanner;

class MyProgram{
	public static void main(String[] args){
		String monthName="November";
		
		switch (monthName) {
			case "January","March","May","July","August","October","December" -> System.out.println("Its a month of 31 days");
			case "April","June","September","November" -> System.out.println("Its a month of 30 days");
			case "February" -> System.out.println("Its a month of 28/29 days");
			default -> System.out.println("Invalid Month Name");
		}
		
		
		
		
		
		
		/*int num1=10;
		int num2=2;
		int result=0;
		char operationCode='s';
		
		result = switch (operationCode){
			case 'a' -> (num1+num2);
			case 'd' -> (num1/num2);
			case 's' -> (num1-num2);
			case 'm' -> (num1*num2);
			default -> 0;
		};*/
		
		/*switch (operationCode){
			case 'a':
				result=num1+num2;
				break;
			case 'd':
				result=num1/num2;
				break;
			case 's':
				result=num1-num2;
				break;
			case 'm':
				result=num1*num2;
		}*/
		
		//System.out.println(result);
		
		//int num=3;
		
		/*switch(num){
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.out.println("case 5");
				
		}*/
		
		
		//Arrow Operator(->)
		
		/*switch(num){
			//Switch Expression.
			case 1 -> System.out.println("case 1");
			case 2 -> System.out.println("case 2");
			case 3 -> System.out.println("case 3");
			case 4 -> System.out.println("case 4");
			case 5 -> System.out.println("case 5");	
		}*/
		
		/*switch(num){
			case 1 -> {
				System.out.print("case ");
				System.out.println("1");
			}
			case 2 -> {
				System.out.print("case ");
				System.out.println("2");
			}
			case 3 -> {
				System.out.print("case ");
				System.out.println("3");
			}
			case 4 -> {
				System.out.print("case ");
				System.out.println("4");
			}
			case 5 -> {
				System.out.print("case ");
				System.out.println("5");
			}
				
		}*/
		
		
	}
}