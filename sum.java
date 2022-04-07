import java.util.Scanner;
public class sum{
	public static void main(String[] args) {
		System.out.println("Enter two Numbers:");
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int b=sn.nextInt();
		int sum=a+b;
		System.out.println("Sum is:"+sum);
	}
}