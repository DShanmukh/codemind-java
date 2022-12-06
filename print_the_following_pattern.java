import java.util.Scanner;
class Naruto{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
   int i, j, rows;
   rows=sc.nextInt();
   for (i = rows; i >= 1; --i) {
      for (j = 1; j <= i; ++j) {
         System.out.printf("%d", j);
      }
      System.out.printf("
");
   }
}
}