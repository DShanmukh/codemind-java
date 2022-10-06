import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[],sum=0,i;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}