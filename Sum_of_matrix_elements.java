import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int i,j,r,c,sum=0,a[][];
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        a=new int[r][c];
        for(i=0;i<r;i++)
         for(j=0;j<c;j++)
         a[i][j]=sc.nextInt();
          for(i=0;i<r;i++)
         for(j=0;j<c;j++)
         sum=sum+a[i][j];
         System.out.println(sum);
    }
}