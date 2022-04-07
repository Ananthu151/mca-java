import java.util.Scanner;
class array{
    public static void main(String[] args) {
        System.out.println("Enter total numbers of elements in array:");
        Scanner sn =new Scanner(System.in);
        int n,s,f=-1;
        n=sn.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        System.out.println("Array is:");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("\nEnter the element to search:");
        s=sn.nextInt();
        for(int j=0;j<n;j++){
            if(s==a[j]){
                f=j;
            }
        }
        if(f<0)
        System.out.println("Element not found!");
        else
        System.out.println("Element found at location: "+f);
        sn.close(); 
    }               
} 