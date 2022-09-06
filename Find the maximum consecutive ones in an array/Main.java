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
        String str = scn.nextLine();
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        int mx = 0, cur = 0;
        for(int i = 0 ; i < strArr.length ; ++i) {
            if(strArr[i].equals("1")) {
                ++cur;
            } else {
                cur = 0;
            }
            mx = Math.max(mx, cur);
        }
        System.out.println(mx);
        return;
    }
}

