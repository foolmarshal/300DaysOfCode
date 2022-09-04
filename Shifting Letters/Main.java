import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Insert Your Code Here. Here are the steps to get started: 
        // Step-I: Define the input format using the examples from the problem description. 
        // Step-II: Parse input from standard in. 
        // Step-III: Write your algorithm to generate the required output. 
        // Note: In case of any issues use #feedback channel on Discord. 
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String str = scn.nextLine();
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        int[] shifts = new int[strArr.length];
        for(int i = shifts.length - 1 ; i >= 0 ; --i) {
            shifts[i] = Integer.valueOf(strArr[i]);
            shifts[i] += (i + 1 < shifts.length ? shifts[i + 1] : 0);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; ++i) {
            sb.append((char)('a' + ((s.charAt(i) - 'a' + shifts[i]) % 26)));
        }
        System.out.println(sb.toString());
        return;
    }
}

