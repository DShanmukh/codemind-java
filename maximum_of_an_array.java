import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a[],min,i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(min<a[i])
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}