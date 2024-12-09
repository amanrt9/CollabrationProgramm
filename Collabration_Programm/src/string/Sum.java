package string;


public class Sum { 
	
	public void shape(int x, int y)
	{ 
		int f=x * y; 
		System.out.println(f +" it is square");
	} 

	public void shape (int x, int y, int z) 
	{ 
		int f=x*y*z; 
		System.out.println(f +" it is cube");
		
	} 
	public void shape(double x, double y) 
	{ 
		double f= (x*y*3);
		System.out.println(f +" it is circle");
		
	} 

	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		s.shape(10, 10);
		s.shape(10, 20, 30);
		s.shape(10.5, 20.5);
		
	} 
}

// In mthod overloading method name should be same
// and we do method overloading in same class
//no of parametr is diff
//if no of paramter is same then return type should be diff 
//if return type is same then no of paramenter is diff
// With same method we can perfome diff operations
