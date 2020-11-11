import java.util.ArrayList;

//ArrayList && Vector = adik beradik. sama.

public class DemoVector{
	public static void main(String args[]){
		Vector<String> fruits = new ArrayList<String>();

		fruits.add("rambutan"); 
		fruits.add("jackfruit"); 
		fruits.add("mangosteen");

		System.out.println(fruits);

		// fruits.remove("jackfruit");
		fruits.add("mango");

		System.out.println(fruits);
		System.out.println("mangosteen is exist? " + fruits.contains("durian"));

		fruits.set(2, "durian");
		fruits.add(2, "durian2");
		System.out.println(fruits);
		System.out.println("Size: " + fruits.size());

		// System.out.println("Position: " + fruits.get(1));
	}
}