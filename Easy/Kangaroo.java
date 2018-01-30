import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String ans = "";
        for (int i=0; i >= 0; i++){
            int dis1 = x1 + i*v1;
            int dis2 = x2 + i*v2;
            if (dis1 == dis2){
                 ans = "YES";
                break;
            }else if (dis2 >= dis1 && v2 >= v1 || dis1 >= dis2 && v1 >= v2){
                ans = "NO";
                break;
            }
        }return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
