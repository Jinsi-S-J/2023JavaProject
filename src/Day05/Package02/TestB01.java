package Day05.Package02;

import Day05.Package01.TestA01;

public class TestB01 extends TestA01 {

	public static void main(String[] args)
	{
		add1(189,234);// public/Protected access specifier 
		//can be accessed from one package to another
		mul1(19,67);
		//div(10,2); default access specifier cannot be accessed from one package to another
	}

}
