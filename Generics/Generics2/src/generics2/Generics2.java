package generics2;
import java.util.HashMap;
import java.util.*;
public class Generics2 {

	public static void main(String[] args) {
		Random rand = new Random();
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		while(map.size()<10)
		{
			map.put(rand.nextInt(), rand.nextDouble());
		}
		System.out.println(map);
	}
}