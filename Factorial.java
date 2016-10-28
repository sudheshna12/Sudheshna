import java.util.*;
class Factorial
// Program to find factorial of given number
{
public static void main(String[] args)
{
int n;int i;
int q=1;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
 for(i=1;i<=n;i++)
{    

      q=q*i;    
  }    
  System.out.println("Factorial  is: "+q);    
 }  
}  


