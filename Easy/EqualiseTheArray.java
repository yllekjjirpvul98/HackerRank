import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i=0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        } 
        int max = 0;
        int maxKey = 0;
        for (int key:map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                maxKey = key;
            }
        }
        int value = 0;
        for (int key:map.keySet()){
            if (key != maxKey){
                value += map.get(key);
            }
        }return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
