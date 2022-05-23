package Graphic;
import java.util.Scanner;
public class tri implements interarea{
	int l,b;
	Scanner sn=new Scanner(System.in);
	public void area(){
		System.out.println("Enter height and breadth:");
		l=sn.nextInt();
		b=sn.nextInt();
		System.out.println("Area of triangle:"+(0.5*l*b));
	}
}
