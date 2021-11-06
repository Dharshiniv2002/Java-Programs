import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionDemo
{
public static void main(String[] args) throws FileNotFoundException
{
try
{
FileInputStream fis = new FileInputStream("C://Hello world.java");
}
catch(FileNotFoundException object1)
{
object1.printStackTrace();
System.out.println("File does not exist");
}
}
}