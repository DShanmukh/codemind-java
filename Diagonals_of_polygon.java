import java.util.Scanner;
class Diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        d=(n*(n-3))/2;
        System.out.println(d);
    }
}