import java.io.*;
import java.util.*;

public class Main {
    public static int __gcd(int n, int k) {
        if(k == 0) {
            return n;
        }
        return __gcd(k, n % k);
    }
    public static void rotateByK(int[] nums, int k) {
        int n = nums.length;
        int gcd = __gcd(n, k);
        for(int i = 0 ; i < gcd ; ++i) {
            int temp = nums[i];
            int l = i;
            int j = (i - k + n) % n;
            while(j != i) {
                nums[l] = nums[j];
                l = j;
                j = (l - k + n) % n;
            }
            nums[l] = temp;
        }
    }
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
        int k = Integer.valueOf(scn.nextLine());
        rotateByK(nums, k);
        for(int i = 0 ; i < nums.length ; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
