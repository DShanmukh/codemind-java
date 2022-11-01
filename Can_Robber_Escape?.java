import java.util.Scanner;
class Robber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,odd=0;
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
        
}