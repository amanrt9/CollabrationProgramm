package TypeCasting;

public class Cat extends Animal
{
	public void eat() 
	{
     System.out.println("from child");
	}

	public void meow()
	{
		System.out.println("I am Cat");
		
	}
	
	public void work()
	{	
		super.eat();
	}

}
