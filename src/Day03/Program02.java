package Day03;

public class Program02 {

	public static void main(String[] args) 
	{
		//COMPARATORS
		// <,>,<=,>=, ==, != 
		// output will be false true
		
		int x= 25;
		int y= 5;
		double z= 25.0;
		double w= 5.2;
		System.out.println("Greater than Operation");
		System.out.println(x>y);
		System.out.println(z>y);
		System.out.println("less than Operation");
		System.out.println(x<y);
		System.out.println(z<y);
		System.out.println("Greater than or equal to /less than or equal to");
		System.out.println(z>=y);
		System.out.println(z<=y);
		System.out.println("Equal to/not equal to Operation");
		System.out.println(w==y);
		System.out.println(w==x);
		System.out.println(w!=x);

	}

}
