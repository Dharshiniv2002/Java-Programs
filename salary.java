import java.util.*;
class employee 
{
int empid;
String name;
Scanner get = new Scanner(System.in);
void getdata() 
{
System.out.println("Enter Name of the Employee : ");
name = get.nextLine();
System.out.println("Enter Employee id : ");
empid = get.nextInt();
}
void display() 
{
System.out.println("Employee Name: "+name);
System.out.println("Employee id : "+empid);
}
}
class programmer extends employee 
{
double salary,bp,da,hra,pf,club,net,gross;
void getprogrammer() 
{
System.out.println("Enter basic pay : ");
bp = get.nextDouble(); 
}
void calculateprog() 
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("************************************************");
System.out.println("PAY SLIP FOR PROGRAMMER");
System.out.println("************************************************");
System.out.println("Basic Pay : Rs."+bp);
System.out.println("DA : Rs."+da);
System.out.println("PF : Rs."+pf);
System.out.println("HRA : Rs."+hra);
System.out.println("CLUB : Rs."+club);
System.out.println("GROSS PAY : Rs."+gross);
System.out.println("NET PAY : Rs."+net);
}
}
class asstprofessor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getasst()
{
System.out.println("Enter basic pay : ");
bp = get.nextDouble();
}
void calculateasst()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("************************************************");
System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
System.out.println("************************************************");
System.out.println("Basic Pay : Rs."+bp);
System.out.println("DA : Rs."+da);
System.out.println("HRA : Rs."+hra);
System.out.println("PF : Rs."+pf);
System.out.println("CLUB : Rs."+club);
System.out.println("GROSS PAY : Rs."+gross);
System.out.println("NET PAY : Rs."+net);
}
}
class associateprofessor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getassociate()
{
System.out.println("Enter basic pay : ");
bp = get.nextDouble();
}
void calculateassociate()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("************************************************");
System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
System.out.println("************************************************");
System.out.println("Basic Pay : Rs."+bp);
System.out.println("DA : Rs."+da);
System.out.println("HRA : Rs."+hra);
System.out.println("PF : Rs."+pf);
System.out.println("CLUB : Rs."+club);
System.out.println("GROSS PAY : Rs."+gross);
System.out.println("NET PAY : Rs."+net);
}
}
class professor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getprofessor()
{
System.out.println("Enter basic pay : ");
bp = get.nextDouble();
}
void calculateprofessor()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("************************************************");
System.out.println("PAY SLIP FOR PROFESSOR");
System.out.println("************************************************");
System.out.println("Basic Pay : Rs."+bp);
System.out.println("DA : Rs."+da);
System.out.println("HRA : Rs."+hra);
System.out.println("PF : Rs."+pf);
System.out.println("CLUB : Rs."+club);
System.out.println("GROSS PAY : Rs."+gross);
System.out.println("NET PAY : Rs."+net);
}
}
public class salary
{
public static void main(String[] args)
{
int choice,cont;
do
{
System.out.println("PAYROLL");
System.out.println(" 1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATEPROFESSOR \t 4.PROFESSOR ");
Scanner c = new Scanner(System.in);
choice=c.nextInt();
switch(choice)
{
case 1:
{
programmer p=new programmer();
p.getdata();
p.getprogrammer();
p.display();
p.calculateprog();
break;
}
case 2:
{
asstprofessor asst=new asstprofessor();
asst.getdata();
asst.getasst();
asst.display();
asst.calculateasst();
break;
}
case 3:
{
associateprofessor asso=new associateprofessor();
asso.getdata();
asso.getassociate();
asso.display();
asso.calculateassociate();
break;
}
case 4:
{
professor prof=new professor();
prof.getdata();
prof.getprofessor();
prof.display();
prof.calculateprofessor();
break;
}
}
System.out.println("Do u want to continue 0 to quit and 1 to continue ");
cont=c.nextInt();
}
while(cont==1);
}
}







