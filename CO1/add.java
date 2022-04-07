import java.util.Scanner;
class add{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		sum s1=new sum();
		System.out.println("Enter number 1:");
		s1.a=sn.nextInt();
		System.out.println("Enter number 2:");
		s1.b=sn.nextInt();
		s1.cal();
	}
}
class sum{
	int a,b,c;
	void cal(){
		c=a+b;
		System.out.println("sum is:"+c);
	}
	
}