import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Adesh on 22-06-2019
 */

public class Maxx{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long[] a= new long[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

            Arrays.sort(a);
        System.out.println(a[n - 2] * a[n-1]);

    }


}


