import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf("%c ",(char)(64+i));
            }
            System.out.print("
");
        }
    }
}