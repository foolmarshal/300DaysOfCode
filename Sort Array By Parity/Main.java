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
        int[] nums = new int[strArr.length];
        for(int i = 0 ; i < nums.length ; ++i) {
            nums[i] = Integer.valueOf(strArr[i]);
        }
        int slow = 0, fast = 0;
        while(fast < nums.length) {
            if(slow < fast && nums[slow] % 2 == 0) {
                ++slow;
                continue;
            }
            if(nums[fast] % 2 == 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                ++slow;
                ++fast;
            } else {
                ++fast;
            }
        }
        for(int i = 0 ; i < nums.length ; ++i) {
            System.out.print(nums[i] + " ");
        }
        return;
    }
}

