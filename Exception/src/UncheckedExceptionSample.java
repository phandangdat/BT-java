public class UncheckedExceptionSample{
    public static void main(String[] args){
        int a = 6 ;
        int b = 5 ;
        if (b != 0){
            System.out.println(a/b);
        }
        UncheckedExceptionSample ues = new UncheckedExceptionSample();
        ues.test(null);
        System.out.println("after exception");
    }
    public void test(String name){
        try{
            System.out.println(name.toUpperCase());
        }catch (NullPointerException e ){
            System.out.println(e.toString());
        }finally {
            System.out.println("Always excepted");
        }
    }
}