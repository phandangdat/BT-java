import java.util.Scanner;
public class Bai3_lap3{
    public static void main(String[] args) {
        Matran A = new Matran();
        A.Nhap();
        A.Hienthi();
    }
}
class Matran{
    private int i, j, m, n, k;
    private static int [][] M= new int [9][9];
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng:");
        n = sc.nextInt();
        System.out.print("Nhập số cột:");
        m = sc.nextInt();
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.println("Nhập ma trận M [" + i + "][" + j + "]=");
                M[i][j] = sc.nextInt();
            }
        }
    }
    public void Hienthi() {
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(M[i][j] + " ");
            }
        }
    }
}