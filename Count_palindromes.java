import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,r,rev=0,c=0,temp;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            temp=a[i];
            rev=0;
            while(temp!=0)
            {
                r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if(rev==a[i])
            {
                c++;
            }
        }
        System.out.print(c);
    }
}