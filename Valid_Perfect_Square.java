import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            int j,count=0;
            for(j=1;j<=a;j++)
            {
                if(a==j*j)
                {
                    count=1;
                }
            }
            if(count==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}