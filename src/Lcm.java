import java.util.Scanner;

/**
 * Created by Adesh on 23-06-2019
 */

public class Lcm {
    private long finder(long a,long b){
        if(a==0 || b==0){
            return 0;
        }
        long honara=a;
        long karnara=b;
        long rem=honara%karnara;
        while(rem!=0){
            honara=karnara;
            karnara=rem;
            rem=honara%karnara;

        }
        long c=a*b;
        return c/karnara;
    }

    public static void main(String[] args) {
        Lcm l = new Lcm();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(l.finder(a,b));
    }
}
//Input:
////        714552 374513
////        1321040824
////        Your output:
////        843038
//Correct output:
//        170777928