package TypeCasting;

public class Aman {

	public static void main(String[] args) {		

		Animal r=new Animal();
		r.eat();


		Cat c=new Cat();
		c.eat();
		c.meow();

		Animal x=new Cat();// up casting or widening or implicit casting
		x.eat(); 
		x.ani();// here child class method is called because here object is of child class that is cat
        
		Cat t=(Cat)x;	//Down casting or narrowing or explicit casting
	
		t.ani();
		t.eat();
		t.work();
		t.meow();

	}

}
