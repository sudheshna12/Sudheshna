import java.util.*;
class Amstrong
// Amstrong
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
while(n!=0)
{
p=n%10;
sum=sum+p*p*p;
n=n/10;
m=sum+n;

}
if(sum==m)
{
System.out.println("Is Amstrong"); 
}
else
{
System.out.println("Not Amstrong");
}


}

}


