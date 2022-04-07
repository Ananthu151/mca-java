import java.util.Scanner;
public class area{
	public static void main(String[] args) {
		System.out.println("Enter radius of circle:");
		Scanner sn=new Scanner(System.in);
		float r=sn.nextFloat();
		float area=(float)(3.14*r*r);
		float peri=(float)(2*3.14*r);
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
		
	}
}