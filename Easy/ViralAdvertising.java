import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        // Complete this function
        int like  = 5/2;
        int sum = 5/2;
        for (int i = 1; i < n; i++){
            like = (like * 3)/2;
            sum = sum + like;
        }return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
