package Day12;

public class Program03 {

	public static void main(String[] args) {
		// how to segregate even and odd number from array
		int y[] = {10,20,75,33,41,53,62,70,81,91,20};
		
		System.out.println("Odd Number from the array are");
		
		for(int val:y)
		{
			if(val%2!=0)
			{
			System.out.println(val);
		}
		}
		System.out.println("Even Number from the array are");
		for(int val:y)
		{
			if(val%2==0)
			{
			System.out.println(val);
		}
		}
		
		
}
	}
