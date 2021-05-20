import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet1 {
	public static void main(String[] args) {
		Set<String> e = new LinkedHashSet<>();
		e.add("JAVA");
		e.add("C#");
		e.add("PYTHON");
		e.add("C++");
		for (String str : e) {
			System.out.println(str);
		}
	}
}