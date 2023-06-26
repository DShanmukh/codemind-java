import java.util.*;
public class Sq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        int a[],m,i;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           a[i]=(int)Math.pow(a[i],2);
        }
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}