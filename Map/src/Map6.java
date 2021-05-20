import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map6 {
public static void main(String[] args) {
		
		TreeMap<Integer, Double> treeMap = new TreeMap<>();
		
		treeMap.put(1, 9d);
		treeMap.put(4, 10.1d);
		treeMap.put(2, 7.2d);
		treeMap.put(10, 22.28d);
	
		
		Set<Entry<Integer, Double>> set = treeMap.entrySet();
		System.out.println("Cac entry co trong");
		System.out.println(set);
		
		treeMap.replace(2, 7.2d,7.7d);
		
		System.out.println("Cac entry co trong");
		System.out.println(set);
	}
}