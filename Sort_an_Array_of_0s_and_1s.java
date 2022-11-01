import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,j,m;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    m=a[i];
                    a[i]=a[j];
                    a[j]=m;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}