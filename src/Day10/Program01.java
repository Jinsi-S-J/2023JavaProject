package Day10;

public class Program01 {

	public static void main(String[] args) {
		// fibinocci series
		
		int x=0;
		int y=1;
		int a=1;
		while(a<=11)
		{
			System.out.println(x);
			int z= x+y;
			x=y;
			y=z;
			a++;
		}

	}

}
