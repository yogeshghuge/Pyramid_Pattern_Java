/*
1       1
21     12
321   123
4321 1234
543212345
4321 1234
321   123
21     12
1       1
*/

class DimondRectangle4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
						System.out.print(j);	
				for(int j=2; j<=n;j++)
					System.out.print(j);
			}
			else
			{
				for(int j=i; j>=1;j--)
					System.out.print(j);
				for(int j=1; j<=((n-i+1)*2)-3;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n-1; i>=1;i--)
		{
			
				for(int j=i; j>=1;j--)
					System.out.print(j);
				for(int j=1; j<=((n-i+1)*2)-3;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print(j);
	
			System.out.println();
		}

	}
}