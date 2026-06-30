import java.util.Scanner;

class Main{
	public static void  main(String[] args){
		MathOperations op=new MathOperations();
		
		op.takeInput();
		
		op.add();
		op.display();
		
		op.divide();
		op.display();
		
		op.subtract();
		op.display();
		
		op.multiply();
		op.display();
	}
}