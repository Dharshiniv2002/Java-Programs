import java.util.Scanner;
class NegativeAmtException extends Exception
{
String msg; 
NegativeAmtException(String msg)
{
this.msg=msg;
}
public String toString()
{
return msg;
}
}
public class userdefined
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in); 
System.out.print("Enter Amount:"); 
int a=s.nextInt();
try
{
if(a<0)
{
throw new NegativeAmtException("Invalid Amount");
}
System.out.println("Amount Deposited");
}
catch(NegativeAmtException e)
{
System.out.println(e);
}
}
}
class MyException extends Exception{ 
String str1;
MyException(String str2)
{
str1=str2;
}
public String toString()
{
return ("MyException Occurred: "+str1) ;
}
}
class example
{
public static void main(String args[])
{
try
{
System.out.println("Starting of try block");
throw new MyException("This is My error Message");
}
catch(MyException exp)
{
System.out.println("Catch Block") ; 
System.out.println(exp) ;
}
}
}
