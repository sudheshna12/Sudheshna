import java.util.*;
class Prime

// Displaying sum of digits in a given number
{
public static void main(String[] args)
{
int n;
int i;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();

for(i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println("it is not prime");
System.exit(0);
}
else
{
System.out.println(n+" is prime");
break;
}
}
}
}