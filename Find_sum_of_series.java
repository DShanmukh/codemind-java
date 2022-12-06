import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float sum=0;
        float i;
        for(i=1;i<=n;i++)
        {
             sum=sum+(1/i);
        }
        System.out.printf("%.2f",sum);
       
    }
}