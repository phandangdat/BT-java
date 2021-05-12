import java.util.Scanner;
import java.util.Math;
public class bai1_lap3{
    public static void main(String[] args){
        DIEM diem = new DIEM();
        diem.nhap();
        System.out.println("------------------------------------------------");
        diem.xuat();
        diem.diemDoixung();
        diem.KhoangCach();
        diem.kiemTra();
    }
}
class DIEM{
    int x,y,x1,y1;
    double delta,s;
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào hoành độ là x: ");
        x = scanner.nextInt();
        System.out.print("Nhập vào tung độ là y: ");
        y = scanner.nextInt();
    }
    void xuat(){
        System.out.println("Tọa độ của điểm là: ("+ x + "," + y +")");
    }
    void diemDoixung(){
        x1 = x;
        y1 = -y;
        System.out.println("Tọa độ của điểm đối xứng là: (" +x1 +"," + y1 +")");
    }
    void KhoangCach(){
        delta = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        System.out.println("Khoảng cách giữa hai điểm là: " +delta);
    }
    void kiemTra(){
        if( x==0 || y==0 ){
            System.out.println("Điểm này nằm trên trục tọa độ");
        }else{
            s = 0.5 * delta *x ;
            System.out.println("Diện tich tam giác là: " +s);
        }
    }
}