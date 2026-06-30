package program;

import animal.Dog;
import animal.Tiger;
import bird.Sparrow;
import bird.Crow;

/*import animal.*;
import bird.*;*/

public class MainProgram{
	public static void main(String[] args){
		Dog d=new Dog();
		Tiger t=new Tiger();
		Sparrow s=new Sparrow();
		Crow c=new Crow();
		
		d.bark();
		d.eat();
		
		t.roar();
		t.eat();
		
		s.chirp();
		s.swallow();
		
		c.caw();
		c.swallow();
	}
}
