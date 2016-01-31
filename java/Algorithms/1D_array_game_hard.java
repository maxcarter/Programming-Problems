import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    URL: https://www.hackerrank.com/challenges/java-1d-array

    Problem: 
        You are playing a game on your cellphone. You are given an array of length n, indexed from 0 to n−1. Each element of the array is either 0 or 1. You can only move to an index which contains 0. At first you are at the 0th position. In each move you can do one of the following things:

        Walk one step forward or backward.
        Make a jump of exactly length m forward.
        That means you can move from position x to x+1, x−1 or x+m in one move. The new position must contain 0. Also you can move to any position greater than n-1.
        
        You can't move backward from position 0. If you move to any position greater than n−1, you win the game.
        
        Given the array and the length of the jump, you need to determine if it's possible to win the game or not.

    Sample input:
        4
        5 3
        0 0 0 0 0
        6 5
        0 0 0 1 1 1
        6 3
        0 0 1 1 1 0
        3 1
        0 1 0

    Sample output:
        YES
        YES
        NO
        NO
*/
public class Solution {
    public static boolean validMove(int[] a, boolean[] v, int pos, int n, int m) {
        if(pos >= 0 && pos < n) {
           if(a[pos] == 0 && !v[pos]){
               return game(a, v, pos, n, m);
           }
        } else if (pos >=n) {
            return true;
        }
        return false;
    }
    public static boolean game(int[] a, boolean[] v, int pos, int n, int m) {
        if(pos >= n) {
            return true;
        } else {
            v[pos] = true;
            
            if(validMove(a, v, pos + 1, n, m)) {
                return true;
            } 
            if(m!=0 && validMove(a, v, pos + m, n, m)) {
                return true;
            } 
            if(validMove(a, v, pos - 1, n, m)) {
                return true;
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++) {
            int pos = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            int a[] = new int[n];
            boolean visited[] = new boolean[n];
            for(int j=0; j<n; j++){
                a[j] = in.nextInt();
                visited[j] = false;
            }
            System.out.println((game(a, visited, pos, n, m))? "YES": "NO");
        }
    }
    
}