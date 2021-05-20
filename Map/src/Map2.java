import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		HashMap<String, String> City = new HashMap<>();
		

		City.put("HN ", " HA NOI");
		City.put("HCM ", " HO CHI MINH");
		City.put("DN ", " DA NANG");
		
		
		Set<Map.Entry<String, String>> setHaMaps = City.entrySet();
		System.out.println("cac thanh pho co trong hashmap");
		System.out.println(setHaMaps);
		
		System.out.println("DN: "+ City.get("DN "));
		
		
		System.out.println("QN: "+ City.get("QN"));
		if (City.containsValue(" HA NOI")) {
			System.out.println("CO HA NOI TRONG CITY MAP");
		}
	}
}