package Day09;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// how to print multiplication table using loops
		
		dowhileLoop();
	}
public static void whileLoop()
 {
	 
	 Scanner input= new Scanner(System.in);
	 System.out.println("Enter the Table value :- ");
		int table=input.nextInt();
		input.close();
	    int a= 1;
	while (a<=10)
	 {
		 System.out.println(table +"*" + a +"=" + table*a);
		 a++;
	 }
 }
public static void dowhileLoop()
	 {
		 
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter the Table value :- ");
			int table=input.nextInt();
			input.close();
		    int a= 1;
		do
		 {
			 System.out.println(table +"*" + a +"=" + table*a);
			 a++;
		 }while (a<=10);
 }
}
