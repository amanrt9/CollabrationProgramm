package vivek;

public class NonrepeatedChar 
{
public static void main(String[] args) 
{
        String s = "aabbz bbaa";
        
        int[] nonrep = new int[256];
        
        for(int i=0; i<s.length(); i++)
        {
        	char c = s.charAt(i);
        	if(c !=' ')
        	{
        	nonrep[c]++;
        	}
        }
        
        for(int i=0; i<256; i++)
        {
        	if(nonrep[i]==1)
        	{
        		System.out.println("'"+(char)i+"'");
        	}
        }
 
}
}
