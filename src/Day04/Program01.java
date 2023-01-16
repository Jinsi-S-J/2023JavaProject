package Day04;

public class Program01 {

	public static void main(String[] args) 
	{
		// logical Operators //,&&,!
		
		int a=100;
		int b= 245;
		int c= 100;
		System.out.println(a>b && a>c);
		System.out.println(a==c && c<b);
		System.out.println(a==c || c<b);
		System.out.println(!(a==c || c<b));
	}

}
