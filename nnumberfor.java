import java.util.Scanner;
public class nnumberfor{
	public static void main(String[] args) {
		int i;
		System.out.println("Enter n:");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		for(i=1;i<=n;i++){
			System.out.print(i+" ");
			
		}
	}
}