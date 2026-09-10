package programfoldeer;
import java.util.Scanner;

class arrayruntime {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     System.out.println("Enter a Array size");
     int size=scan.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++){
        System.out.print("Enter array value at index:"+i+" :");
        arr[i]=scan.nextInt();
     }
     for(int i=0;i<size;i++){
        System.out.println("arr["+i+"]="+arr[i]);
     }
    
}
}