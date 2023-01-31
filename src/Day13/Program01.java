package Day13;
import java.util.ArrayList;
import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		// Collections 1 List
		ArrayList<Integer> x= new ArrayList<>();
		ArrayList<Long> y= new ArrayList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		x.remove(0);// remove the value in o position
		System.out.println(x);
		x.add(10);
		System.out.println(x);
		x.add(2, 10);// add 10 in 2nd position
		System.out.println(x);
		System.out.println(x.size());// print the size
		System.out.println(x.contains(20));// returns True /false
		System.out.println(x.contains(200));
		System.out.println(x.isEmpty());
		//x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		x.set(0, 70);// set the value to 0 positiion
		System.out.println(x);
		Integer[] z= {60,90,80};
		x.addAll(Arrays.asList(z));
		System.out.println(x);
		Integer[] w= {70,30};
		x.removeAll(Arrays.asList(w));// remove the values w from x
		System.out.println(x);
}
}