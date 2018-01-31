import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    public static int reversed(Integer date){
        String day = date.toString();
        char[] days = day.toCharArray();
        char[] reversed = new char[days.length];
        for (int i=0; i < days.length; i++){
            reversed[days.length-1-i] = days[i];
        }
        String s = new String(reversed);
        return Integer.valueOf(s);
    }
    
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        int num = 0;
        for (int x=i; x <= j; x++){
            double sum = x - reversed(x);
            if (sum < 0) sum = -sum;
            double ans = sum/k;
            if (Math.floor(ans) == ans) num += 1; //check whether it is a whole number
        }return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
