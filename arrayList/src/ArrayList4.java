import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayList4 {
    public static void main(String[] args){
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('c');
        arrayListChar.add('b');
        arrayListChar.add('d');

        ListIterator<Character> lit = arrayListChar.listIterator();

        System.out.println("Các phần tử có trong arrayListInteger là: ");
        while (lit.hasNext()){
            System.out.println(lit.next()+"\t");
        }
    }
}