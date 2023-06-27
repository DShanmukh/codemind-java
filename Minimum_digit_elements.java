import java.util.*;
public class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,g,k,c=0,l;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=a[0];
        for(i=0;i<n;i++)
        {
            g=(int)Math.log10(a[i])+1;
            if(g<k)
            {
                k=g;
            }
        }
        for(i=0;i<n;i++)
        {
            g=(int)Math.log10(a[i])+1;
            if(k==g)
            {
                c++;
            }
        }
       System.out.print(c);
    }
}