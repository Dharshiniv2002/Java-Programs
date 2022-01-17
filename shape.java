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
a=s.nextInt();
b=s.nextInt();
area_rect=a*b;
System.out.println("Length of the Rectange : "+a+ "Breadth of the Rectangle :"+b);
}
}
class triangle extends shape
{
double area_tri;
public void printarea()
{
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
area_tri=(0.5*a*b);
System.out.println("Base of the Triangle : "+a+ "Height of the Triangle : "+b);
}
}
public class shapeclass
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();
r.printarea();
Triangle t=new Triangle();
t.printarea();
}
}