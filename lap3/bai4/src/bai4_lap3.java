import java.util.Scanner;
public class bai4_lap3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần thêm: ");
        int SoSV= scanner.nextInt();
        SinhVien[] SV = new SinhVien[SoSV];
        for (int i=0; i<SV.length; i++) {
            SV[i]= new SinhVien();
            SV[i].nhap();   
        }
        for (int i = 0; i <SV.length; i++){
            for (int j =i+1;j<SV.length;j++) {
                if(SV[i].DTB() < SV[j].DTB()) {
                    SinhVien temp = new SinhVien();
                    temp = SV[i];
                    SV[i] = SV[j];
                    SV[j] = temp;
                }
            }
        }
        System.out.println("------------------------------Thông tin sinh viên----------------------------------");
        for (int i = 0; i<SV.length; i++){
            SV[i].in();
            System.out.println("----------------------------------------------------------------");
        }
    }
}
class SinhVien{
    private String HoTen,NgaySinh,GioiTinh,Lop;
    private double DiemToan,DiemLy,DiemHoa,DTB;
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên: ");
        HoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        NgaySinh = scanner.nextLine();
        System.out.print("Nhập Giới tính: ");
        GioiTinh = scanner.nextLine();
        System.out.print("Nhập Lớp: ");
        Lop = scanner.nextLine();
        System.out.print("Nhập điểm toán: ");
        DiemToan = scanner.nextDouble();
        System.out.print("Nhập điểm lý: ");
        DiemLy = scanner.nextDouble();
        System.out.print("Nhập điểm hóa: ");
        DiemHoa = scanner.nextDouble();
    }
    public double DTB(){
        return ((DiemToan + DiemLy +DiemHoa)/3);
    }
    public void in(){
        System.out.println("Họ tên: "+HoTen);
        System.out.println("Ngày sinh: "+NgaySinh);
        System.out.println("Giới tính: "+GioiTinh);
        System.out.println("Lớp: "+Lop);
        System.out.println("Điểm toán: "+DiemToan);
        System.out.println("Điểm lý: "+DiemLy);
        System.out.println("Điểm hóa: "+DiemHoa);
        System.out.println("Điểm trung bình: "+DTB());
    }
}