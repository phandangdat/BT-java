import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) throws Exception {
        int temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.print("Nhập vào 1 số bất kỳ: ");
            int number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
         
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + giaiThua);
    }
}
