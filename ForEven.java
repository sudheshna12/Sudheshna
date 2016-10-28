import java.util.*;
class ForEven
//Even and odd number series using for loop
{
public static void main(String[] args)
{
int n;
int i;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
System.out.print("The even Numbers  are");

for(i=0;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
System.out.println(" The odd numbers are");
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}