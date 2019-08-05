import java.util.Scanner;

/**
 * Created by Adesh on 22-06-2019
 */

public class Fibonacci {

     private long fib(int n){
         int[] list=new int[n+1];

         if(n==0){
             return 0;
         }else if(n==1){
             return 1;
         }

        list[0]=0;
        list[1]=1;

        for(int i=2;i<(n+1);i++){
            list[i]=list[i-1]+list[i-2];
        }
        return list[n];
     }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
        Fibonacci fb=new Fibonacci();
        System.out.println(fb.fib(n));
    }

}

