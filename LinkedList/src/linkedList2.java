import java.util.LinkedList;
import java.util.Scanner;

public class linkedList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		list.add("Tháng 1");
		list.add("Tháng 2");
		list.add("Tháng 3");
		list.add("Tháng 4");
		list.add("Tháng 5");
		list.add("Tháng 6");
		list.add("Tháng 7");
		list.add("Tháng 8");
		list.add("Tháng 9");
		list.add("Tháng 10");
		list.add("Tháng 11");
		list.add("Tháng 12");
		
		System.out.println("Nhap vao chi so cua cac phan tu can lay:");
			int a = sc.nextInt();
			
		if ((a < 0) || (a > (list.size()-1))) {
			System.out.println("chi so can lon hon 0 va nho hon "+ (list.size()-1));
		}	else {
			String node = list.get(a);
			System.out.println("Phan tu co chi so = "+ a + " trong danh sach la "+node);
		}
		String firsnode = list.getFirst();
		
		String lastnode = list.getLast();
		System.out.println("Phan tu dau tien trong danh sach la "+ firsnode);
		System.out.println("Phan tu cuoi cung trong danh sach la "+ lastnode);
		sc.close();
	}
}