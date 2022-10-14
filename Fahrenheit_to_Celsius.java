import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        float i,j;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=(i-32)*5/9;
        System.out.printf("%.2f",j);
    }
}