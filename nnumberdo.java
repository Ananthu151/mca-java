import java.util.Scanner;
public class nnumberdo{
	public static void main(String[] args) {
		int i=1;
		System.out.println("Enter n:");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=n);
	}
}