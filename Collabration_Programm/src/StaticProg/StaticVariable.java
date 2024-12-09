package StaticProg;

public class StaticVariable {

		public int empID;
		public String empName;	
		static String ceo;
		
		public void empInfo() 
		{
			System.out.println(empID+" "+ empName+" "+ceo);
		}
}
