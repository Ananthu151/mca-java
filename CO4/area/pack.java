package Graphic;
import java.util.Scanner;
interface interarea{
	 public void area();
}
public class rect implements interarea{
	int l,b;
	Scanner sn=new Scanner(System.in);
	public void area(){
		System.out.println("Enter l and b:");
		l=sn.nextInt();
		b=sn.nextInt();
		System.out.println("Area of Rectangle:"+(l*b));
	}	
}
