import java.util.Scanner;
public class Naruto{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int a[],i,j,k,m,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=k;j<=m;j++)
            {
                if(a[i]==j)
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}