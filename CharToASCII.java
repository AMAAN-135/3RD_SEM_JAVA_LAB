import java.util.Scanner;
public class CharToASCII
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a character: ");
char ch=scanner.next().charAt(0);
int ascii=ch;
System.out.println("ASCII Value of "+ch+" is: "+ascii);
}
}
