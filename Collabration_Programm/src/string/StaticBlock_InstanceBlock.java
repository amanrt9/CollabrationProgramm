package string;

public class StaticBlock_InstanceBlock
{
    static 
    {
    	System.out.println("Im from static block");
    	
    }
    
    //instance Block
    {
    	System.out.println("im instance block ");
    }
	public static void main(String[] args)
	{
        System.out.println("im from main method");
        
        StaticBlock_InstanceBlock f=new StaticBlock_InstanceBlock();
        StaticBlock_InstanceBlock h=new StaticBlock_InstanceBlock();
	}

}
