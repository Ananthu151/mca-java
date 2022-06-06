import java.util.Scanner;
class validate extends Exception
{
	public validate(String str)
	{
		super(str);
	}
}
class check
{
	Scanner sn=new Scanner(System.in);
	String us="Ananthu",pas="123",u,p;
	void read() throws validate
	{
		System.out.print("Enter Username:");
		u=sn.next();
		System.out.print("Enter Password:");
		p=sn.next();
		if(us.equals(u) && pas.equals(p))
		{
			System.out.print("Login Succussful!");
		}
		else{
			throw new validate("Invalid Username or Password!");
		}
	}
 
}
class exc1{
	public static void main(String[] args) {
		try
		{
			check c1=new check();
			c1.read();

		}
		catch(validate v1)
		{
			System.out.println("Exeception!!"+v1);
		}
	}
}
