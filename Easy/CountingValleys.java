import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        // Complete this function
       char[] character = s.toCharArray();
       int height = 0;
       int num =0;
       String status = "";
       for (char chars:character){
           if (chars=='U') height += 1;
           if (chars=='D') height -=1;
           if ((height+1 == 0) && (height < 0)) status = "downhill";
           if (status=="downhill" && height ==0){
               num += 1;
               status = "";
           }
       }return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
