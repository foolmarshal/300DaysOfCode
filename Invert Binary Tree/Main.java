import java.io.*;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    public static TreeNode invert(TreeNode root) {
        if(root != null) {
            TreeNode left = invert(root.left);
            TreeNode right = invert(root.right);
            root.left = right;
            root.right = left;
        }
        return root;
    }

    public static void main(String[] args) {
        // Insert Your Code Here. Here are the steps to get started: 
        // Step-I: Define the input format using the examples from the problem description. 
        // Step-II: Parse input from standard in. 
        // Step-III: Write your algorithm to generate the required output. 
        // Note: In case of any issues use #feedback channel on Discord. 
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(str.equals("[]")) {
            System.out.println("[]");
            return;
        }
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        int[] nums = new int[strArr.length];
        for(int i = 0 ; i < strArr.length ; ++i) {
            nums[i] = Integer.valueOf(strArr[i]);
        }
        TreeNode root = new TreeNode(nums[0]);
        Map<Integer, TreeNode> map = new HashMap<>();
        map.put(0, root);
        for(int i = 0 ; i < nums.length ; ++i) {
            TreeNode curNode = map.get(i);
            TreeNode leftChild = 2*i + 1 < nums.length ? new TreeNode(nums[2*i + 1]) : null;
            TreeNode rightChild = 2*i + 2 < nums.length ? new TreeNode(nums[2*i + 2]) : null;
            curNode.left = leftChild;
            curNode.right = rightChild;
            map.put(2*i + 1, leftChild);
            map.put(2*i + 2, rightChild);
        }
        root = invert(root);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode cur = q.remove();
            System.out.print(cur.val + " ");
            if(cur.left != null) {
                q.add(cur.left);
            }
            if(cur.right != null) {
                q.add(cur.right);
            }
        }
    }
}