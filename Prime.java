import java.lang.*;
import java.util.*;
class Prime
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int f=0,i=1;
    while(i<=n)
    {
     if(n%i==0)
      f++;
      i++;
    }
    if(f==2)
    System.out.println("prime");
    else
    System.out.println("not prime");
   }
}