import java.util.Scanner;
class Main
{
	public static void main(String args[]) 
	{
		int n,a[],i,k,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		if(a[i]%k==0)
		{
			count++;
		}
		System.out.println(count);
	}
}