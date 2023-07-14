import java.util.*;
public class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
             float a,b,c,d;
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            d=sc.nextFloat();
            if((float)(c/a)<(float)(d/b)){
                System.out.println("-1");
            }
            if((float)(c/a)==(float)(d/b))
            {
                System.out.println("0");
            }
            if((float)(c/a)>(float)(d/b))
            {
                System.out.println("1");
            }
        }
    }
}