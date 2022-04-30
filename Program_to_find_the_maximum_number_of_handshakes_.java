import java.util.Scanner;
class Handshake
{
    public static void main (String args[])
    {
        int n,total_handshakes;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        total_handshakes=n*(n-1)/2;
        System.out.println(total_handshakes);
    }
}