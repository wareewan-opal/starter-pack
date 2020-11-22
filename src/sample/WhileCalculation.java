package sample;

import java.math.BigInteger;

public class WhileCalculation {

    public void showNumber(int from, int to) {
        while (from <= to) {
            System.out.println(from + " ");
            from++;
        }
    }

    public int sumNumber(int from, int to) {
        int sum = 0;
        while (from <= to) {
            sum += from;
            from++;
        }
        return sum;
    }

    public int gcd(int num1, int num2) {
        while(num1 != num2) {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
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
