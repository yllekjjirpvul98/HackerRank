import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        // Complete this function
        int num = 0;
         String[] stringA = s.split("(?<=\\G...)"); //use of regex - regular expression   
        for (String st:stringA){
           if (st != "SOS") {
               if (st.charAt(0) != 'S') num += 1;
               if (st.charAt(1) != 'O') num += 1;
               if (st.charAt(2) != 'S') num += 1;
           }
         }return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
