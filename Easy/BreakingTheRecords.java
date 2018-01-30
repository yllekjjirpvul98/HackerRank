import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        // Complete this function
        int schange[] = new int[2];
        int high = score[0];
        int low = score[0];
        int hchange = 0;
        int lchange = 0;
        for (int s:score){
            if (s > high) {
               high = s;
               hchange +=1;
            }else if (s < low) {
                low = s;
                lchange +=1;
            }
        }schange[0] = hchange;
        schange[1] = lchange;
        return schange;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}