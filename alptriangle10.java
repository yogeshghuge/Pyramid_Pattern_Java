/*
A       A
bA     Ab
CbA   AbC
dCbA AbCd
EdCbAbCdE
*/

class alptriangle10
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));	
				for(int j=2; j<=n;j++)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			else
			{
				for(int j=i; j>=1;j--)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
				for(int j=1; j<=((n-i+1)*2)-3;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					if(j%2!=0)
						System.out.print((char)(j+64));
					else
						System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}