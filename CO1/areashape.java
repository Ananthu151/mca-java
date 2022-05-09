import java.util.Scanner;
class areashape{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n,f=0,x,a,b,c;
		findarea fa=new findarea();
		float r;
		while(f<1){
			System.out.println("1:Square");
			System.out.println("2:Rectangle");
			System.out.println("3:Circle");
			System.out.println("4:Triangle");
			System.out.println("5:Exit");
			System.out.print("Enter your Option:");
			n=sn.nextInt();
			switch(n){
				case 1:System.out.print("Enter length:");
				a=sn.nextInt();
				fa.area(a);
				break;
				case 2:System.out.println("Enter length and Breadth:");
				a=sn.nextInt();
				b=sn.nextInt();
				fa.area(a,b);
				break;
				case 3:System.out.print("Enter Radius:");
				r=sn.nextFloat();
				fa.area(r);
				break;
				case 4:System.out.println("Enter three sides:");
				a=sn.nextInt();
				b=sn.nextInt();
				c=sn.nextInt();
				fa.area(a,b,c);
				break;
				case 5:f=2;
				break;
				default:f=2;
				

			}
		}


	}
}
class findarea{
	void area(int l)
	{
		float a;
		a=l*l;
		System.out.println("Area of Square is:"+a);
	}
	void area(int l,int b)
	{
		float a;
		a=l*b;
		System.out.println("Area of Rectangle is:"+a);
	}
	void area(float r)
	{
		float a;
		a=(float)3.14*r*r;
		System.out.println("Area of Circle is:"+a);
	}
	void area(int a,int b,int c)
	{
		double aa;
		float s=(a+b+c)/2;
		aa=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is:"+aa);
	}

}
