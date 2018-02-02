import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        // Complete this function
        int i = 0;
        int energy = 100;
        while (i >= 0){
            int position = (i+k)%(c.length);
            i = position;
            if (c[i] == 1) energy -= 3;
            else energy -=1;
            if (i == 0) break;
        }return energy;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
