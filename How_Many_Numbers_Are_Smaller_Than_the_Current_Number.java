import java.util.Scanner;
class Shannu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,j,c=0;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                
                if(a[j]<a[i] && i!=j)
                {
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}