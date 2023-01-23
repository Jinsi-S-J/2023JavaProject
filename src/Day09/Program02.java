package Day09;

public class Program02 {

	public static void main(String[] args) {
		//how to find  factors using loops
		forLoop();
	}	
public static void forLoop()
{
	int fact=8;
	int temp=1;
	for(int x=1;x<=fact;x++)
	{
		temp =temp*x;
		System.out.println(fact+" "+temp);
	}
	System.out.println("The factorial of "+ fact +" "+temp);
	
	}

	}


