import mathematics.Multiplication;
import mathematics.Addition;
import banking.Account;
import banking.Transaction;
import ecommerce.Product;
import ecommerce.Orders;


class MainProgram{
	public static void main(String[] args){
		Addition a=new Addition();
		Multiplication mulObject=new Multiplication();
		Account acc=new Account();
		Transaction trans=new Transaction();
		Product prod=new Product();
		Orders o=new Orders();
		
		add.operations1();
		add.operations2();
		
		mul.operations1();
		mul.operations2();
		
		acc.operations1();
		acc.operations2();
		
		trans.operations1();
		trans.operations2();
		
		prod.operations1();
		prod.operations2();
		
		ord.operations1();
		ord.operations2();
	}
}