package Day04.Sample1;

public class testB extends testA {

	public static void main(String[] args) 
	{
		//Inheritance : inheriting the properties of class testA
		add(100,113,11);
		testB b = new testB();
		b.sub(200,117);
		testB c= new testB();
		c.mul(25, 4);
		div(10,2);

	}
	public static void div(int a,int b)
{
		System.out.println(a/b);
}
}