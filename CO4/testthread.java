import java.util.Scanner;
class multi extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Multiplication Table of 5:");
		for(i=1;i<=10;i++)
		{
			System.out.println("5x"+i+"="+(i*5));
		}
	}
}
class prime extends Thread
{
	int n;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n:");
		n=sn.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i/2;j++)
			{
				if(i%j==0)
				{
					System.out.println(i);
				}
			}	
		}
		

	}

}
class testthread{
	public static void main(String[] args) {
		multi m=new multi();
		prime p=new prime();
		m.start();
		p.start();
	}
}