package Day04;

public class Program02 {

	public static void main(String[] args)
	{
		//Returning a value from a method
		int x=addFunction(225,325);
		System.out.println(2*x);
		System.out.println(x*x);
		int y=diff(950,400);
		System.out.println(2*y);
	}
	
	public static int addFunction(int a,int b)
	{
		return(a+b);
	}
	public static int diff(int c,int d)
	{
		return(c-d);
	
}
}
