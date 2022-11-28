import java.util.*;
class Ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int a,i,j,k,f=0;
    a=sc.nextInt();
     for(i=0;i<a;i++)
    {
         for(j=0;j<a;j++)
         {
              for(k=0;k<a;k++)
              {
                 if(a==(int)((Math.pow(2,i))*(Math.pow(3,j))*(Math.pow(5,k))))
                 {
                     f=1;
                 }
              }
         }
    }
    if(f==1)
    {
        System.out.printf("Ugly Number");
    }
    else
    {
        System.out.printf("Not Ugly Number");
    }
}
}