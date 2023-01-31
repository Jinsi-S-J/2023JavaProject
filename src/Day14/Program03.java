package Day14;

import java.util.Hashtable;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> x= new Hashtable<>();
		x.put(101, "aa");
		x.put(102, "bb");
		x.put(101, "aaa");
		x.put(103, "bb");
		
		System.out.println(x);
		x.remove(101);
		System.out.println(x);
		x.remove(102, "bb");
		System.out.println(x);
		System.out.println(x.size());
		x.put(101, "aa");
		x.put(102, "bb");		
		System.out.println(x);		
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.entrySet());
		x.replace(102, "aaa");
		x.put(104, "aaa");//replace and new key
		System.out.println(x);
		
	}

}
