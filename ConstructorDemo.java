class A
{
A()
{
System.out.println("Constructer of Class A");
}
}
class B extends A
{
B()
{
System.out.println("Constructer of Class B");
}
}
class C extends B
{
C()
{
System.out.println("Constructer of Class C");
}
}
public class ConstructorDemo
{
public static void main(String args[])
{
System.out.println("Creating object of class C");
C obj =new C();
}
}
