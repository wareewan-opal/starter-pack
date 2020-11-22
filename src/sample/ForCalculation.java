package sample;

import java.math.BigInteger;

public class ForCalculation {

    public void showNumber(int from, int to) {
        for (int i=from; i <= to; i++) {
            System.out.println(from + " ");
        }
    }

    public int sumNumber(int from, int to) {
        int sum = 0;
        for (int i =from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    public int gcd(int num1, int num2) {
        int i;
        for(i=num1; i != num2; i++) {
            if(i > num2)
                i -= num2;
            else
                i -= i;
        }
        return i;
    }

    public int gcdBigInteger(int num1, int num2) {
        BigInteger big1 = new BigInteger(String.valueOf(num1));
        BigInteger big2 = new BigInteger(String.valueOf(num2));
        return big1.gcd(big2).intValue();
    }

    public static void main(String[] args) {
        WhileCalculation opal = new WhileCalculation();
        System.out.print("showNumber: ");
        opal.showNumber(10, 20);

        System.out.println();
        System.out.println("sumNumber: " + opal.sumNumber(1, 3));

        System.out.println();
        System.out.println("gcd: " + opal.gcd(3, 27));

    }
}
