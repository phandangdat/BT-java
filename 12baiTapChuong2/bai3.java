import java.util.Scanner;
 
public class bai3 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào năm sinh: ");
        int birth = scanner.nextInt();
        System.out.print("Năm này là: ");
        int year = scanner.nextInt();

        int age = year - birth;
        if (age < 16) {
            System.out.println("Bạn "+name+" ở độ tuổi vị thành niên");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn "+name+" ở độ tuổi trưởng thành");
        } else {
            System.out.print("Bạn "+name+" đã già");
        }
    }
 
}