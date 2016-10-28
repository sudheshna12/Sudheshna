 import java.util.*;
class Stgevenodd
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the String");
String st=s.nextLine();
String a[]=st.split("\\s");

for(int i=0;i<a.length;i++)
{
if(i%2==0)
{
System.out.println(a[i]);
}
}
}
}