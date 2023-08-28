import java.util.Scanner;
public class naruto{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int m;
            m=sc.nextInt();
            int p=0;
            p=(m*(m+1))/2;
            int arr[],j,s=0;
            arr=new int[m];
            for(j=0;j<m-1;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(j=0;j<m-1;j++)
            {
                s=s+arr[j];
            }
        System.out.println(p-s);
        }
    }
}