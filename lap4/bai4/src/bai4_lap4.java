import java.util.Scanner;
public class bai4_lap4 {
    public static void main(String[] args) throws Exception {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        System.out.println("--------------------------------");
        sp1.xuat();

        System.out.println("----------------Sản phẩm 2----------------");
        SanPham sp2 = new SanPham();
        sp2.nhap();
        System.out.println("--------------------------------");
        sp2.xuat();
    }
}
class SanPham{
    private String tenSp;
    private double giamGia,dongia;
    public SanPham(){
    }
    public SanPham(String ten,double giamGia,double gia){
        this.tenSp = ten;
        this.dongia = gia;
        this.giamGia = giamGia;
    }
    public SanPham(String ten,double gia){
        this(tenSp,dongia,0);
    }
    public String gettenSp(){
        return tenSp;
    }
    public double getgiamGia(){
        return giamGia;
    }
    public double getdongia(){
        return dongia;
    }
    public void settenSp(String tenSp){
        this.tenSp = tenSp;
    }
    public void setdongia(double dongia){
        this.dongia = dongia;
    }
    public void setgiamGia(String giamGia){
        this.giamGia = giamGia;
    }
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");       
        tenSp = scanner.nextLine();
        
        System.out.print("Nhập giá sản phẩm: ");
        dongia = scanner.nextDouble();

        System.out.print("Sản phẩm giảm: ");
        giamGia = scanner.nextDouble();
    }
    private double getThueNhapKhau(){
        return (dongia/10);
    }
    public void xuat(){
        System.out.println("Sản phẩm "+tenSp);
        System.out.println("Giá "+dongia);
        System.out.println("Sản phẩm giảm "+giamGia);
        System.out.println("Thuế sản phẩm "+ getThueNhapKhau());
    }
}
