package Day10;

public class Program01B {

	public static void main(String[] args) {
		// fibinocci series using do While
		int x=0;
		int y=1;
		int a=1;
		do
		{
			System.out.println(x);
			int z= x+y;
			x=y;
			y=z;
			a++;
		}while(a<=11);


	}

}
