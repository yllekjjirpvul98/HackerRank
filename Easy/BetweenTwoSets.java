import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int total=0;
        for (int i=1; i<=100; i++){
            for (int x=0; x<a.length; x++){
                if (!((i % a[x] == 0))) {
                    break;
                }else if (x == a.length-1) {
                    for (int y=0; y<b.length; y++) {
                        if (!((b[y] % i) == 0)){
                            break;
                    }else if (y == b.length-1) total+=1;   
                    }
                }
            }
        }return total;
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

