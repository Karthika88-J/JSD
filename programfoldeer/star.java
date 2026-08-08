package programfoldeer;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%3==0 || i%2==0)
                continue;
            System.out.println(i+ " ");
     }
    }
}
