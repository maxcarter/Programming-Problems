import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    URL: https://www.hackerrank.com/challenges/arrays-ds
    
    Problem: Given an array of N integers, and you have to print the integers in reverse order.

    Sample input:
    4
    1 4 3 2

    Sample output:
    2 3 4 1
*/
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        for (int i = n - 1; i >= 0; i --) {
            System.out.print(arr[i] + " ");
        }
    }
}