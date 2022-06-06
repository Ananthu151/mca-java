import java.util.Scanner;
class nega extends Exception
{
	public nega(String str)
	{
		super(str);
	}
}
class avg
{
	Scanner sn=new Scanner(System.in);
	int avg=0,n,lim;
	void read() throws nega
	{
		System.out.println("Enter Limit:");
		lim=sn.nextInt();
		System.out.println("Enter Numbers:");
		for (int i=0;i<lim;i++) 
		{
			n=sn.nextInt();
			if(n<0)
			{
				throw new nega("Negative Number Entered!");
			}
			else
			{
				avg=avg+n;
			}
			
		}
		System.out.println("Average is:"+(avg/lim));
	}
 
}
class exc2{
	public static void main(String[] args) {
		try
		{
			avg c1=new avg();
			c1.read();

		}
		catch(nega n1)
		{
			System.out.println("Exeception!!"+n1);
		}
	}
}
