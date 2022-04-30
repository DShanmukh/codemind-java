import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        float a,b,ave;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        ave=(a+b)/2;
        System.out.printf("%.4f", ave);
    }
}