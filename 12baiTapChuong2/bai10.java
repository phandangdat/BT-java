import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) throws Exception {
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.print("Nhập vào chuỗi bất kỳ: ");
	    String chuoi = scanner.nextLine();
	    System.out.print("Nhập vào ký tự: ");
	    char kyTu = scanner.next().charAt(0);
	    
	    for (int i = 0; i < chuoi.length(); i++) {
	        if (chuoi.charAt(i) == kyTu) {
	            count++;
	        }
	    }
	         
	    System.out.println("Số lần xuất hiện của ký tự " + kyTu +
	        " trong chuỗi là: " + count);
    }
}
