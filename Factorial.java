import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
int fact=1;
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.println("Factorial of "+n+" is: "+fact);
}
}
