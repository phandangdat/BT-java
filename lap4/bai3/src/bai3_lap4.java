import java.util.Scanner;
public class bai3_lap4 {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------Sản phẩm 1------------------");
        SanPham sp1 = new SanPham("iphone 12",22000000,2000000);
        sp1.xuat();

        System.out.println("----------------Sản phẩm 2----------------");
        SanPham sp2 = new SanPham("iphone 12 promax",32000000,0);
        sp2.xuat();
    }
}
class SanPham{
    private String tenSp;
    private double giamGia,dongia;
    public SanPham(String tenSp,double dongia,double giamGia){
        this.tenSp = tenSp;
        this.dongia = dongia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSp,double dongia){
        this.tenSp = tenSp;
        this.dongia = dongia;
    }
    private double getThueNhapKhau(){
        return (dongia/10);
    }
    public void xuat(){
        System.out.println("Sản phẩm: "+tenSp);
        System.out.println("Giá: "+dongia);
        System.out.println("Sản phẩm giảm: "+giamGia);
        System.out.println("Thuế sản phẩm: "+ getThueNhapKhau());
    }
}
