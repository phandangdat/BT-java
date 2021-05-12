import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) throws Exception {
        char ch;
        int hoa=0,thuong=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();
   
        for(int i=0;i<chuoi.length();i++)
        {
            ch = chuoi.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90){
               hoa++;
            }
            else if(asciivalue >=97 && asciivalue <=122){
                thuong++;
            }
        }
        System.out.println("Số ký tự in hoa : " + hoa);
        System.out.print("Số ký tự in thường : " + thuong);
    }
}
