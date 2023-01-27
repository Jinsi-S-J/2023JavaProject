package Day11;

public class Program02 {

	public static void main(String[] args) {
		// Print the pattern
		/*
		5
		54
		543
		5432
		54321
		 */
		
		for(int a=5;a>=1;a--)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b);
			}
			System.out.println();
	}
	}

}
