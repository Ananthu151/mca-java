import java.util.Scanner;
public class nsum{
	public static void main(String[] args) {
		int i,sum=0;
		System.out.println("Enter n:");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
			
		}
		System.out.println("Total Sum is:"+sum);
	}
}