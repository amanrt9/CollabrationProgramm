package chetan;

public class Printinitialfromstring {

	public static void main(String[] args) {
		//output QA
		String a="Quality Chetan Assurance";
		String res="";
		String [] words=a.split(" ");
		for(String x:words)
		{
			res=res+x.charAt(0);
		}
		System.out.println(res);
	   	
	}
}
