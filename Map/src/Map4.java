import java.util.LinkedHashMap;
import java.util.Set;

public class Map4 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
		list.put(1,"JAVA");
		list.put(2,"C#");
		list.put(3,"PHP");
		list.put(3,"PYTHON");
		System.out.println("Truoc khi di chuyen");
		show(list);
		
		list.remove(2);
		
		System.out.println("Sau khi di chuyen");
		show(list);
	}		
		public static void show(LinkedHashMap<Integer, String> list) {
			Set<Integer> keyIntegers  = list.keySet();
			for (Integer key : keyIntegers){
				System.out.println(key+ " "+list.get(key));
		}
	
		}
}