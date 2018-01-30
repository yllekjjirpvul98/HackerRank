import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        double size = arr.length;
        double p = 0;
        double n = 0;
        double z = 0;
        for (int i=0; i < size; i++){
            if (arr[i] > 0) {
                p += 1;
            }else if (arr[i] < 0){
                n+=1;
            }else if (arr[i] == 0){
                z += 1;
            }
        }
       
        DecimalFormat numberformat = new DecimalFormat("#.000000");
        System.out.println(numberformat.format(p/arr.length));
        System.out.println(numberformat.format(n/arr.length));
        System.out.println(numberformat.format(z/arr.length));
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
