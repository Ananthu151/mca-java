
class number{
	int no;
	number(int no) 
	{ 
		this.no = no; 
	}
}

class swap{
	public static void interchange(number n1, number n2)
	{
		int temp = n1.no;
		n1.no = n2.no;
		n2.no = temp;
	}
	public static void main(String[] args)
	{
		number n1 = new number(1);
		number n2 = new number(2);
		System.out.println("Before Interchange\nn1.no = " + n1.no);
		System.out.println("n2.no = " + n2.no);
		interchange(n1, n2);
		System.out.println("After Interchange\nn1.no = " + n1.no);
		System.out.println("n2.no = " + n2.no);
	}
}
