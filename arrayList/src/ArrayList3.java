import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(1.0f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);

        Iterator<Float> it = arrayListFloat.iterator();

        System.out.println("Các phần tử có trong arrayListInteger là: ");
        while (it.hasNext()){
            System.out.println(it.next()+"\t");
        }
    }
}