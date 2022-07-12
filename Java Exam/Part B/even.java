import java.util.Scanner;
class checkeven extends Exception
{
	checkeven(String str)
	{
		super(str);
	}
}
class even
{
	public static void main(String[] args) {
		try 
		{
			int n,sum=0,m;
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the Limit:");
			n=sn.nextInt();
			System.out.println("Enter the Number:");
			for(int i=0;i<n;i++) 
			{
				m=sn.nextInt();
				if(m%2==0)
				{
					throw new checkeven("Number inputted is Even!");
				}
				else
				{
					sum=sum+m;
				}
			}
			System.out.println("Sum of Numbers:"+sum);
		}
		catch(checkeven c1)
		{
			System.out.println("Exception:"+c1);
		}
	}
}