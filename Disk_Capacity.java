import java.util.Scanner;
class DiskCapacity
{
    public static void main (String args[])
    {
        int t,s,b,Capacity;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
         s=sc.nextInt();
          b=sc.nextInt();
          Capacity=2*(512*(t*s*b));
          System.out.println(Capacity);
          sc.close();
    }
}