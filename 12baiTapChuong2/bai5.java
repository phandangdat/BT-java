import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(sum<100){
            System.out.print("Nhập vào số: ");
            int n = scanner.nextInt();
            sum += n;
        }
        System.out.println("Tổng các số = "+sum);
    }
}
