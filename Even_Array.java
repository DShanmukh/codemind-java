import java.util.Scanner;
class ARRAY
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[],i,count=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        if(count==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}