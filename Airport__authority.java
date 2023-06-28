import java.util.*;
public class Dhoni{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[],k,sum=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(k>=a[i])
            {
                sum=sum+1;
            }
            if(k<a[i])
            {
                sum=sum+2;
            }
        }
        System.out.print(sum);
    }
}