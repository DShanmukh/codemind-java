import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
        for(j=n;j>0;j--)
        {
            System.out.printf("%d ",j);
        }
        System.out.printf("
");
        }
    }
}