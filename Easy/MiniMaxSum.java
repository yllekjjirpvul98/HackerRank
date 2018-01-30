import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long sum[] = new long[arr.length];
        long total = 0;
        for (int i=0; i < arr.length; i++){
           total += arr[i];
        }
        for (int i=0; i<arr.length; i++){
            long sums = total - arr[i];
            sum[i] = sums;
        }
       long max = sum[0];
       long min = sum[0];
       for (int i=0; i<sum.length; i++){
           if (sum[i] > max){
               max = sum[i];
           }
           if (sum[i] < min){
               min = sum[i];
           }
       }
        System.out.println(min + " "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
