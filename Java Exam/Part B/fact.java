import java.util.Scanner;
class wel extends Thread
{
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter the limit:");
		int n=sn.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("welcome!");

		}
	}	
}
class fac extends Thread
{
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		int fact=1;
		System.out.println("Enter the n:");
		int n=sn.nextInt();
		for(int i=1;i<=n;i++)
		{	
			fact=1;
			for (int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println("Factoial of "+i+" is "+fact);
		}
	}	
}
class fact
{
	public static void main(String[] args) {
		wel w=new wel();
		fac f=new fac();
		w.start();
		f.start();
	}
}