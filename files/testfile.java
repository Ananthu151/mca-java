import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
public class testfile {
 public static void main(String[] args) 
 {
 	try{
 FileInputStream source = new FileInputStream ("list.txt");
 FileOutputStream destination_odd=new FileOutputStream("odd1.txt");
 FileOutputStream destination_even=new FileOutputStream("even1.txt");
 int i;
 while((i = source.read()) != -1){
 if(i%2==0) {
 destination_even.write(i);
 }
 else {
 destination_odd.write(i);
 }
 }
 System.out.println("copied");
 source.close();
 destination_even.close();
 destination_odd.close();
}
catch(Exception e){
System.out.println(e);
 }
}
}