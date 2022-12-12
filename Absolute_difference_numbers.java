import java.util.*;
class Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,temp;
        n=sc.nextInt();
        m=sc.nextInt();
        temp=n;
        int g,r,r1,r2,r3,rev1=0,rev=0,rev2=0;
        g=(int)Math.pow(10,m);
        r=n%g;
    while(temp!=0)
    {
        r1=temp%10;
        rev=rev*10+r1;
        temp/=10;
    }
    r2=rev%g;
    while(r2!=0)
    {
        r3=r2%10;
        rev2=rev2*10+r3;
        r2/=10;
    }
    int sum;
    sum=(int)Math.abs(rev2-r);
    System.out.printf("%d",sum);
    }
}