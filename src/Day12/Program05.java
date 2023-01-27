package Day12;

public class Program05 {

	public static void main(String[] args) {
		// Print prime numbers from the array
		int y[] = {10,25,75,103,40,7,65,11,5,13,17,23};
		System.out.println("Prime numbers are");
		for(int n:y)
		{
			boolean x=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					x=false;
					break;
				}
			}
			if(x)
			{
				System.out.println(n);
			}
		
			}

		}

	}


