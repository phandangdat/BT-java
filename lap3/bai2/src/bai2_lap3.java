import java.util.Scanner;
public class bai2_lap3 {
    public static void main(String[] args){
        ThoiGian time = new ThoiGian();
        time.HamTao(0,0,0);
        time.nhap();
        time.xuat();
        time.HamChuyenDoi();
    }
}
class ThoiGian{
    private int gio, phut, giay;
    int second;
    void HamTao(int gio, int phut, int giay){
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;        
    }
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào giờ là: ");
        gio = scan.nextInt();
        System.out.print("Nhập phút là:");
        phut = scan.nextInt();
        System.out.print("Nhập giây là: ");
        giay = scan.nextInt();
    }
    void xuat(){
        System.out.println("Bây giờ: "+gio+" giờ "+phut+ " phút "+giay+" giây" );
    }
    void HamChuyenDoi(){
        second = gio*3600 + phut*60 +giay;
        System.out.println("Chuyển đổi "+gio+" giờ " +phut+" phút "+giay+ "giây ra giây là: "+second+" giây");
    }
}  