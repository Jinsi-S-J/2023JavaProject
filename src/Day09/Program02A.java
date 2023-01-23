package Day09;

import java.util.Scanner;

public class Program02A {

	public static void main(String[] args) {
		whileLoop();
	}
	 
public static void whileLoop()
{
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the fact value :- ");
	int fact=input.nextInt();
	input.close();
		
			int temp=1;
			int x=1;
			while (x<=fact)
			{
				temp =temp*x;
				System.out.println(fact+" "+temp);
				x++;
			}
			
			System.out.println("The factorial of "+ fact +" "+temp);
			
}		
}


	


