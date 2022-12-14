import java.util.*;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.print("
");
        }
    }
}