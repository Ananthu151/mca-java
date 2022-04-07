import java.util.Scanner;
class symetric{
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter row and column");
        
        int r,c,f=0;
        r=sn.nextInt();
        c=sn.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.println("Element:["+i+"]["+j+"]:");
            m1[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            m2[i][j]=m1[j][i];
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(" "+m1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(" "+m2[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            if(m1[i][j]!=m2[i][j])
                f=1;
        }
    }
        if(f==1)
            System.out.println("Its not symmetric!!");
        else
            System.out.println("Its symmetric!!");
        sn.close(); 
    }               
} 