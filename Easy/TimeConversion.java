import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
       String split[] = s.split(":");
       String time = "";
       if (split[2].charAt(2) == 'P'){
           if (Integer.valueOf(split[0]) <12){
             Integer hour = Integer.valueOf(split[0]) + 12;
             split[0] = hour.toString();  
           }  
          time = split[0] +":"+ split[1]+":"+split[2].charAt(0)+split[2].charAt(1);
       }else {
         if (Integer.valueOf(split[0]) == 12){
           split[0] = "00";
         }
         time = split[0] + ":" + split[1] + ":" +split[2].charAt(0)+split[2].charAt(1);
         }
       return time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
