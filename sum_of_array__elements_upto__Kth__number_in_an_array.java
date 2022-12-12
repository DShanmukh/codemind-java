import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,k,sum=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                break;
            }
            else
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum+k);
    }
}