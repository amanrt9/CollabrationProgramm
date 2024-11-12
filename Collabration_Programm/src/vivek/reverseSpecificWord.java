package vivek;

public class reverseSpecificWord {
	public static void main(String[] args)
	{
	   String s = "my name is vivek";
	   //op = ym eman si keviv
	   String [] wrds = s.split(" ");
	   
	   wrds[0] = new StringBuilder(wrds[0]).reverse().toString();
	   wrds[1] = new StringBuilder(wrds[1]).reverse().toString();
	   wrds[2] = new StringBuilder(wrds[2]).reverse().toString();
	   wrds[3] = new StringBuilder(wrds[3]).reverse().toString();
	   
	   String output = String.join(" ", wrds);

	   System.out.println();
	}
}
