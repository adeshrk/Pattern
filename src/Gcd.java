import java.util.Scanner;

/**
 * Created by Adesh on 22-06-2019
 */

public class Gcd {
    private int calgcd(int a,int b) {
        if (a >= 1 && b >= 1) {

            int temp = 0;
            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            return temp;
        }
            return 0;
    }

    public static void main(String[] args) {
        Gcd g=new Gcd();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(g.calgcd(a,b));

    }
}

