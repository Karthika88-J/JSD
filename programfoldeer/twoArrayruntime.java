package programfoldeer;

import java.util.Scanner;

public class twoArrayruntime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row and Cols Size");
        int r=scan.nextInt();
        int c=scan.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter a matrix values:"+r+"x"+c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Result Array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();

    
        }
scan.close();
    }
}
