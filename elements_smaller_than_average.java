import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[],i,d,sum=0;
        int k,count=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=(sum+a[i]);
        }
        d=sum/n;
        for(i=0;i<n;i++)
        if(d>=a[i])
        {
           count++;
        }
        System.out.println(count);
        
    }
}