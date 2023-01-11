package Day01;

public class Program01 {
	byte a=-128;
	short b= 32767;
	int c=1234567;
	long d=67890898l;
	boolean x=true;
	char y='1';
	float ab=0.1f;
	double bc=0.1d;

	public static void main(String[] args) {
		System.out.println("January 9 Class");
		sum ();
		Program01 abc= new Program01();
		abc.Diff();
		System.out.println(abc.c);
		System.out.println(abc.ab);

	}
	public static void sum () 
	{
		System.out.println("The sum of two integers");
	}
	public void Diff() 
	{
		System.out.println("The difference of two Integers");
	}
	}


