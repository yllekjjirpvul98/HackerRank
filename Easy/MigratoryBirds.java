import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++){
            if (map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }else {
                map.put(ar[i], 1);
            }
        }
        int max = ar[0];
        for (int key:map.keySet()){
            if (map.get(key) > map.get(max)) max= key;
            else if (map.get(key) == max) {
                if(key > max) max = key;
            }
        }return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
