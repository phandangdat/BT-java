import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("CSLT","Co so lap trinh");
		hashMap.put("C++ ", " C++");
		hashMap.put("JAVA ", "JAVA");
		hashMap.put("C# ", "C sharp");
		hashMap.put("PYTHON ", "Python");
		
		Set<Map.Entry<String, String>> setHaMaps = hashMap.entrySet();
		System.out.println("cac entry co trong hashmap");
		System.out.println(setHaMaps);
	}
}