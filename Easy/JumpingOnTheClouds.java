import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        // Complete this function
        int dis = 0;
        int num = 0;
        while(dis < c.length-3){ //to avoid array out of bound
            if(c[dis+2] != 1){
                dis += 2;
                num += 1;
            }else {
                dis += 1;
                num += 1;
            }
        }
        return num+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
