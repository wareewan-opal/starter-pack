package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySample {

    public static void main(String[] args) {



        int[] test = {5,4,5,6,12,10};

        /***
         *
         * test[0]: 5
         * test[1]: 4
         * test[2]: 5
         * test[3]: 6
         * test[4]: 12
         * test[5]: 10
         *
         */

        System.out.println("test.lenght: "+ test.length);
        for(int i=0; i<test.length; i++) {
            System.out.println("index "+i+": "+test[i]);
        }
        int index=0;
        System.out.println("\n\nForeach Style: ");
        for(int number: test) {
            System.out.println("index "+index+": "+number);
            index++;
        }

        System.out.println("\n\nArrays 2 Dimension: ");

        int[][] test2 = {
                //[0], [1], [2], [3], [4], [5]
                 { 5,   4,   5,   6,  12,   10},//[0]
                 { 3,   7,   5,   6,  11,    1} //[1]
        };

//        System.out.println("test2[1][3]: "+ test2[1][3]  );
/***
 * in memory
 * i=0,1,3
 * j=0,1,2, ..., 6, 0,1,2,3,4,5,6
 */
/***
 *
 * monitor
 * test[0][0]: 5
 * test[0][1]: 4
 * test[0][2]: 5
 * ..
 * test[1][0]:
 *
 */
        for(int i=0; i< test2.length; i++){
            for(int j=0; j<test2[i].length; j++) {
                System.out.println("test["+i+"]"+"["+j+"]: "+test2[i][j]);
            }

        }

        System.out.println("\n\nArrays 2 Dimension Foreach: ");
        int indexTest =0;
        for(int[] i: test2) {
            int indexTest2 =0;
            for(int j: i) {
                System.out.println("test["+indexTest+"]"+"["+indexTest2+"]: "+j);
                indexTest2++;
            }
            indexTest++;
        }

    }
}
