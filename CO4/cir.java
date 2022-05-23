package Graphic;
import java.util.Scanner;
public class cir implements interarea{
	float r;
	Scanner sn=new Scanner(System.in);
	public void area(){
		System.out.println("Enter r:");
		r=sn.nextInt();
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
}
