import java.util.Scanner;
public class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],k,l,i,j,sum=0,sum1=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        l=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum1=sum1+a[i];
            for(j=k;j<=l;j++)
            {
                if(a[i]==j)
                {
                    sum=sum+a[i];
                }
            }
        }
        System.out.print(sum1-sum);

    }
}