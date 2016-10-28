import java.util.*;
class IfOdd
// Program to know that given number is even  or odd
{
public static void main(String[] args)
{
int n;
int i;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
if(n%2==0)
{
System.out.println(" The Number given is even");
}
else
{
System.out.println("The number given is odd");
}
}
}
