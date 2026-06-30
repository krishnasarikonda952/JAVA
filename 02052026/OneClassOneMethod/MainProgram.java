class MainProgram{
	public static void main(String[] args){
		Addition addObj=new Addition();
		addObj.takeInput();
		addObj.add();
		
		Division divObj=new Division();
		divObj.takeInput();
		divObj.divide();
		
		Subtraction subObj=new Subtraction();
		subObj.takeInput();
		subObj.subtract();
		
		Multiplication mulObj=new Multiplication();
		mulObj.takeInput();
		mulObj.multiply();
		
	}
}