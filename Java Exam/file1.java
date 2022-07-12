import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
class file1
{
	public static void main(String[] args) {
		
		try
		{
		FileInputStream list=new FileInputStream("list.txt");
		FileOutputStream e=new FileOutputStream("even.txt");
		FileOutputStream o=new FileOutputStream("odd.txt");
		int i;
		while((i=list.read())!=-1)
		{
			if(i%2==0)
				e.write(i);
			else
				o.write(i);

		}
		}
		catch(Exception es){
			System.out.println(es);
		}

	}
}