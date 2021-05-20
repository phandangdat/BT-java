import java.util.HashSet;
import java.util.Scanner;

public class hashSet1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		HashSet<Integer> list = new HashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		
	
		System.out.println("Cac phan tu trong hashset:");
		System.out.println(list);
		System.out.println("Nhap cac phan tu can them:");
			number = sc.nextInt();
			
		if (!list.contains(number)) {
			list.add(number);
			System.out.println("them thanh cong");
			System.out.println("Cac phan tu trong hashset sau khi them:");
			System.out.println(list);
		}	else {
			System.out.println("Phan tu "+ number + " da ton tai trong danh sach ");
		}
		
		sc.close();
	}
}