import java.util.Scanner;
import java.text.DecimalFormat;
public class bai8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float tbc;
        int sum = 0;

        System.out.print("Nhập vào số các số có trong dãy: ");
        int n = scanner.nextInt();

        for (int i = 1;i<=n;i++){
            System.out.print("Nhập số thứ "+ i+": ");
            int number = scanner.nextInt();
            sum += number;
        }
        tbc = (float)sum/n;
        System.out.print("Trung bình cộng ="+ decimalFormat.format(tbc));
    }
}
