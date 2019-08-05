/**
 * Created by Adesh on 19-06-2019
 */

public class Pyramid {

        private int i,j,k;

        void print(int rows){

            for(i=0;i<=rows;i++){
                for(k=(rows);k>i;k--){
                    System.out.print(" ");
                }
                for(j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println("");

            }

       }

       void sparsedpyramid(int rows){
           for(i=0;i<=rows;i++){
               for(k=(rows);k>i;k--){
                   System.out.print(" ");
               }
               for(j=0;j<i;j++){
                   System.out.print(" *");
               }
               System.out.println("");

           }
       }

    }

