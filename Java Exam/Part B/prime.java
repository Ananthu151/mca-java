import java.util.Scanner;
class checkprime extends Exception
{
	checkprime(String str)
	{
		super(str);
	}
}
class prime
{
	public static void main(String[] args) {
		try 
		{
			int n,sum=0,m,f=0;
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the Limit:");
			n=sn.nextInt();
			System.out.println("Enter the Number:");
			for(int i=0;i<n;i++) 
			{	f=0;
				m=sn.nextInt();
				for (int j=2;j<m;j++) 
				{
					if(m%j==0)
					{
						f=1;
						break;
					}
					
				}
				if(f==1)
				{
					throw new checkprime("Number inputted is a Non-Prime!");
				}
				else
				{
					sum=sum+m;
				}
			}
			System.out.println("Sum of Numbers:"+sum);
		}
		catch(checkprime c1)
		{
			System.out.println("Exception:"+c1);
		}
	}
}