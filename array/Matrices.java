import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length; //row
        int m=matrix[0].length; //columns
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the matrix number ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
}
