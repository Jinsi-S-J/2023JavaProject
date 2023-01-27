package Day12;

public class Program02 {

	public static void main(String[] args) {
		
		//how to print the values of array
		
		int y[] = {10,20,75,30,40,50,60,70,80,90};
		
		System.out.println("Length of y :- "+y.length);
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		
		for(int val:y)
		{
			System.out.println(val);
		}
	}

}
