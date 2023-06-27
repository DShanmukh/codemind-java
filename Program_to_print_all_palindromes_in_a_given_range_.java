import java.util.Scanner;
public class NAruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int i,r,rev=0,t;
        for(i=n;i<=m;i++)
        {
            t=i;
            rev=0;
            while(t!=0)
            {
                r=t%10;
                rev=rev*10+r;
                t=t/10;
            }
            if(rev==i)
            {
                System.out.print(rev+" ");
            }
        }
    }
}