import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        float f,c;
        Scanner sc =new Scanner (System.in);
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
         
        
    }
}