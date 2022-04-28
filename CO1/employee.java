import java.util.Scanner;
class employee{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n,f=0,x;
		System.out.print("Enter Number of Employees");
		n=sn.nextInt();
		emp e[]=new emp[10];
		for (int i=0;i<n;i++){
			System.out.println("Enter Details of Employees:"+(i+1));
			e[i].read();
		}
		System.out.print("Enter Eno to Search:");
		x=sn.nextInt();
		for (int i=0;i<n;i++) {
			if(e[i].eno==x){
				f=1;
				System.out.println("Details of Employees:");
				e[i].display();
				break;
			}
		}
		if(f==0){
			System.out.println("Employee not Found!!..");
		}

	}
}
class emp{
	Scanner sn=new Scanner(System.in);
	int eno;
	String ename;
	float salary;
	void read()
	{
		System.out.print("Enter Eno:");
		eno=sn.nextInt();
		System.out.print("Enter Ename:");
		ename=sn.next();
		System.out.print("Enter Salary:");
		salary=sn.nextFloat();
	}
	void display()
	{
		System.out.print("Eno:"+eno);
		System.out.print("Name:"+ename);
		System.out.print("Salary:"+salary);
	}
}
