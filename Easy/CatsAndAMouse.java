import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] catAndMouse(int x, int y, int z) {
        // Complete this function
        String[] result = new String[1];
        int disA = z-x;
        int disB = z-y;
        if (disA < 0) disA = - disA;
        if (disB < 0) disB = -disB;
        if (disB > disA) result[0] = ("Cat A");
        if (disA > disB) result[0] = ("Cat B");
        if (disA == disB) result[0] = ("Mouse C");
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String[] result = catAndMouse(x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
