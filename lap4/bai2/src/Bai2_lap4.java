import java.util.Scanner;
public class Bai2_lap4 {
    public static void main(String[] args) throws Exception {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        System.out.println("--------Giá sản phẩm 1 là---------");
        sp1.in();
        SanPham sp2 = new SanPham();
        System.out.println("---------------------------------------------------------------");
        sp2.nhap();
        System.out.println("--------Giá sản phẩm 2 là---------");
        sp2.in();
    }
}
class SanPham{
    String tenSp;
    double giamGia,dongia;
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");       
        tenSp = scanner.nextLine();
        
        System.out.print("Nhập giá sản phẩm: ");
        dongia = scanner.nextDouble();

        System.out.print("Sản phẩm giảm: ");
        giamGia = scanner.nextDouble();
    }
    void in(){
        System.out.println("Sản phẩm: "+tenSp);
        System.out.println("Giá: "+dongia);
        System.out.println("Sản phẩm giảm: "+giamGia);
    }
}
