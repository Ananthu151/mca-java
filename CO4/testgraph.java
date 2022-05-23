import java.util.Scanner;
import Graphic.*;
class testgraph{
	public static void main(String[] args) {
		int f=1,cc;
		rect r=new rect();
		cir c=new cir();
		sq s=new sq();
		tri t=new tri();
		while (f>0){
			System.out.print("1:Rectangle\n2:Circle\n3:Square\n4:Triangle\n5:Exit\nEnter your Choice:");
			cc=sn.nextInt();
			switch(cc){
			case 1:
				r.area();
				break;
			case 2:
				c.area();
				break;
			case 3:			
				s.area();
				break;
			case 4:
				t.area();
				break;
			case 5:f=0;
				break;
			default:f=0;
			
			}
		}
	}
}