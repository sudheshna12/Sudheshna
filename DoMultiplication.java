import java.util.*;
class DoMultiplication
// Multiplication using do-while
{
public static void main(String[] args)
{
int n;
int i=1,j;
Scanner s= new Scanner(System.in);
System.out.print(" Enter values of n=");
n=s.nextInt();
System.out.print("Enter the value of Multipliers=");
j=s.nextInt();
do
{
int res=i*n;

System.out.println(+n+ "*" +i+ "=" +res);
i++;
}while(i<=j);

}
}

