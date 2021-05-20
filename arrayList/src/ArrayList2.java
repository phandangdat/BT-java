import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        arrayListInteger.add(0);
        arrayListInteger.add(7);
        arrayListInteger.add(1);
        arrayListInteger.add(9);

        System.out.println("Các phần tử có trong arrayListInteger là: ");
        for (int number :  arrayListInteger){
            System.out.println(number + "\t");
        }
    }
}
