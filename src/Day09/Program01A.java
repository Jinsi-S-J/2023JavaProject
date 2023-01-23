package Day09;

import java.util.Scanner;

public class Program01A {

	public static void main(String[] args) {
		// multiplication table using for loop
		
		
		Scanner input= new Scanner(System.in);
		 System.out.println("Enter the Table value :- ");
			int table=input.nextInt();
			input.close();
		for(int a=1;a<=10;a++)
		{
			System.out.println(table +"*"+ a +"="+table*a);
		}
		

	}

}
