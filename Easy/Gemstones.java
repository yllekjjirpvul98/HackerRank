import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){

        char[] character = arr[0].toCharArray();
        ArrayList<Character> characterA = new ArrayList<Character>();
        for (char chars:character){
            if (! characterA.contains(chars)){
                characterA.add(chars);
            }       
        }
        ArrayList<Character> temp = new ArrayList(characterA);
            for (char chars:characterA){
            for (int i=1; i < arr.length; i++){ 
                if (! arr[i].contains(Character.toString(chars))){
                    temp.remove(new Character(chars));
                }
            }
            }return temp.size();
       }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
