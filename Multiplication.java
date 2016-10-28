import java.util.*;
class Multiplication
// Multiplication of given numbers using for loop
{
public static void main(String[] args)
{
int n;
int i,j;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
System.out.print("Enter the value of Multipliers=");
j=s.nextInt();
for(i=1;i<=j;i++)
{
int res=i*n;
System.out.println(+n+ "*" +i+ "=" +res);
}
}
}

