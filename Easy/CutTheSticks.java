import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int findingMin(int[] arr){
        int min = arr[0];
        for (int a:arr){
            min = Math.min(a, min);
        }return min;
    }
    
     static int findingMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for (int a:arr){
            min = Math.min(a, min);
        }return min;
    }
    
    static ArrayList<Integer> cutting(int[] arr){
        int min = findingMin(arr);
        ArrayList<Integer> returning = new ArrayList<Integer>();
        for (int s=0; s<arr.length; s++){
            int ans = arr[s]- min;
            arr[s] = ans;
        }
        for (int i=0; i < arr.length; i++){
            returning.add(arr[i]);
        }return returning;
    }
    //System.out.println(min);
    static ArrayList<Integer> cutting(ArrayList<Integer> arr){
        int min = findingMin(arr);
        for (int s=0; s<arr.size(); s++){
            int ans = arr.get(s)- min;
            arr.set(s, ans);
        }return arr;
    }
    
    static ArrayList<Integer> cutTheSticks(int[] arr) {
        // Complete this function
        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Integer> array = cutting(arr); //cut the chopsticks
        count.add(array.size());
        while (array.size() > 0){ //if there are still chopsticks left
            
            while (array.contains(0)){
            for (int i=0; i < array.size(); i++){
                if (array.get(i) == 0){
                   array.remove(i);
                }
            }
            }
            
            if (!(array.isEmpty())) {
            array = cutting(array); 
            count.add(array.size());
            } 
        }return count;
    }
         
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        ArrayList<Integer> result = cutTheSticks(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i != result.size() - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
