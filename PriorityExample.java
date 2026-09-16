class PriorityExample extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName()+"-Priority:"+Thread.currentThread().getPriority());
}
public static void main(String[]args)
{
PriorityExample t1=new PriorityExample();
PriorityExample t2=new PriorityExample();
PriorityExample t3=new PriorityExample();
t1.setName("Low Priority Thread");
t2.setName("Normal Priority Thread");
t3.setName("High Priority Thread");
t1.setName(Thread.MIN_PRIORITY);
t2.setName(Thread.NORM_PRIORITY);
t3.setName(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
}
}