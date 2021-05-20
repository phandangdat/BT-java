import java.util.HashSet;
import java.util.Scanner;

public class hashSet2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		HashSet<String> list = new HashSet<>();
		list.add("Nokia");
		list.add("Samsung");
		list.add("Lenovo");
		list.add("Acer");
		list.add("Asus");
		
	
		System.out.println("Cac phan tu trong hashset:");
		System.out.println(list);
		System.out.println("Nhap cac phan tu can xoa:");
			name = sc.nextLine();
			
		if (list.contains(name)) {
			list.remove(name);
			System.out.println("Xoa thanh cong");
			System.out.println("Cac phan tu trong hashset sau khi xoa:");
			System.out.println(list);
		}	else {
			System.out.println("Xoa ko thanh cong ");
		}
		
		sc.close();
	}
}