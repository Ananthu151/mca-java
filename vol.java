import java.util.Scanner;
public class vol{
	public static void main(String[] args) {
		int i=1;
		System.out.println("Enter l,b,h of cube:");
		Scanner sn=new Scanner(System.in);
		int l=sn.nextInt();
		int b=sn.nextInt();
		int h=sn.nextInt();
		int vol=l*b*h;
		System.out.println("Volume:"+vol);
		
	}
}