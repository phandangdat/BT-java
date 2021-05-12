import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số: ");
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("Số vừa nhập là số chẵn");
        }
        else {
            System.out.println("Số vừa nhập là số lẻ");
        }
    }
}
