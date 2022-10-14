import java.util.Scanner;
class Amount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        int area1,area2,l1,b1,area3,amount;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        area1=l*b;
         l1=l+2*w;
        b1=b+2*w;
        area2=l1*b1;
        area3=area2-area1;
        amount=area3*c;
        if(l<=0 ||b<=0)
        {
            System.out.println("Impossible");
        }
        else
        {
            System.out.println(amount);
        }
        
        
        
    }
}