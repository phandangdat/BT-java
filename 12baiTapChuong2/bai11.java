import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) throws Exception {
         int size,tg;
		 Scanner scanner = new Scanner(System.in);
		         
		 System.out.print("Nhập vào độ dài của mảng: ");
		 size= scanner.nextInt();
		 int[] array = new int[size];
		    for (int i = 0; i < size; i++) {
		    System.out.print("Nhập vào phần tử thứ " + i + ": ");
		    array[i] = scanner.nextInt();
		 }
		 for (int i = 0; i < size; i++) {
		        System.out.println("Phần tử thứ " + i + ": " + array[i]);
		 }
		 for (int i = 0; i < size-1; i++) {
		       for(int j=i+1;j < size; j++) {
		    	   if(array[i]>array[j]) {
		    		   tg = array[i];
		               array[i] = array[j];
		               array[j] = tg;  
		    	   }
		       }
		 }
		 System.out.println("Dãy sau khi sắp xếp");
		 for (int i = 0; i < size; i++) {
		        System.out.println(array[i]);
		 }
    }
}
