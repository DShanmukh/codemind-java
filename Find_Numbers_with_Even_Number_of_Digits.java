import java.util.*;
class Naruto
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[],i,c=0,g;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            g=(int)Math.log10(a[i])+1;
            if(g%2==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}