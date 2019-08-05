import java.util.Scanner;

/**
 * Created by Adesh on 19-06-2019
 */



public class Pattern {
    private static Pyramid p=new Pyramid();
    private static Diamond d=new Diamond();
    private static Hdiamond h=new Hdiamond();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, rows;

            System.out.println("Enter choice ");
            System.out.println("1 For sparse Pyramid ");
            System.out.println("2 For Dense Pyramid ");
            System.out.println("3 For Dense diamond ");
            System.out.println("4 For sparse diamond ");
            System.out.println("5 For dense half-Diamond ");
            System.out.println("6 For half-diamond ");
            System.out.println("7 For sparse half-diamond ");


        ch = sc.nextInt();
        sc.nextLine();
        boolean ct=true;
        while (ct) {
            switch (ch) {
                case 1:
                    System.out.println("Enter Number of rows for Sparse Pyramid");
                    rows = sc.nextInt();
                    p.sparsedpyramid(rows);
                    break;

                case 2:
                    System.out.println("Enter Number of rows for Dense Pyramid");
                    rows = sc.nextInt();
                    p.print(rows);
                    break;

                case 3:
                    System.out.println("Enter Number of rows for Dense Diamond");
                    rows = sc.nextInt();
                    d.print(rows);
                    break;
                case 4:
                    System.out.println("Enter Number of rows for sparse Diamond");
                    rows = sc.nextInt();
                    d.sparseprint(rows);
                    break;

                case 5:
                    System.out.println("Enter Number of rows for Dense Half Diamond");
                    rows = sc.nextInt();
                    d.print(rows);
                    break;
                case 6:
                    System.out.println("Enter Number of rows for sparse Half Diamond");
                    rows = sc.nextInt();
                    d.sparseprint(rows);
                    break;
                case 7:
                    System.out.println("Enter Number of rows for half Diamond");
                    rows = sc.nextInt();
                    h.print(rows);
                    break;
                case 8:
                    System.out.println("Enter Number of rows for sparse half Diamond");
                    rows = sc.nextInt();
                    h.sparseprint(rows);
                    break;



            }

            System.out.println("Do you want to change the pattern or go back ?\n"+"Enter Y for yes, N for no \r");
            String s=sc.next();
            String lo=s.toLowerCase();
            char c=lo.charAt(0);
            if(c=='y'){
                ct=false;
            }else{
                ct=true;

            }


        }
    }

}

