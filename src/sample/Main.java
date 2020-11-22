package sample;

public class Main {


    public static void main(String[] args) {

        int a = 1;
        

        System.out.println("Clear: "+ a);
        /**
         * == --> equal
         * != --> not equal
         * >= --> more than and equal
         * <= --> less than equal
         * ++ --> increase one
         * -- --> decrease one
         */

        int i = 0;
        System.out.println("1: "+ ++i); // i=i+1, i+=1  --> 1
        i = 0;
        System.out.println("2: "+ i++); // --> 0

        System.out.println("3: "+ i++); // --> 1

        System.out.println("4: "+ i); // --> 2

        boolean isRent = false;
        if(isRent) {
            System.out.println("isRent: "+ isRent);
        }


        // Loop

        // for
        for (int kai=0; kai < 10; kai++ ) {
            System.out.println(kai);
        }

        // do while
        int ped=11;
        do {
            System.out.println(ped);
            ped++;
        } while (ped < 10);

        // while
        int pig=0;
        while (pig < 10) {
            System.out.println(pig);
            pig++;
        }

    }

}
