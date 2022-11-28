import java.util.Scanner;
class Sum2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,c=0,p=0,j,r,i;
        n=sc.nextInt();
        int temp;
        temp=n;
        while(n!=0)//21
        {
            r=n%10;//1 2
            s=s*10+r;//12
            n=n/10;//0
        }
        for(i=1;i<=temp;i++)//12
        {
            if(temp%i==0)
            {
                c++;
            }
        }
        for(j=1;j<=s;j++)
        {
            if(s%j==0)
            {
                p++;
            }
        }
        if(p<3 && c<3)
        {
            System.out.println("circular prime");
        }
        else if(c<3)
        {
            System.out.println("prime but not a circular prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}