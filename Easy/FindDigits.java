import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findDigits(int n) {
        // Complete this function
        int num = 0;
        ArrayList<Integer> array = new ArrayList();
        int count = n;
        array.add(count%10);
        while (count > 0){
            count = count/10;
            int digit = count%10;
            array.add(digit);    
        }
        
        for (int digit:array){
            if (digit != 0){
                if (n%digit == 0) num += 1;
            }
        }return num;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
