import java.util.Scanner;
class Temperture
{
    public static void main(String args[])
    {
        float i,j;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=(i)*9/5+32;
        System.out.printf("%.2f",j);
    }
}