class Department{
void run(){
System.out.println("Exellent Department");
}
}
class BCA extends Department
{
void run()
{
System.out.println("BCA is a exellent department");
}
}
public class MethodOverridingDemo
{
public static void main(String[] args)
{
Department D=new Department();
D.run();
BCA B=new BCA();
B.run();
Department obj=new BCA();
obj.run();
}
}