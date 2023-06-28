import java.util.*;
public class Naruto{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int m;
        m=(int)Math.abs(n);
        if(m%2==0)
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}