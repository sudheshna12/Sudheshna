import java.util.*;
class Prime1

// Displaying prime series below the given number
{
public static void main(String[] args)
{
int n;
int i;
int j;
int count;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
for(i=2;i<n;i++)
{
count=0;
for(j=2;j<i;j++)
{
if(i%j==0)
count=1;
}
if(count==0)
System.out.println(i);
}



}
}