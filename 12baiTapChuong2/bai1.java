import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số thứ nhất: ");
        int firstNum = scanner.nextInt();
        System.out.print("Nhập vào số thứ hai: ");
        int secondNum = scanner.nextInt();

        int tong = firstNum + secondNum;
        System.out.println("Tổng 2 số là: "+tong);
        int hieu = firstNum - secondNum;
        System.out.println("Hiệu 2 số là: "+hieu);
        int tich = firstNum * secondNum;
        System.out.println("Tích 2 số là: "+tich);
        float thuong = (float)firstNum / secondNum;
        System.out.println("Thương 2 số là: "+thuong);

        System.out.print("---------------------\n");
        System.out.println("2 số bằng nhau: "+(firstNum == secondNum));
        System.out.println("số thứ nhất lớn hơn số thứ 2: "+(firstNum > secondNum));
        System.out.println("số thứ nhất lớn hơn hoặc bằng số thứ 2: "+(firstNum >= secondNum));
        System.out.println("số thứ nhất nhỏ hơn số thứ 2: "+(firstNum < secondNum));
        System.out.println("số thứ nhất nhỏ hơn hoặc bằng số thứ 2: "+(firstNum <= secondNum));
        System.out.println("2 số không bằng nhau: "+(firstNum != secondNum));
    }
}
