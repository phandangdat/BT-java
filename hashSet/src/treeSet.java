import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(6);
		
	
		System.out.println("Cac phan tu trong hashset:");
		System.out.println(tree);
		System.out.println("Nhap phan tu can them:");
			number = sc.nextInt();
			
		if (!tree.contains(number)) {
			tree.add(number);
			System.out.println("them thanh cong");
			System.out.println("Cac phan tu trong hashset sau khi them:");
			System.out.println(tree);
		}	else {
			System.out.println("Phan tu "+ number + " da ton tai trong danh sach ");
		}
		
		sc.close();
	}
}