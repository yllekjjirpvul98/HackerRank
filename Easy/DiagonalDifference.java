import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sumA = 0;
        int sumB = 0;
        int n = a.length;
        for (int i=0; i < n; i++){
            sumA += a[i][i];
            sumB += a[i][n-1-i];
         }
     int sum = sumA - sumB;
     if (sum < 0){
         sum = -sum;
     }return sum;
        }
    
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
