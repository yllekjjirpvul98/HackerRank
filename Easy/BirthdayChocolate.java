import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     //m consecutive squares and sum of d
    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        
        int num = 0;
        for (int i=0; i<n; i++){
            if (n-i >= m){
               int sum = 0;
               for (int count=0; count<m; count++){
                    sum += s[i+count];
               }if (sum == d){
                num += 1;
           
               }
            }
              
            } return num;
            }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
