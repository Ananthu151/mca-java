import java.util.Scanner;
public class vowel{
	public static void main(String[] args) {
		int f=0;
		System.out.println("Enter:");
		Scanner sn=new Scanner(System.in);
		char n=sn.next().charAt(0);
		switch(n){
			case 'a':f=1;
			break;
			case 'e':f=1;
			break;
			case 'i':f=1;
			break;
			case 'o':f=1;
			break;
			case 'u':f=1;
			break;
			case 'A':f=1;
			break;
			case 'E':f=1;
			break;
			case 'I':f=1;
			break;
			case 'O':f=1;
			break;
			case 'U':f=1;
			break;
			
			default:f=0;
		}
		if(f==1)
			System.out.println("Its a VOWEL!!");
		else
			System.out.println("Its not a VOWEL!!");
		
	}
}