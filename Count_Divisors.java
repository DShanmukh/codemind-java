import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,m,k;
        l=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int i,count=0;
        for(i=l;i<=m;i++)
        {
            if(i%k==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}