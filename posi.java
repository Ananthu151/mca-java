import java.util.Scanner;
class posi{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number:");
		Scanner sn=new Scanner(System.in);
		n=sn.nextInt();
		if(n==0)
			System.out.println("It is Zero!!");
		else if(n>0) 
			System.out.println("It is Positive!!");
		else
			System.out.println("It is Negative!!");
	}
}