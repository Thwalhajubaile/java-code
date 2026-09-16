import java.util.Scanner;
class Main{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a sentence :");
String str=sc.nextLine();
String[] words=str.split(" ");
String longest="";
for (String word:words){
if (word.length()> longest.length())
{
longest=word;
}
}
System.out.println("Longest word:"+longest);
System.out.println("length:"+longest.length());
}
}