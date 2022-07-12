import java.util.Scanner;
class volume{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n,f=0,a,b;
		findvolume fv=new findvolume();
		float r;
		while(f<1){
			System.out.println("1:Cube");
			System.out.println("2:Sphere");
			System.out.println("3:Cone");
			System.out.println("4:Exit");
			System.out.print("Enter your Option:");
			n=sn.nextInt();
			switch(n){
				case 1:System.out.println("Enter side:");
				a=sn.nextInt();
				fv.volume(a);
				break;
				case 2:System.out.println("Enter radius:");
				r=sn.nextFloat();
				fv.volume(r);
				break;
				case 3:System.out.println("Enter Radius and height:");
				r=sn.nextFloat();
				b=sn.nextInt();
				fv.volume(r,b);
				break;
				case 4:f=2;
				break;
				default:f=2;
				

			}
		}


	}
}
class findvolume{
	void volume(int l)
	{
		float a;
		a=l*l*l;
		System.out.println("Volume of Cube is:"+a);
	}
	void volume(float r)
	{
		double a;
		a=1.33*3.14*r*r*r;
		System.out.println("Volume of Sphere is:"+a);
	}
	void volume(float r,int h)
	{
		double a;
		a=r*r*3.14*h/3;
		System.out.println("Volume of Cone is:"+a);
	}

}
