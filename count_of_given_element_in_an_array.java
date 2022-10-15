import java.util.Scanner;
class Shanmukh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k,count=0;
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(k==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}