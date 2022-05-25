import java.util.Scanner;
import domath.doadd;
import domath.dosub;
import domath.dopro;
import domath.dodiv;
import domath.docal;
class testmath{
	public static void main(String[] args) {
		int f=1,cc;
		Scanner sn=new Scanner(System.in);
		doadd da=new doadd();
		dosub ds=new dosub();
		dopro dp=new dopro();
		dodiv dd=new dodiv();
		while (f>0){
			System.out.print("1:Addion\n2:Substration\n3:Multipilcation\n4:Division\n5:Exit\nEnter your Choice:");
			cc=sn.nextInt();
			switch(cc){
			case 1:
				da.calculate();
				break;
			case 2:
				ds.calculate();
				break;
			case 3:			
				dp.calculate();
				break;
			case 4:
				dd.calculate();
				break;
			case 5:f=0;
				break;
			default:f=0;
			
			}
		}
	}
}