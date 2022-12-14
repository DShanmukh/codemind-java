import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,sum=0,f;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            f=(int)Math.sqrt(a[i]);
            if(f*f==a[i])
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}