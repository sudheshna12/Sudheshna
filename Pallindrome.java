import java.util.*;
class Pallindrome

// Displaying Pallindrome
{
public static void main(String[] args)
{
int n,p;
int i;
int sum=0;
int m;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
 m=n;
while(n!=0)
{
p=n%10;
sum=sum*10+p;
n=n/10;
}
System.out.println(sum);
if(sum==m)
{ System.out.println("Pallindrome");
}
else{
System.out.println("Not Pallindrome");
}
}
}


