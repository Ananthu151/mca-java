
import java.util.Scanner;
class addmatrix
{
	int r;
	int c;
	int m1[][]=new int[10][10];
	int m2[][]=new int[10][10];
	void input()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter row and column");
        r=sn.nextInt();
        c=sn.nextInt();
        System.out.println("Enter the elements of matrix 1:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.println("Element:["+i+"]["+j+"]:");
            m1[i][j]=sn.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.println("Element:["+i+"]["+j+"]:");
            m2[i][j]=sn.nextInt();
            }
        }

	}
	void add()
	{
		int sum[][]=new int[r][c];
		for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("Matrix after Addition:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
            System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }	
        
	}
}
class matrix
{
	public static void main(String[] args) {
		addmatrix m=new addmatrix();
		m.input();
		m.add();

	}
}