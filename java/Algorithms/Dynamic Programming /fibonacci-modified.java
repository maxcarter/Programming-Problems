/*
    URL: https://www.hackerrank.com/challenges/fibonacci-modified

    Problem:
        A series is defined in the following manner:

        Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation
        Tn+2 = (Tn+1)2 + Tn

        So, if the first two terms of the series are 0 and 1:
        the third term = 12 + 0 = 1
        fourth term = 12 + 1 = 2
        fifth term = 22 + 1 = 5
        ... And so on.

        Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.
        Note: Some output may even exceed the range of 64 bit integer.

    Sample input:
    0 1 5

    Sample output:
    5
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static BigInteger fib(BigInteger a, BigInteger b, int n, int count) {
        //System.out.println(a + " " + b + " " + n + " " + count);
        if (count == n - 1) {
            return b;
        } else {
            BigInteger c = a.add(b.multiply(b));
            count++;
            return fib(b, c, n, count );
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger("" + in.nextInt());
        BigInteger b = new BigInteger("" + in.nextInt());
        int n = in.nextInt();

        System.out.print(fib(a, b, n, 1));
    }
}