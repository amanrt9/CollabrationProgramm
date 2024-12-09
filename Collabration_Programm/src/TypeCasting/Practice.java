package TypeCasting;

public class Practice {

	public static void main(String[] args)
    {
		 //4byte    long =8byte(non decimal) double = 8byte(decimal) float =4byyte(decimal)
		short b=30;
		
		int x=b; //upcasting or widening or implicit here is no chance of data loss
		System.out.println(x);
		
	  int a=32;
	  short s=(short)a;// downcasting or narrowing or explicite casting here are chnaces of data loss
	System.out.println(s);
		
	float f= 40.1f; //4byyte
	 double d=f;//upcasting or wideing or implicite 
	 System.out.println(d);
	 
	 double x1=400.44d;//8 byte
	 float g=(float)d;//downcasting or narrowing or explicite casting here are chnaces of data loss
	 System.out.println(g);
	 
	 char c='a';
	 int e=c;
	 System.out.println(e);
	 
	 long l=2147483647;//8byte
	 int h=(int)l;
	 System.out.println(h);
	 
	 float f1=400.55f;
	 int g1=(int)f1;
	 System.out.println(g1);
	 
	 
	 
	 byte b1= 10;//1 byte
	 int i1=b1; //4 byte  // up casting or implicit casting or widening
	 System.out.println(i1);
	 
	 int i2=30;// 4byte
	 byte b2=(byte)i2;// 1byte downcasting or explicite or norrowing
		System.out.println(b2);
		
		float f30=40.33f;
		int i3=(int)f30;
		System.out.println(i3);//downcasting
		
		
	}

}
