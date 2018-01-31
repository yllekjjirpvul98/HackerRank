import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // Complete this function
        int[] array = new int[p.length];
        for (int i=0; i < p.length; i++){
            int tempA = i+1;
            for (int x=0; x < p.length; x++){
                if (p[x] == tempA){
                    int tempB = x+1;
                    for (int y=0; y < p.length; y++){
                        if (p[y] == tempB) {
                            array[i] = y+1;
                            break;
                        }
                    }
                  }
        }
        }return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
