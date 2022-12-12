import java.util.Scanner;
class Naruto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n1, n2, max;
   n1=sc.nextInt();
   n2=sc.nextInt();
    max = (n1 > n2) ? n1 : n2;

    while (true) 
    {
        if (max % n1 == 0 && max % n2 == 0)
        {
            System.out.printf("%d", max);
            break;
        }
        ++max;
    }
    }
}