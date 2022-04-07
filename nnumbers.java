import java.util.Scanner;
public class nnumbers{
	public static void main(String[] args) {
		int i=1;
		System.out.println("Enter n:");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		while(i<=n){
			System.out.print(i+" ");
			i++;
		}
	}
}