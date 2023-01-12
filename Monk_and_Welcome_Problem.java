import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],b[],c[],i;
        a=new int[n];
        b=new int[n];
        c=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}