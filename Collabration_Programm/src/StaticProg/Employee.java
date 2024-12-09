package StaticProg;

public class Employee {
	
		public static void main(String[] args) {

			StaticVariable s1=new StaticVariable();

			s1.empID=101;
			s1.empName="Elon";
			s1.ceo="Ratan Tata";

			StaticVariable s2=new StaticVariable();

			s2.empID=201;
			s2.empName="Mark";
			s2.ceo="Ratan Tata";

			StaticVariable s3=new StaticVariable();

			s3.empID=301;
			s3.empName="Rohit";
			s3.ceo="Jamshedji Tata";	
			
			s1.empInfo();
			s2.empInfo();
			s3.empInfo();
		}

	}


