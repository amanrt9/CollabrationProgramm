package vivek;

public class RemoveSpecialChar
{
public static void main(String[] args) {
	String s = "this is @ me";
    //op=this is me
	
	String str= s.replaceAll("\\W ","");
	System.out.println(str);
	
	String str2=s.replaceAll("\\w", "");
	System.out.println(str2);
	
	
}
}
