import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        // Complete this function
        int num =0;
        char[] st = s.toCharArray();
        for (char character:st){
            if (Character.isUpperCase(character)) num += 1;
        }return num+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
