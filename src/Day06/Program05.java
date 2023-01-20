package Day06;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		//Scanner
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value a:- ");
		int a=x.nextInt();
		System.out.println("Enter value b:-");
		int b=x.nextInt();
		x.close();
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else if(b>a)
		{
			System.out.println("b is greater");
		}
		
		else if(a==b)
		{
			System.out.println("a is equal to b");
		}
		
		System.out.println("End of the Program");
	}

}
