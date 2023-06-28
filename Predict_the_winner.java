import java.util.*;
public class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,s=0,s1=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                s=s+a[i];
            }
            else
            {
                s1=s1+a[i];
            }
        }
        int d=(int)Math.abs(s-s1);
        if(d%4==0)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print("Y");
        }
    }
}