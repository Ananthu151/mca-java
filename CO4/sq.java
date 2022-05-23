package Graphic;
import java.util.Scanner;
public class sq implements interarea{
	int l;
	Scanner sn=new Scanner(System.in);
	public void area(){
		System.out.println("Enter side");
		l=sn.nextInt();
		System.out.println("Area of Square:"+(l*l));
	}
}
