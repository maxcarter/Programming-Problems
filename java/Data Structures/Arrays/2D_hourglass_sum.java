import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    URL: https://www.hackerrank.com/challenges/2d-array

    Problem: 
        You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:
        a b c
          d
        e f g
        The sum of an hourglass is the sum of all the numbers within it.
        In this problem, you have to print the largest sum among all the hourglasses in the array.

    Sample input:
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0

    Sample output:
        19
*/
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSum = -1000;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    sum = sum + arr[i + 1][j + 1];
                    sum = sum + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.print(maxSum);
    }
}