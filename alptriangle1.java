/*
AAAAAAAAA
BBBB BBBB
CCC   CCC
DD     DD
E       E
*/

class alptriangle1
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			if(i==1)
			{
				for(int j=1; j<=(n*2)-1;j++)
					System.out.print((char)(i+64));
			}
			else
			{
				for(int j=i; j<=n;j++)
					System.out.print((char)(i+64));
				for(int j=1; j<=(i*2)-3; j++)
					System.out.print(" ");
				for(int j=i; j<=n;j++)
					System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}