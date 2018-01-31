import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int page = 0;
        int ans = 0;
        if (p%2 != 0){
            page = (p-1)/2;
        }else page = p/2;
        if (Math.ceil(n/2)-page > page) ans = page;
        else ans = (int)Math.ceil(n/2)-page;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}