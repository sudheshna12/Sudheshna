import java.util.*;
class Pallindrom
// Displaying Fibonacci
{
public static void main(String[] args)
{
int n,p,m=0;
int i;
int sum=0;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
 m=n;
for(i=0;i<=n;i++)
{
p=n%10;
sum=sum*10+p;
n=n/10;
}
if(sum==m)
{ System.out.println("Pallindrome")
}
else{
System.out.println("Not Pallindrome");
}
}


