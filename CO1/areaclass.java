import java.util.Scanner;
class areaclass{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		cal c1=new cal();
		System.out.println("Enter the Radius:");
		c1.r=sn.nextInt();
		c1.area();
		c1.peri();

	}
}
class cal{
	float area,peri;
	int r;
	void area(){
	area=(float)3.14*r*r;
	System.out.println("Area is"+area);
	}
	void peri(){
	peri=(float)3.14*2*r;
	System.out.println("Perimeter is"+peri);
	}
}