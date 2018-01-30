import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int sum = 0;
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0; i <n ; i++){
            if (hash.containsKey(ar[i])){
                hash.put(ar[i], hash.get(ar[i])+1);
            }else {
                hash.put(ar[i], 1);
            }
        }
        for (int key:hash.keySet()){
            sum += hash.get(key)/2;
        }return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
