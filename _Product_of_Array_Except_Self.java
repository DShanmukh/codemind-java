import java.util.*;
public class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,j,p=1;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            p=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    p*=a[j];
                }
            }
            System.out.print(p+" ");
        }
    }
}