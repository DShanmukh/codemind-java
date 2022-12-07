import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.printf("0");
                }
                else
                {
                    System.out.printf("x");
                }
            }
            System.out.printf("
");
        }
        
    }
}