import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Insert Your Code Here. Here are the steps to get started: 
        // Step-I: Define the input format using the examples from the problem description. 
        // Step-II: Parse input from standard in. 
        // Step-III: Write your algorithm to generate the required output. 
        // Note: In case of any issues use #feedback channel on Discord. 
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        int[] candies = new int[strArr.length];
        int mx = 0;
        for(int i = 0 ; i < candies.length ; ++i) {
            candies[i] = Integer.valueOf(strArr[i]);
            mx = Math.max(mx, candies[i]);
        }
        int extraCandies = Integer.valueOf(scn.nextLine());
        boolean[] result = new boolean[candies.length];
        System.out.print("[");
        for(int i = 0 ; i < result.length ; ++i) {
            result[i] = (candies[i] + extraCandies >= mx);
            System.out.print(result[i]);
            if(i < candies.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        return;
    }
}

