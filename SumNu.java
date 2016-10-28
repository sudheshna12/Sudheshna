

import java.util.*;
class SumNu
// Displaying sum of digits in a given number
{
public static void main(String[] args)
{
int n,p,m=0,q;
int i,j;
int sum=0;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
  
for(i=0;i<=n;i++)
{
p=n%10;
sum=sum+p;
n=n/10;
m=sum+n;

}
System.out.println("Sum is"+m);

}

}


