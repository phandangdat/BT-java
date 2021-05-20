import java.util.LinkedList;
public class linkedList1 {
    public static void main(String[] args) throws Exception {
        LinkedList<String> list = new LinkedList<>();
		list.add("JAVA");
		list.add("C#");
		list.add("PHP");
		list.add("C++");
		System.out.println("cac vi du linkedlist addAll");
		System.out.println("-------------------------------");
		LinkedList<String> A = new LinkedList<>();
		A.addAll(list);
		showList(A);
		
		System.out.println("cac vi du linkedlist retainAll");
		System.out.println("-------------------------------");
		LinkedList<String> B = new LinkedList<>();
		B.add("JAVA");
		A.retainAll(B);
		showList(A);
		
		System.out.println("list A");
		System.out.println("cac vi du linkedlist removeAll");
		System.out.println("-------------------------------");
		list.removeAll(B);
		System.out.println("list B");
		showList(list);
		}
		
		public static void showList(LinkedList<String> list) {
			for (String obj : list){
				System.out.print("\t"+ obj +", ");
		}
			System.out.println();
    }
}
