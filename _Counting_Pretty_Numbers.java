import java.util.Scanner;
class Captain 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,i;
		m=sc.nextInt();
		for(i=0;i<m;i++)
		{
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int r=0,c=0,j,l=0;
		for(j=n;j<=k;j++)
		{
			l=j;
			r=l%10;
			if(r==2 || r==3 || r==9)
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
}
