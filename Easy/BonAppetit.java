import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int shared = 0;
        int pay = 0;
        for (int i=0; i < n; i++){
            if (!(i == k)){
                shared += ar[i];
            }
        }if (shared/2 == b) System.out.println("Bon Appetit");
        else {pay = b-shared/2;
              System.out.println(pay);
             } 
           
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
      
    }
}
