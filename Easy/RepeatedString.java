import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
        // Complete this function
        char[] character = s.toCharArray();
        long length = character.length;
        long size = n/length;
        long loopsize = n%length;
        long sum = 0;
        long numA = 0;
        for (char a:character){
            if (a == 'a') numA +=1;
        }
        for(int i=0; i < loopsize;i++){
            if (character[i]=='a') sum+=1;
        }
        long total = size * numA;
        sum = sum + total;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
