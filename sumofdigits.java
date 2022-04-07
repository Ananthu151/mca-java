import java.util.Scanner;
public class sumofdigits{
	public static void main(String[] args) {
		int i,sum=0,r;
		System.out.println("Enter n:");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		while(n>0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		
			
		System.out.println("Sum of Digits:"+sum);
	}
}