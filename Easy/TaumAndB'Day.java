import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long taumBday(long b, long w, long x, long y, long z) {
        // Complete this function
        long priceX = x;
        long priceY = y;
        if (priceX > (y+z)){
            priceX = y+z;
        }
        if (priceY > x+z){
            priceY = x + z;
        }long sum = b*priceX + w*priceY;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }
}
