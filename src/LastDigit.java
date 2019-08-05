import java.util.Scanner;

/**
 * Created by Adesh on 22-06-2019
 */

public class LastDigit {

    private long fib(int n){
        int[] list=new int[n];

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }

        list[0]=0;
        list[1]=1;

        for(int i=2;i<n;i++){
            list[i]=(list[i-1]+list[i-2])%10;
        }
        long x = list[n - 1];
        long y= list[n-2];
        long z=x+y;
        if(z>=10){
        while(z>=10){
            z=z%10;
            }
        return z;
        }
        return z;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        LastDigit fb=new LastDigit();
        System.out.println(fb.fib(n));
    }

}

