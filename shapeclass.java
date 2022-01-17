import java.util.*; 
abstract class shape
{
int a,b;
abstract public void printarea();
}
class rectangle extends shape
{
public int area_rect; 
public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Length and Breadth of the Rectangle"); 
a=s.nextInt();
b=s.nextInt(); 
area_rect=a*b;
System.out.println("Length of the Rectangle "+a +"Breadth of the Rectangle "+b); 
System.out.println("The Area of the Rectangle is:"+area_rect);
}
}
class triangle extends shape
{
double area_tri; 
public void printarea()
{
Scanner s=new Scanner(System.in); 
System.out.println("Enter the Base and Height of the Triangle"); 
a=s.nextInt();
b=s.nextInt();
System.out.println("Base of the Triangle "+a +"Height of the triangle "+b); 
area_tri=(0.5*a*b);
System.out.println("The Area of the Triangle is:"+area_tri);
}
}
public class shapeclass
{
public static void main(String[] args)
{
rectangle r=new rectangle(); 
r.printarea();
triangle t=new triangle(); 
t.printarea();
}
}
