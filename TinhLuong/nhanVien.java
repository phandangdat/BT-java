import java.util.Scanner;
public class nhanVien {
	private String tenNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);
     
    public nhanVien() {
        super();
    }
 
    public nhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }
     
    public void nhapThongTin() {
        System.out.print("Nhập tên nhân viên: ");
        tenNhanVien = scanner.nextLine();
    }
     
   
    public void tinhLuong() {
         
    }
 
    @Override
    public String toString() {
        return "Tên nhân viên: " + this.tenNhanVien + ", lương nhân viên: " + 
            this.luongNhanVien + " VND";
    }
 
}