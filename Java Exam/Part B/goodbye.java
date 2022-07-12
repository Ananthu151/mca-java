import java.util.Scanner;
class bye extends Thread
{
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter the n");
		int n=sn.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("GoodBye!");

		}
	}	
}
class divi extends Thread
{
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter the Limit");
		int n=sn.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
			

		}
	}	
}
class goodbye
{
	public static void main(String[] args) {
		bye b1=new bye();
		divi d1=new divi();
		b1.start();
		d1.start();
	}
}