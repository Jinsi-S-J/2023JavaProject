package Day12;

public class Program04 {

	public static void main(String[] args) {
		// TODO Search for duplicate element  
		int y[] = {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
		
		System.out.println("Duplicate elements in the array");
		for(int i=0;i< y.length;i++)
		{
			for (int j=i+1;j< y.length;i++)
			{
				if(y[i] == y[j])
				{
					System.out.println(y[j]);
			}
		}

	}

}
}