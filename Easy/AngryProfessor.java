import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String angryProfessor(int k, int[] a) {
        // Complete this function
        int num = 0;
        String ans = "";
        for (int i=0; i < a.length; i++){
            if (a[i] <= 0){
                num += 1;
            }
        } if (num >= k) ans = "NO";
        else ans = "YES";
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }
}
