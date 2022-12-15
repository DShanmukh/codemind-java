import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,t[],d,min=0;
        a=new int[n];
        t=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        d=sc.nextInt();
        for(i=0;i<n;i++)
        {
            t[i]=a[i];
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(min<a[i])
            {
                min=a[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(t[i]+d>=min)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}