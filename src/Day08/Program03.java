package Day08;

public class Program03 {

	public static void main(String[] args) {
		// increment and decrement values
		int a=1;
		int b= ++a; //preincrement b=2,a=2
		System.out.println(a+"    "+b);
		int c=1;
		int d= c++; //Postincrement d=1,c=2
		System.out.println(d+"    "+c);
		
		int x=1;
		int y= --x; //predecrement
		System.out.println(x+"    "+y);
		int w=1;
		int l= w--; //Predecrement
		System.out.println(w+"    "+l);

	}

}
