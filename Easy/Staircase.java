import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        String[] staircase = new String[n];
        
        for (int i=1; i<n+1; i++){
            String stair = "";
            int count = n-i;
            while (count > 0){
                stair += " ";
                count -= 1;
            }
            int count2 = i;
            while (count2 > 0){
                stair += "#";
                count2 -= 1;
            }
            staircase[i-1] = stair; 
            }
        for (String stairs:staircase){
            System.out.println(stairs);
        }
        }
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
