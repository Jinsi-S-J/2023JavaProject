package Day10;

public class Program01A {

	public static void main(String[] args) {
		// fibinocci series using for loop
		int x=0;
		int y=1;
		for(int a=1;a<=10;a++)
		{
			System.out.println(x);
			int z= x+y;
			x=y;
			y=z;
		}
	}

}
