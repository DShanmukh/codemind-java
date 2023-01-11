import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[],i,c=0,temp,j,c1=0,h;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            temp=a[i];
            
            c=0;
            if(temp==1)
            {
                c=1;
            }
            for(j=2;j<temp;j++)
            {
                if(temp%j==0)
                {
                    c=1;
                    break;
                }
    
            }
            if(c==0)
            {
                  c1+=1;
            }
        }
        System.out.print(c1);
    }
}