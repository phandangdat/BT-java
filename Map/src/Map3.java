import java.util.LinkedHashMap;
import java.util.Map;

public class Map3 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hMap = new LinkedHashMap<>();
		hMap.put(100,"Mo");
		hMap.put(101,"dia");
		hMap.put(102,"chat");
		for (Map.Entry<Integer, String> m:hMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("truoc khi di chuyen"+hMap);
		
		hMap.remove(101);
		
		System.out.println("Sau khi di chuyen"+hMap);
	}
}