import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int r,c=0,temp,f=0,i;
        for(i=0;i<=9;i++)
        {
            temp=n;
            c=0;
        while(temp!=0)
        {
            r=temp%10;
            if(i==r)
            {
                c++;
            }
            temp=temp/10;
        }
        if(c>1)
        {
            f++;
        }
    }
    if(f==0)
    {
        System.out.print("Unique Number");
    }
    else
    {
        System.out.print("Not Unique Number");
    }
}
}