/**
 * Created by Adesh on 19-06-2019
 */

public class Diamond {
    void print(int rows){
        int i,j,k,l;
        for(i=0;i<=rows;i++){
            for(k=(rows);k>i;k--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            for(l=2;l<i;l++){
                System.out.print("*");

            }
            System.out.println("");

        }
        for(i=0;i<rows;i++){
            for(k=0;k<i;k++){
                System.out.print(" ");
            }
            for(j=(rows-1);j>i;j--){
                System.out.print("*");

            }
            for(j=(rows-3);j>=i;j--){
                System.out.print("*");

            }
            System.out.println("");
        }
    }


    void sparseprint(int rows){
        int i,j,k;
        for(i=0;i<=rows;i++){
            for(k=(rows);k>i;k--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");

        }
        for(i=0;i<rows;i++){
            for(k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(j=(rows-1);j>i;j--){
                System.out.print(" *");

            }
            System.out.println("");
        }
    }

}

