import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionSample {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        try{
            Files.createFile(Paths.get("Student.txt"));
        } catch(FileAlreadyExistsException e) {
            System.out.println("file already");
            System.out.println(e.toString());
        } 
        catch (IOException e){
            //e.printStackTrace();
            System.out.println("exception: "+e.toString());
        } finally {
            System.out.println("Always excepted");
        }
        System.out.println("after exception");
    }
}
