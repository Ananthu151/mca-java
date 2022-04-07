import java.util.Scanner;
class leap{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the year:");
		Scanner sn=new Scanner(System.in);
		n=sn.nextInt();
		if((n%4==0) && (n%100!=0)){
			System.out.println("It is a Leap Year!!");
		}
		else
			System.out.println("It is not a Leap Year!!");
	}
}